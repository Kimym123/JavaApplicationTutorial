package se.hs.ac.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.Promotion;

import java.util.Collections;
import java.util.List;

import static se.hs.ac.sql.PromotionSql.COUNT_PROMOTIONS;
import static se.hs.ac.sql.PromotionSql.SELECT_PROMOTIONS;

@RequiredArgsConstructor
@Repository
public class PromotionDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<Promotion> rowMapper = BeanPropertyRowMapper.newInstance(Promotion.class);

    public List<Promotion> selectPromotion() {
        return jdbc.query(SELECT_PROMOTIONS, Collections.emptyMap(), rowMapper);
    }

    public int selectPromotionCount() {
        return jdbc.queryForObject(COUNT_PROMOTIONS, Collections.emptyMap(), int.class);
    }

}
