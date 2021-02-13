package se.hs.ac.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public enum ApiMenu {
    CATEGORIES("1", "1. 카테고리 목록"),
    DISPLAY_INFOS("2","2. 상품 목록 구하기"),
    PROMOTIONS("3", "3. 프로모션 정보 구하기"),
    DETAILS_DISPLAY_INFOS("4", "4. 전시 정보 구하기"),
    USER_COMMENT("5","5. 댓글 목록 구하기"),
    EXIT("6","6. 종료");

    private final String caseNumber;
    private final String name;

}
