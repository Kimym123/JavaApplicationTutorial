package se.hs.ac.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import se.hs.ac.service.DisplayInfoService;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DisplayInfoController {
    private final DisplayInfoService displayInfoService;

    @GetMapping("products")
    public List getDisplayInfo(@RequestParam(name = "type", required = false, defaultValue = "ma") String type,
                               @RequestParam(name = "categoryId", required = false, defaultValue = "3") int categoryId,
                               @RequestParam(name = "limit", required = false, defaultValue = "0") int start) {


        // @@@@@@@@@@@@ categoryId 가 null 일 경우는 어떻게 구현해야할까?
        if (categoryId == 0) {
            return displayInfoService.showDisplayInfoAll(type);
        }
        return displayInfoService.showDisplayInfo(type, categoryId, start);
    }

    @GetMapping(("/displayinfos/{displayInfoId}"))
    public List getDisplayInfoDetail(@RequestParam(name = "type", required = false, defaultValue = "ma") String type,
                                     @RequestParam(name = "id", required = false, defaultValue = "1") int id,
                                     @PathVariable(name = "displayInfoId") int displayInfoId){
        return displayInfoService.showDisplayInfoDetail(type, displayInfoId, id);
    }

    @GetMapping("/displayinfos")
    public  List getReservationUserComment(@RequestParam(value = "commentCount", required = false, defaultValue = "5") int commentCount){
        return displayInfoService.showReservationUserComment(commentCount);
    }
}
