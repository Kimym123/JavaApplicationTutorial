package se.hs.ac.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import se.hs.ac.dto.DisplayInfo;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class ProductResponse {
    private final int totalCount;
    private final int productCount;
    private final List<DisplayInfo> products;
}
