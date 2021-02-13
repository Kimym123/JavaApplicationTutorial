package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductPrices {
    private Long id;
    private Long productId;
    private String priceTypeName;
    private Long price;
    private Long discountRate;
    private String createDate;
    private String modifyDate;
}
