package se.hs.ac.dao;

import se.hs.ac.dto.GuestBook;
import se.hs.ac.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestBookDao {

	public String getDate() {
		String sql = "select now()";
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	public int getId() {
		String sql = "select bbsId from bbs order by bbsId desc";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
			return 1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void addBbs(GuestBook guestbook) {
		String sql = "insert into bbs (bbsId,bbsName,bbsContent,bbsDate) values(?,?,?,?)";

		try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

			ps.setInt(1, getId());
			ps.setString(2, guestbook.getBbsName());
			ps.setString(3, guestbook.getBbsContent());
			ps.setString(4, getDate());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<GuestBook> getGuestBookList() {
		String sql = "select bbsId, bbsName, bbsContent, bbsDate from bbs";

		List<GuestBook> guestBookList = new ArrayList<>();

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String date = rs.getString(4);

				GuestBook guestBook = new GuestBook(id, name, content, date);

				guestBookList.add(guestBook);
			}
			return guestBookList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
