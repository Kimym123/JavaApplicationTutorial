package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.hs.ac.service.PromotionService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PromotionController {
    private final PromotionService promotionService;

    @GetMapping("promotions")
    public List getPromotion(){
        return promotionService.showPromotion();
    }
}
