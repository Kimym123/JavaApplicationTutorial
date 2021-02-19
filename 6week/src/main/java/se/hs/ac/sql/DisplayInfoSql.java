package se.hs.ac.sql;

public class DisplayInfoSql {
    public static final String COUNT_DISPLAY_INFOS =
            "select count(*) as totalCount \n" +
            "from product as p, display_info as di\n" +
            "where p.id = di.product_id and p.category_id= :category_id";

    public static final String SELECT_DISPLAY_INFOS_LIMIT_FOUR =
            "select p.id, p.category_id, d.id as display_info_id ,c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, pi.file_id\n" +
            "from product as p, display_info as d, category as c, file_info as f, product_image as pi\n" +
            "where p.id = d.id and p.category_id = c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma' and p.category_id= :category_id limit :start,4 ";

    public static final String SELECT_DISPLAY_INFOS_BY_ID =
            "select p.id, p.category_id, dii.display_info_id , c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, pi.file_id\n" +
            "from product as p, display_info_image as dii, category as c, display_info as d, file_info as f, product_image as pi\n" +
            "where p.id = dii.display_info_id and c.id = p.category_id and p.id = d.id and pi.product_id = p.id and pi.product_id = f.id and pi.type = :type and d.id = :id";

    public static final String SELECT_DISPLAY_INFOS_ALL =
            "select p.id, p.category_id, d.id as display_info_id ,c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, pi.file_id\n" +
            "from product as p, display_info as d, category as c, file_info as f, product_image as pi\n" +
            "where p.id = d.id and p.category_id = c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma'";


    public static final String SELECT_DISPLAY_INFO_IMAGES =
            "select di.id, di.display_info_id, di.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date\n" +
            "    from display_info_image as di, file_info as f, display_info as d\n" +
            "    where di.file_id = f.id and d.id = di. id and d.id= :id;";


    public static final String SELECT_PRODUCT_IMAGES = "select p.id as product_id, pi.id as productImageId, pi.type, pi.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date\n" + "" +
            "from product as p, product_image as pi, file_info as f, display_info as d\n" +
            "where pi.product_id = p.id and pi.file_id = f.id and d.id = p.id and pi.type= :type and d.id= :id";

    public static final String SELECT_PRODUCT_PRICES = "select pp.id, pp.product_id, pp.price_type_name, pp.price, pp.discount_rate, pp.create_date, pp.modify_date\n" +
            "from product_price as pp, display_info as d\n" +
            "where pp.product_id = d.id and d.id=:id order by pp.id desc;";



    public static final String SELECT_USER_COMMENTS_LIMIT_FIVE ="select ruc.id, ruc.product_id, ruc.reservation_info_id, ruc.score, u.email as reservationEmail, ruc.comment, ruc.create_date as categoryName, ruc.modify_date as description\n" +
            "from reservation_user_comment as ruc, user as u\n" +
            "where ruc.id = u.id  order by ruc.id desc limit :limit";
    public static final String COUNT_USER_COMMENTS="select count(*) from user as u";


    public static final String AVG_SCORE="select avg(score) as avgScore " +
            "from reservation_user_comment " +
            "where reservation_user_comment.product_id= :product_id;\n";


}
