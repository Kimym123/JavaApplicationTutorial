package se.hs.ac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.*;
import se.hs.ac.dto.*;

import java.util.List;

@Service
public class ApiService {
    static ApplicationContext contextCategories = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static CategoriesDao categoriesDao = contextCategories.getBean(CategoriesDao.class);

    static ApplicationContext contextDisplayInfoImages = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static DisplayInfoImagesDao displayInfoImagesDao = contextDisplayInfoImages.getBean(DisplayInfoImagesDao.class);

    static ApplicationContext contextDisplayInfos = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static DisplayInfosDao displayInfosDao = contextDisplayInfos.getBean(DisplayInfosDao.class);

    static ApplicationContext contextProductImage = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static ProductImagesDao productImagesDao = contextProductImage.getBean(ProductImagesDao.class);

    static ApplicationContext contextProductPrices = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static ProductPricesDao productPricesDao = contextProductPrices.getBean(ProductPricesDao.class);

    static ApplicationContext contextPromotions = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static PromotionsDao promotionsDao = contextPromotions.getBean(PromotionsDao.class);

    static ApplicationContext contextReservationUserComments = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    static ReservationUserCommentsDao reservationUserCommentsDao = contextReservationUserComments.getBean(ReservationUserCommentsDao.class);

    // Categories
    @Transactional
    public List<Categories> getCategoriesList() {
        List<Categories> list = categoriesDao.selectCategories();
        return list;
    }

    @Transactional
    public long getCountCategories() {
        long result = categoriesDao.countCategories();
        return result;
    }

    // DisplayInfoImages
    @Transactional
    public List<DisplayInfoImages> getDisplayInfoImagesList(long displayInfoId) {
        List<DisplayInfoImages> list = displayInfoImagesDao.selectDisplayInfoImages(displayInfoId);
        return list;
    }

    // DisplayInfos
    @Transactional
    public List<DisplayInfos> getDisplayInfosList(long categoryId, long limit) {
        List<DisplayInfos> list = displayInfosDao.selectDisplayInfo(categoryId, limit);
        return list;
    }

    @Transactional
    public long getCountDisplayInfos(long categoryId) {
        long result = displayInfosDao.countDisplayInfos(categoryId);
        return result;
    }

    // ProductImages
    @Transactional
    public List<ProductImages> getProductImagesList(long displayInfoId) {
        List<ProductImages> list = productImagesDao.selectProductImages(displayInfoId);
        return list;
    }

    // ProducPrices
    @Transactional
    public List<ProductPrices> getProductPricesList(long displayInfoId) {
        List<ProductPrices> list = productPricesDao.selectProductPrices(displayInfoId);
        return list;
    }

    // Promotions
    @Transactional
    public List<Promotions> getPromotions() {
        List<Promotions> list = promotionsDao.selectPromotions();
        return list;
    }
    @Transactional
    public long getCountPromotions() {
        long result = promotionsDao.countPromotions();
        return result;
    }

    // ReservationUserComments
    @Transactional
    public List<ReservationUserComments> getReservationUserComments(long limit) {
        List<ReservationUserComments> list = reservationUserCommentsDao.selectReservationUserComments(limit);
        return list;
    }
    @Transactional
    public long getCountReservationUserComments(){
        long result = reservationUserCommentsDao.CountComment();
        return result;
    }
}
