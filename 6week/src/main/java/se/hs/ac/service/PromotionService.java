package se.hs.ac.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.PromotionDao;
import se.hs.ac.dto.Promotion;
import se.hs.ac.response.SizeItemsResponse;

@RequiredArgsConstructor
@Service
public class PromotionService {
    private final PromotionDao promotionDao;

    public SizeItemsResponse<Promotion> getPromotion(){
        return new SizeItemsResponse(promotionDao.selectPromotionCount(), promotionDao.selectPromotion());
    }
}
