package se.hs.ac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.DisplayInfoDao;
import se.hs.ac.dto.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayInfoService {
    private final DisplayInfoDao displayInfoDao;

    @Autowired
    public DisplayInfoService(DisplayInfoDao displayInfoDao) {
        this.displayInfoDao = displayInfoDao;
    }

    public List<DisplayInfo> getDisplayInfo(String type, int categoryId, int start){
        List<DisplayInfo> list = displayInfoDao.selectDisplayInfo(type, categoryId, start);
        return list;
    }

    public int getDisplayInfoCount(int categoryId){
        return displayInfoDao.selectDisplayInfoCount(categoryId);
    }

    public List showDisplayInfo(String type, int categoryId, int start){
        List list = new ArrayList();
        list.add("totalCount:"+getDisplayInfoCount(categoryId));
        list.add("productCount: 4");
        list.add("products:");
        list.add(getDisplayInfo(type, categoryId, start));
        return list;
    }

    public List showDisplayInfoAll(String type){
        return displayInfoDao.selectDisplayInfoAll(type);
    }

    public DisplayInfo getDisplayInfoId(String type, int displayInfoId){
        DisplayInfo displayInfoIdFind = displayInfoDao.selectDisPlayInfoId(type,displayInfoId);
        return displayInfoIdFind;

    }

    public List<ProductImage> getProductImage(String type, int displayInfoId){
        List<ProductImage> list = displayInfoDao.selectProductImage(type, displayInfoId);
        return list;
    }

    public List<DisplayInfoImage> getDisplayInfoImage(int displayInfoId){
        List<DisplayInfoImage> list = displayInfoDao.selectDisplayInfoImage(displayInfoId);
        return list;
    }

    public int getAvgScore(int id){
        return displayInfoDao.selectAvgScore(id);
    }

    public List<ProductPrice> getProductPrice(int displayInfoId){
        List<ProductPrice> list = displayInfoDao.selectProductPrice(displayInfoId);
        return list;
    }

    public List showDisplayInfoDetail(String type, int displayInfoId, int id){
        List list = new ArrayList();
        list.add(getDisplayInfoId(type, displayInfoId));
        list.add("productImages:");
        list.add(getProductImage(type, displayInfoId));
        list.add("displayInfoImages:");
        list.add(getDisplayInfoImage(displayInfoId));
        list.add("avgScore:"+getAvgScore(id));
        list.add("productPrices");
        list.add(getProductPrice(displayInfoId));
        return list;
    }

    public int getReservationUserCommentCount(){
        return displayInfoDao.selectReservationUserCommentCount();
    }

    public List<ReservationUserComment> getReservationUserComment(int limit){
        List<ReservationUserComment> list = displayInfoDao.selectReservationUserComment(limit);
        return list;
    }

    public List showReservationUserComment(int limit){
        List list = new ArrayList();
        list.add("totalCount:" + getReservationUserCommentCount());
        list.add("commentCount: 5");
        list.add("reservationUserComments");
        list.add(getReservationUserComment(limit));

        return list;
    }

}
