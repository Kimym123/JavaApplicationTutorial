package se.hs.ac.dao;

import se.hs.ac.dto.BusinessCard;
import se.hs.ac.util.DBConnection;

import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BusinessCardDao {

    public void addBusinessCard(BusinessCard businessCard) { // 회원 등록
        String sql = "insert into user (userName, userPhone, userCompany) values(?,?,?)";


        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, businessCard.getUserName());
            ps.setString(2, businessCard.getUserPhone());
            ps.setString(3, businessCard.getUserCompany());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<BusinessCard> getBusinessCard() { // 모두 조회
        List<BusinessCard> list = new ArrayList<>();
        String sql = "select userName, userPhone, userCompany from user";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                String phone = rs.getString(2);
                String company = rs.getString(3);
                BusinessCard businessCard = new BusinessCard(name, phone, company);
                list.add(businessCard);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<BusinessCard> findBusinessCard(String businessCardName) {
        List<BusinessCard> list = new ArrayList<>();
        String sql = "select userName, userPhone, userCompany from user where userName like ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            businessCardName = "%" + businessCardName + "%";
            ps.setString(1, businessCardName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString(1);
                String phone = rs.getString(2);
                String company = rs.getString(3);
                BusinessCard businessCard = new BusinessCard(name, phone, company);
                list.add(businessCard);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void deleteBusinessCard(String businessCardPhone) {
        String sql = "delete from user where userPhone = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, businessCardPhone);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBusinessCard(BusinessCard businessCard, String checkPhone) {
        String sql = "update user set userName=?, userPhone=?, userCompany=? where userPhone = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, businessCard.getUserName());
            ps.setString(2, businessCard.getUserPhone());
            ps.setString(3, businessCard.getUserCompany());
            ps.setString(4, checkPhone);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
