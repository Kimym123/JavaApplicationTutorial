package se.hs.ac.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import se.hs.ac.dto.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static se.hs.ac.sql.DisplayInfoSql.*;

@RequiredArgsConstructor
@Repository
public class DisplayInfoDao {
    private final NamedParameterJdbcTemplate jdbc;
    private final RowMapper<DisplayInfo> displayInFoRowMapper = BeanPropertyRowMapper.newInstance(DisplayInfo.class);
    private final RowMapper<ProductImage> productImageRowMapper = BeanPropertyRowMapper.newInstance(ProductImage.class);
    private final RowMapper<DisplayInfoImage> displayInfoImageRowMapper = BeanPropertyRowMapper.newInstance(DisplayInfoImage.class);
    private final RowMapper<ProductPrice> productPriceRowMapper = BeanPropertyRowMapper.newInstance(ProductPrice.class);

    public int selectDisplayInfoCount(int categoryId) {
        Map<String, ?> params = Collections.singletonMap("category_id", categoryId);
        return jdbc.queryForObject(COUNT_DISPLAY_INFOS, params, int.class);
    }

    public List<DisplayInfo> selectDisplayInfo(int categoryId, int start) {
        Map<String, Object> params = new HashMap<>();
        params.put("category_id", categoryId);
        params.put("start", start);
        return jdbc.query(SELECT_DISPLAY_INFOS_LIMIT_FOUR, params, displayInFoRowMapper);
    }

    public List<DisplayInfo> selectDisplayInfoAll() {
        return jdbc.query(SELECT_DISPLAY_INFOS_ALL, Collections.emptyMap(), displayInFoRowMapper);
    }

    public DisplayInfo selectDisPlayInfoId(String type, int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("type", type);
        params.put("id", id);
        return jdbc.queryForObject(SELECT_DISPLAY_INFOS_BY_ID, params, displayInFoRowMapper);
    }

    public List<ProductImage> selectProductImage(String type, int displayInfoId) {
        Map<String, Object> params = new HashMap<>();
        params.put("type", type);
        params.put("id", displayInfoId);

        return jdbc.query(SELECT_PRODUCT_IMAGES, params, productImageRowMapper);
    }

    public List<DisplayInfoImage> selectDisplayInfoImage(int displayInfoId) {
        Map<String, ?> params = Collections.singletonMap("id", displayInfoId);
        return jdbc.query(SELECT_DISPLAY_INFO_IMAGES, params, displayInfoImageRowMapper);
    }

    public int selectAvgScore(int id) {
        Map<String, ?> params = Collections.singletonMap("product_id", id);
        return jdbc.queryForObject(AVG_SCORE, params, int.class);

    }

    public List<ProductPrice> selectProductPrice(int displayInfoId) {
        Map<String, ?> params = Collections.singletonMap("id", displayInfoId);
        return jdbc.query(SELECT_PRODUCT_PRICES, params, productPriceRowMapper);
    }

}
