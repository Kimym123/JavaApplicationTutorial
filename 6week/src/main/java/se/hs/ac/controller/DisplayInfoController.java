package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import se.hs.ac.response.DisplayInfoDetilResponse;
import se.hs.ac.response.ProductResponse;
import se.hs.ac.service.DisplayInfoService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DisplayInfoController {
    private final DisplayInfoService displayInfoService;

    @GetMapping("products")
    public ProductResponse getDisplayInfo(@RequestParam(name = "categoryId", required = false, defaultValue = "3") int categoryId,
                                          @RequestParam(name = "limit", required = false, defaultValue = "0") int start,
                                          @RequestParam(name = "productCount", required = false, defaultValue = "4") int productCount) {
        if (categoryId==0){
            return displayInfoService.getDisplayInfoAll();
        }
        return displayInfoService.getProductList(categoryId, start, productCount);
    }

    @GetMapping(("/displayinfos/{displayInfoId}"))
    public DisplayInfoDetilResponse getDisplayInfoDetail(@RequestParam(name = "type", required = false, defaultValue = "ma") String type,
                                                         @RequestParam(name = "id", required = false, defaultValue = "1") int id,
                                                         @PathVariable(name = "displayInfoId") int displayInfoId) {
        return displayInfoService.getDisplayinfo(type, id, displayInfoId);
    }


}
