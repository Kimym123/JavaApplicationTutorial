package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.hs.ac.dto.Promotion;
import se.hs.ac.response.SizeItemsResponse;
import se.hs.ac.service.PromotionService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PromotionController {
    private final PromotionService promotionService;

    @GetMapping("promotions")
    public SizeItemsResponse<Promotion> getPromotion() {
        return promotionService.getPromotion();
    }
}
