package se.hs.ac.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BusinessCard {
    private String userName;
    private String userPhone;
    private String userCompany;


    @Override
    public String toString() {
        return "BusinessCard{" +
                "Name='" + userName + '\'' +
                ", Phone='" + userPhone + '\'' +
                ", Company='" + userCompany + '\'' +
                '}';
    }
}
