package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.CategoriesDao;
import se.hs.ac.dto.Categories;
import se.hs.ac.service.ApiService;

public class test {
    public static void main(String[] args) {
        ApiService apiService = new ApiService();

        System.out.println("{"  );
        System.out.println("\tsize : "+apiService.getCountCategories());
        System.out.println("\titems : [");
        for (Categories category : apiService.getCategoriesList()){
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
