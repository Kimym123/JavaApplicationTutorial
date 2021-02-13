use reservation;
show tables;
desc category;
select * from category;
select * from display_info;
select * from display_info_image;
select * from file_info;
select * from product_image;
select * from product;
select * from product_price;
select * from promotion;
select * from reservation_info;
select * from reservation_info_price;
select * from reservation_user_comment;
select * from reservation_user_comment_image;
select * from user;

# 응답결과 모음

#1 카테고리 목록 구하기----------------------------------------------------------
select count(*) as size from category;

select c.id, c.name, (select count(*) 
from display_info as d, product as p 
where p.id = d.product_id and p.category_id = c.id) as count from category as c;


# 2 상품 목록 단일 >> 화면대로----------------------------------------------------------
select count(*) as totalCount 
from product as p, display_info as di
where p.id = di.product_id and p.category_id=3;

select p.id, p.category_id, d.id as display_info_id ,c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, f.id as file_id
from product as p, display_info as d, category as c, file_info as f, product_image as pi
where p.id = d.id and p.category_id = c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma' and p.category_id=3 limit 4;


#3 프로모션 정보 구하기----------------------------------------------------------
select count(*) from promotion;

select pro.id as id, p.id as product_id, p.category_id, c.name as category_name, p.description, f.id
from product as p, category as c, file_info as f, product_image as pi, promotion as pro
where pro.product_id = p.id and p.category_id=c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma';


#4 전시 정보 구하기----------------------------------------------------------
select p.id, p.category_id, d.id as display_info_id ,c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, f.id
from product as p, display_info as d, category as c, file_info as f, product_image as pi
where p.id = d.id and p.category_id = c.id and f.id=pi.file_id and pi.product_id = p.id and d.id=1 and pi.type='ma';

# 4 전시 정보 중 productImages
select p.id as product_id, pi.id as productImageId, pi.type, pi.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date
from product as p, product_image as pi, file_info as f, display_info as d
where pi.product_id = p.id and pi.file_id = f.id and d.id = p.id and pi.type='ma' and d.id=1;

# 4 전시 정보 중 displayInfoImages
select di.id, di.display_info_id, di.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date
from display_info_image as di, file_info as f, display_info as d
where di.file_id = f.id and d.id = di. id and d.id=1;

# 4 전시 정보 중 avgScore
select avg(score) as avgScore from reservation_user_comment;

# 4 전시 정보 중 product_prices
select pp.id, pp.product_id, pp.price_type_name, pp.price, pp.discount_rate, pp.create_date, pp.modify_date
from product_price as pp, display_info as d
where pp.product_id = d.id and d.id=1 order by pp.id desc;


#5 댓글 목록 구하기 >> 화면대로----------------------------------------------------------
select count(*) from user as u;

select ruc.id, ruc.product_id, ruc.reservation_info_id, ruc.score, u.email, ruc.comment, ruc.create_date, ruc.modify_date
from reservation_user_comment as ruc, user as u
where ruc.id = u.id  order by ruc.id desc limit 5;




#id로 검색

#1 카테고리 목록 구하기
select c.id, c.name, (select count(*) 
from display_info as d, product as p 
where p.id = d.product_id and p.category_id = c.id) as count from category as c;



# 2 상품 목록 단일 >> ID로 검색하는 방법
select p.id, p.category_id, d.id as display_info_id ,c.name, p.description, p.content, p.event, d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, f.id
from product as p, display_info as d, category as c, file_info as f, product_image as pi
where p.id=21 and p.id = d.id and p.category_id = c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma';


#3 프로모션 정보 구하기
select pro.id as id, p.id as product_id, p.category_id, c.name as categoryame, p.description, f.id
from product as p, category as c, file_info as f, product_image as pi, promotion as pro
where pro.product_id = p.id and p.category_id=c.id and f.id=pi.file_id and pi.product_id = p.id and pi.type='ma';




# 4 전시 정보 중 productImages
select p.id as product_id, pi.id as productImageId, pi.type, pi.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date
from product as p, product_image as pi, file_info as f
where p.id=1 and pi.type='ma' and pi.product_id = p.id and pi.file_id = f.id;

# 4 전시 정보 중 displayInfoImages
select di.id, di.display_info_id, di.file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date
from display_info_image as di, file_info as f
where di.id=1 and di.file_id = f.id;

# 4 전시 정보 중 product_prices
select pp.id, pp.product_id, pp.price_type_name, pp.price, pp.discount_rate, pp.create_date, pp.modify_date
from product_price as pp
where pp.id =1;


#5 댓글 목록 구하기 >> ID로 검색
select count(*) from user as u;
select ruc.id, ruc.product_id, ruc.reservation_info_id, ruc.score, u.email, ruc.comment, ruc.create_date, ruc.modify_date
from reservation_user_comment as ruc, user as u
where ruc.id = 12 and ruc.id = u.id;













