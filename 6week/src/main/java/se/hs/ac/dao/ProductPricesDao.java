package se.hs.ac.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.ProductPrices;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static se.hs.ac.util.SQL.SELECT_PRODUCT_PRICES;

@Repository
public class ProductPricesDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<ProductPrices> rowMapper = BeanPropertyRowMapper.newInstance(ProductPrices.class);

    public ProductPricesDao(DataSource dataSource){
        this.jdbc = new NamedParameterJdbcTemplate(dataSource);
    }

    public List<ProductPrices> selectProductPrices(long displayInfoId){
        Map<String, ?> params = Collections.singletonMap("id", displayInfoId);
        return jdbc.query(SELECT_PRODUCT_PRICES, params, rowMapper);
    }


}
