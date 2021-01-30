package se.hs.ac.module;

import se.hs.ac.dao.BusinessCardDao;
import se.hs.ac.dto.BusinessCard;
import se.hs.ac.view.CardView;

import java.util.List;

public class CardModule {

    private final BusinessCardDao dao = new BusinessCardDao();
    private final CardView view = new CardView();


    public void insertBusinessCard(String name, String phone, String company) {
        BusinessCard businessCard = new BusinessCard(name, phone, company);
        dao.addBusinessCard(businessCard);
    }

    public void outputBusinessCard() {
        List<BusinessCard> list = dao.getBusinessCard();

        for (BusinessCard businessCard : list) {
            view.showOutputBusinessCard(businessCard);
        }
    }

    public void findBusinessCard(String businessCardName) {
        List<BusinessCard> list = dao.findBusinessCard(businessCardName);

        for (BusinessCard businessCard : list) {
            view.showOutputBusinessCard(businessCard);
        }
    }

    public void deleteBusinessCard(String businessCardPhone) {
        dao.deleteBusinessCard(businessCardPhone);
    }

    public void updateBusinessCard(String name, String phone, String company, String checkPhone) {
        BusinessCard businessCard = new BusinessCard(name, phone, company);
        dao.updateBusinessCard(businessCard, checkPhone);
    }

}
