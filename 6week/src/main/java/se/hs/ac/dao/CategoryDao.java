package se.hs.ac.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.Category;

import java.util.Collections;
import java.util.List;

import static se.hs.ac.sql.CategorySql.SELECT_CATEGORIRES;

@RequiredArgsConstructor
@Repository
public class CategoryDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<Category> rowMapper = BeanPropertyRowMapper.newInstance(Category.class);

    public List<Category> selectCategoryList() {
        return jdbc.query(SELECT_CATEGORIRES, Collections.emptyMap(), rowMapper);
    }

}
