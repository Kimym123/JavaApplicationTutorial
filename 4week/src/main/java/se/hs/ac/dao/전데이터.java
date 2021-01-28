//package se.hs.ac.dao;
//
//import se.hs.ac.dto.BusinessCard;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class UserDao {
//    private final static String dbURL = "jdbc:mysql://localhost:3306/CallingCard?useSSL=false";
//    private final static String dbUser = "root";
//    private final static String dbPassword = "0000";
//
//    public int addUser(BusinessCard businessCard) {
//        int insertCount = 0;
//
//        Connection conn = null;
//        PreparedStatement ps = null;
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//
//            String sql = "insert into user (userName, userPhone, userCompany) values(?,?,?)";
//
//            ps = conn.prepareStatement(sql);
//
//            ps.setString(1, businessCard.getUserName());
//            ps.setString(2, businessCard.getUserPhone());
//            ps.setString(3, businessCard.getUserCompany());
//
//            insertCount = ps.executeUpdate();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            if (ps != null) {
//                try {
//                    ps.close();
//                } catch (Exception ex) {
//
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (Exception ex) {
//
//                }
//            }
//        }
//        return insertCount;
//    }
//
//    public List<BusinessCard> getUsers() {
//        List<BusinessCard> list = new ArrayList<>();
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        String sql = "select userName, userPhone, userCompany from user";
//
//        try (Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
//             PreparedStatement ps = conn.prepareStatement(sql)) {
//
//            try (ResultSet rs = ps.executeQuery()) {
//                while (rs.next()) {
//                    String name = rs.getString(1);
//                    String phone = rs.getString(2);
//                    String company = rs.getString(3);
//                    BusinessCard businessCard = new BusinessCard(name, phone, company);
//                    list.add(businessCard);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return list;
//    }
//}
