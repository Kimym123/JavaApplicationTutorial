package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.ProductPricesDao;
import se.hs.ac.dto.ProductPrices;

import java.util.List;

public class ProductPricesTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ProductPricesDao productPricesDao = context.getBean(ProductPricesDao.class);

        long displayInfoId = 1;

        List<ProductPrices> productPricesList = productPricesDao.selectProductPrices(displayInfoId);

        for (ProductPrices productPrices : productPricesList){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : " + productPrices.getId());
            System.out.println("\t\t\tproductId : " + productPrices.getProductId());
            System.out.println("\t\t\tpriceTypeName : " + productPrices.getPriceTypeName());
            System.out.println("\t\t\tprice : " + productPrices.getPrice());
            System.out.println("\t\t\tdiscountRate : " + productPrices.getDiscountRate());
            System.out.println("\t\t\tcreateDate : " + productPrices.getCreateDate());
            System.out.println("\t\t\tmodifyDate : " + productPrices.getModifyDate());
            System.out.println("\t\t}");
        }

    }
}
