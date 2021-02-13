package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.DisplayInfoImages;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static se.hs.ac.util.SQL.SELECT_DISPLAY_INFO_IMAGES;

@Repository
public class DisplayInfoImagesDao {

    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<DisplayInfoImages> rowMapper = BeanPropertyRowMapper.newInstance(DisplayInfoImages.class);

    public DisplayInfoImagesDao(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<DisplayInfoImages> selectDisplayInfoImages(long displayInfoId){
        Map<String , ? > params = Collections.singletonMap("id", displayInfoId);
        return jdbc.query(SELECT_DISPLAY_INFO_IMAGES, params, rowMapper);
    }

}
