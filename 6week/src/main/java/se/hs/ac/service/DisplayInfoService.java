package se.hs.ac.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.hs.ac.dao.DisplayInfoDao;
import se.hs.ac.dto.DisplayInfo;
import se.hs.ac.response.DisplayInfoDetilResponse;
import se.hs.ac.response.ProductResponse;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DisplayInfoService {
    private final DisplayInfoDao displayInfoDao;

    public ProductResponse getProductList(int categoryId, int start, int productCount) {
        return new ProductResponse(displayInfoDao.selectDisplayInfoCount(categoryId),
                productCount,
                displayInfoDao.selectDisplayInfo(categoryId, start));
    }

    public ProductResponse getDisplayInfoAll() {
        List<DisplayInfo> displayInfos = displayInfoDao.selectDisplayInfoAll();
        return new ProductResponse(displayInfos.size(),
                displayInfos.size(), displayInfos);
    }

        public DisplayInfoDetilResponse getDisplayinfo(String type, int id, int displayInfoId) {
        return new DisplayInfoDetilResponse(displayInfoDao.selectDisPlayInfoId(type, id),
                displayInfoDao.selectProductImage(type, displayInfoId),
                displayInfoDao.selectDisplayInfoImage(displayInfoId),
                displayInfoDao.selectAvgScore(id),
                displayInfoDao.selectProductPrice(displayInfoId));
    }
//    public DisplayInfoDetilResponse getDisplayinfo(String type, int id, int displayInfoId) {
//        DisplayInfo product = displayInfoDao.selectDisPlayInfoId(type, id);
//        return new DisplayInfoDetilResponse.builder()
//                .product(product)
//                .productImages(displayInfoDao.selectProductImage(type, displayInfoId))
//                .displayInfoImages(displayInfoDao.selectDisplayInfoImage(displayInfoId))
//                .avgScroe(displayInfoDao.selectAvgScore(id))
//                .productPrices(displayInfoDao.selectProductPrice(displayInfoId))
//                .build();
//    }
}
