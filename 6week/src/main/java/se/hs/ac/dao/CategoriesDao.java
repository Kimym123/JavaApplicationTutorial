package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.Categories;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static se.hs.ac.util.SQL.*;

@Repository
public class CategoriesDao {
    // 바인딩 때 문자열로 매핑하는 NamedParameterJdbcTemplate
    private final NamedParameterJdbcTemplate jdbc;

    // 모든 Bean Property 를 담아주는 RowMapper 을 자동으로 생성해주는 BeanPropertyRowMapper 객체.
    // Bean Property 를 기반으로 RowMapper 를 생성한다.
    // RowMapper 은 jdbc 의 reowMapper와 역할이 같다. 그 역할은, 테이블 행마다 resultSet 객체를 통해 매핑하는 것을 가능하게 하는 객체이다.
    private final RowMapper<Categories> rowMapper = BeanPropertyRowMapper.newInstance(Categories.class);

    // insert 를 위한 객체 >> dataSource 로 DB 에 접근해서 reservation 라는 이름의 카테고리에 insert 할 것이라고 명시한다.
    private final SimpleJdbcInsert insertAction;

    // 스프링 4 부터는 객체가 Bean 객체라면 Autowired 없이 DI 주입이 가능하다.
    // DataSource 는 커넥션 풀의 Connection 을 관리하기 위한 객체이다.
    public CategoriesDao(DataSource dataSource) {
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
        // dataSource 로 DB에 접근해서 reservation 라는 이름의 카테고리에 insert 할 것이라고 명시한다.
        this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("category")
                .usingGeneratedKeyColumns("id");
    }

    public long countCategories() {
        // 한 줄의 열을 처리한다.
        return jdbc.queryForObject(COUNT_CATEGORIRES, Collections.<String, Object>emptyMap(), Integer.class);
    }

    public List<Categories> selectCategories(){
        return jdbc.query(SELECT_CATEGORIRES, Collections.<String, Object>emptyMap(), rowMapper);
    }
}
