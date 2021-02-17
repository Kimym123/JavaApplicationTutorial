package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DisplayInfo {
    private Long id;
    private Long categoryId;
    private Long displayInfoId;
    private String name; // 카테고리 이름
    private String description; // 공연 이름
    private String content; // 공연 내용
    private String event; //
    private String openingHours; // 공연 날짜
    private String placeName; // 공연 장소
    private String placeLot; // 공연 장소의 주소
    private String placeStreet; // 도로명 주소
    private String tel; // 전번
    private String homepage; //
    private String email; //
    private String createDate;
    private String modifyDate; // 변경된 날짜
    private String fileId;








}
