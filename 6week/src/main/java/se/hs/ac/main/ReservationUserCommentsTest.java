package se.hs.ac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.hs.ac.config.ApplicationConfig;
import se.hs.ac.dao.ReservationUserCommentsDao;
import se.hs.ac.dto.ReservationUserComments;

import java.util.List;

public class ReservationUserCommentsTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ReservationUserCommentsDao reservationUserCommentsDao = context.getBean(ReservationUserCommentsDao.class);

        long commentCount=5;

        List<ReservationUserComments> reservationUserComments = reservationUserCommentsDao.selectReservationUserComments(commentCount);

        System.out.println("{");
        System.out.println("\ttotalCount : "+reservationUserCommentsDao.CountComment());
        System.out.println("\tcommentCount : " +commentCount);
        System.out.println("\treservationUserComments : [");

        for(ReservationUserComments reservationUserComments1 :  reservationUserComments){
            System.out.println("\t\t{");
            System.out.println("\t\t\tid : " + reservationUserComments1.getId());
            System.out.println("\t\t\tproductId : " + reservationUserComments1.getProductId());
            System.out.println("\t\t\treservationInfoId : " + reservationUserComments1.getReservationInfoId());
            System.out.println("\t\t\tscore : " + reservationUserComments1.getScore());
            System.out.println("\t\t\treservationEmail : " + reservationUserComments1.getReservationEmail());
            System.out.println("\t\t\tcomment : " + reservationUserComments1.getComment());
            System.out.println("\t\t\tcategoryName : " + reservationUserComments1.getCategoryName());
            System.out.println("\t\t\tdescription : " + reservationUserComments1.getDescription());
            System.out.println("\t\t}");
        }

    }
}
