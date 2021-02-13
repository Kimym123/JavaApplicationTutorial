package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.CategoriesDao;
import se.hs.ac.dto.Categories;

import java.util.List;

public class CategoriesTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        CategoriesDao categoriesDao = context.getBean(CategoriesDao.class);

        List<Categories> categoriesList = categoriesDao.selectCategories();

        System.out.println("{"  );
        System.out.println("\tsize : "+categoriesDao.countCategories());
        System.out.println("\titems : [");
        for (Categories category : categoriesList){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : "+category.getId());
            System.out.println("\t\t\tname : "+category.getName());
            System.out.println("\t\t\tcount : "+category.getCount());
            System.out.println("\t\t}");
        }
        System.out.println("\t]");
        System.out.println("}");
    }
}
