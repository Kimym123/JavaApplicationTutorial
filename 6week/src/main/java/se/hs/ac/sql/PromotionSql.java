package se.hs.ac.sql;

public class PromotionSql {
    public static final String COUNT_PROMOTIONS="select count(*) from promotion";

    public static final String SELECT_PROMOTIONS =
            "select pro.id as id, p.id as product_id, p.category_id, c.name as category_name, p.description, f.id as fileId\n" +
            "from product as p, category as c, file_info as f, product_image as pi, promotion as pro\n" +
            "where pro.product_id = p.id and p.category_id=c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma'";

}
