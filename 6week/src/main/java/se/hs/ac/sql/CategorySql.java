package se.hs.ac.sql;

public class CategorySql {
    public static final String SELECT_CATEGORIRES =
            "select c.id, c.name, (select count(*) \n" +
            "from display_info as d, product as p \n" +
            "where p.id = d.product_id and p.category_id = c.id) as count from category as c;";
}
