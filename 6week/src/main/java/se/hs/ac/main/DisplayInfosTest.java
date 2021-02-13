package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.DisplayInfosDao;
import se.hs.ac.dto.DisplayInfos;


import java.util.List;

public class DisplayInfosTest {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DisplayInfosDao displayInfosDao = context.getBean(DisplayInfosDao.class);

        long categoryID=3;
        long displayInfoCount =4;

        List<DisplayInfos> displayInfos = displayInfosDao.selectDisplayInfo(categoryID, displayInfoCount);

        System.out.println("{");
        System.out.println("\ttotalCount : "+displayInfosDao.countDisplayInfos(categoryID));
        System.out.println("\tproductCount : " +displayInfoCount);
        System.out.println("\tproducts : [");

        for (DisplayInfos displayInfos1 : displayInfos){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : " + displayInfos1.getId());
            System.out.println("\t\t\tcategoryId : " + displayInfos1.getCategoryId());
            System.out.println("\t\t\tdisplayInfoID : " + displayInfos1.getDisplayInfoId());
            System.out.println("\t\t\tname : " + displayInfos1.getName());
            System.out.println("\t\t\tdescription : " + displayInfos1.getDescription());
            System.out.println("\t\t\tcontent : " + displayInfos1.getContent());
            System.out.println("\t\t\tevent : " + displayInfos1.getEvent());
            System.out.println("\t\t\topeningHours : " + displayInfos1.getOpeningHours());
            System.out.println("\t\t\tplaceName : " + displayInfos1.getPlaceName());
            System.out.println("\t\t\tplaceLot : " + displayInfos1.getPlaceLot());
            System.out.println("\t\t\tplaceStreet : " + displayInfos1.getPlaceStreet());
            System.out.println("\t\t\ttel : " + displayInfos1.getTel());
            System.out.println("\t\t\thomepage : " + displayInfos1.getHomepage());
            System.out.println("\t\t\temail : " + displayInfos1.getEmail());
            System.out.println("\t\t\tcreateDate : " + displayInfos1.getCreateDate());
            System.out.println("\t\t\tmodifyDate : " + displayInfos1.getModifyDate());
            System.out.println("\t\t\tfileId : " + displayInfos1.getFileId());
            System.out.println("\t\t}");

        }
    }
}
