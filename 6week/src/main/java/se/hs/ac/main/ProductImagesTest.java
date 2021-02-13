package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.ProductImagesDao;
import se.hs.ac.dto.ProductImages;

import java.util.List;

public class ProductImagesTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ProductImagesDao productImagesDao = context.getBean(ProductImagesDao.class);

        long displayInfoId = 1;

        List<ProductImages> productImagesList = productImagesDao.selectProductImages(displayInfoId);

        for (ProductImages productImages : productImagesList) {
            System.out.println("\t\t{");
            System.out.println("\t\t\tproductId : " + productImages.getProductId());
            System.out.println("\t\t\tproductImageId : " + productImages.getProductImageId());
            System.out.println("\t\t\ttype : " + productImages.getType());
            System.out.println("\t\t\tfileId : " + productImages.getFileId());
            System.out.println("\t\t\tfileName : " + productImages.getFileName());
            System.out.println("\t\t\tsaveFileName : " + productImages.getSaveFileName());
            System.out.println("\t\t\tcontentType : " + productImages.getContentType());
            System.out.println("\t\t\tdeleteFlag : " + productImages.getDeleteFlag());
            System.out.println("\t\t\tcreateDate : " + productImages.getCreateDate());
            System.out.println("\t\t\tmodifyDate : " + productImages.getModifyDate());
            System.out.println("\t\t}");

        }
    }
}
