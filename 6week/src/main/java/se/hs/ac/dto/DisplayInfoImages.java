package se.hs.ac.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DisplayInfoImages {
    private Long id;
    private Long displayInfoId;
    private Long fileId;
    private String fileName;
    private String saveFileName;
    private String contentType;
    private Long deleteFlag;
    private String createDate;
    private String modifyDate;

}
