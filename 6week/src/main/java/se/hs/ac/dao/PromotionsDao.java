package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.Promotions;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;

import static se.hs.ac.util.SQL.COUNT_PROMOTIONS;
import static se.hs.ac.util.SQL.SELECT_PROMOTIONS;

@Repository
public class PromotionsDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<Promotions> rowMapper = BeanPropertyRowMapper.newInstance(Promotions.class);

    public PromotionsDao(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<Promotions> selectPromotions(){
        return jdbc.query(SELECT_PROMOTIONS, Collections.<String, Object>emptyMap(),rowMapper);
    }

    public long countPromotions(){
        return jdbc.queryForObject(COUNT_PROMOTIONS,Collections.<String, Object>emptyMap(),long.class);
    }



}
