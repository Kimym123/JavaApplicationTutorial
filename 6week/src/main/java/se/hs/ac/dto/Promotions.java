package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Promotions {
    private Long id;
    private Long productId;
    private Long categoryId;
    private String categoryName;
    private String description;
    private Long fileId;
}
