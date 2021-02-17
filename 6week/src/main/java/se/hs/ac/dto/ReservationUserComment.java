package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ReservationUserComment {
    private Long id;
    private Long productId;
    private Long reservationInfoId;
    private Long score;
    private String reservationEmail;
    private String comment;
    private String categoryName;
    private String description;
}
