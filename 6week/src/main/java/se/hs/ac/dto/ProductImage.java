package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductImage {
    private Long productId;
    private Long productImageId;
    private String type;
    private Long fileId;
    private String fileName;
    private String saveFileName;
    private String contentType;
    private Long deleteFlag;
    private String createDate;
    private String modifyDate;
}
