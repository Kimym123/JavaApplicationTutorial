package se.hs.ac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.PromotionDao;
import se.hs.ac.dto.Promotion;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromotionService {
    private final PromotionDao promotionDao;

    @Autowired
    public PromotionService(PromotionDao promotionDao){
        this.promotionDao = promotionDao;
    }

    public List<Promotion> getPromotions() {
        List<Promotion> list = promotionDao.selectPromotion();
        return list;
    }

    public int getPromotionsCount() {
        return promotionDao.selectPromotionCount();
    }

    public List showPromotion(){
        List list = new ArrayList();
        list.add("size:"+getPromotionsCount());
        list.add("items");
        list.add(getPromotions());
        return list;
    }

}
