package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.DisplayInfoImagesDao;
import se.hs.ac.dto.DisplayInfoImages;

import java.util.List;

public class DisplayInfoImageTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DisplayInfoImagesDao displayInfoImagesDao = context.getBean(DisplayInfoImagesDao.class);

        long displayInfoId =1;

        List<DisplayInfoImages> displayInfoImages = displayInfoImagesDao.selectDisplayInfoImages(displayInfoId);

        for (DisplayInfoImages displayInfoImages1 : displayInfoImages){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : " + displayInfoImages1.getId());
            System.out.println("\t\t\tdisplayInfoId : " + displayInfoImages1.getDisplayInfoId());
            System.out.println("\t\t\tfileId : " + displayInfoImages1.getFileId());
            System.out.println("\t\t\tfileName : " + displayInfoImages1.getFileName());
            System.out.println("\t\t\tsaveFileName : " + displayInfoImages1.getSaveFileName());
            System.out.println("\t\t\tcontentType : " + displayInfoImages1.getContentType());
            System.out.println("\t\t\tdeleteFlag : " + displayInfoImages1.getDeleteFlag());
            System.out.println("\t\t\tcreateDate : " + displayInfoImages1.getCreateDate());
            System.out.println("\t\t\tmodifyDate : " + displayInfoImages1.getModifyDate());
            System.out.println("\t\t}");

        }




    }
}
