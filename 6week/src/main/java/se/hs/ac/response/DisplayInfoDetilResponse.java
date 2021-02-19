package se.hs.ac.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import se.hs.ac.dto.DisplayInfo;
import se.hs.ac.dto.DisplayInfoImage;
import se.hs.ac.dto.ProductImage;
import se.hs.ac.dto.ProductPrice;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Builder
public class DisplayInfoDetilResponse {
    private final DisplayInfo product;
    private final List<ProductImage> productImages;
    private final List<DisplayInfoImage> displayInfoImages;
    private final int avgScroe;
    private final List<ProductPrice> productPrices;
}
