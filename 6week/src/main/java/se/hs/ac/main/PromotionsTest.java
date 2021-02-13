package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.PromotionsDao;
import se.hs.ac.dto.Promotions;

import java.util.List;

public class PromotionsTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        PromotionsDao promotionsDao = context.getBean(PromotionsDao.class);

        List<Promotions> promotions = promotionsDao.selectPromotions();

        System.out.println("{");
        System.out.println("\tsize : "+promotionsDao.countPromotions());
        System.out.println("\titems : [");

        for(Promotions promotions1 : promotions){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : " + promotions1.getId());
            System.out.println("\t\t\tproductId : " + promotions1.getProductId());
            System.out.println("\t\t\tcategoryId : " + promotions1.getCategoryId());
            System.out.println("\t\t\tcategoryName : " + promotions1.getCategoryName());
            System.out.println("\t\t\tdescription : " + promotions1.getDescription());
            System.out.println("\t\t\tfileId : " + promotions1.getFileId());
            System.out.println("\t\t}");
        }

    }
}
