package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.DisplayInfos;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static se.hs.ac.util.SQL.COUNT_DISPLAY_INFOS;
import static se.hs.ac.util.SQL.SELECT_DISPLAY_INFOS;

@Repository
public class DisplayInfosDao {

    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<DisplayInfos> rowMapper = BeanPropertyRowMapper.newInstance(DisplayInfos.class);

    public DisplayInfosDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);

    }

    public long countDisplayInfos(long categoryId) {
        Map<String, ?> params = Collections.singletonMap("category_id", categoryId);
        return jdbc.queryForObject(COUNT_DISPLAY_INFOS, params, long.class);
    }

    public List<DisplayInfos> selectDisplayInfo(long categoryId, long displayInfoCount) {
        Map<String, ?> params = Collections.singletonMap("category_id", categoryId);
        return jdbc.query(SELECT_DISPLAY_INFOS + displayInfoCount, params, rowMapper);
    }

}
