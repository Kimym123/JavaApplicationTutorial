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

	public void addGuestBook(GuestBook guestbook) {
		String sql = "insert into guestBook (guestBookName,guestBookContent) values(?,?)";

		try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, guestbook.getGuestBookName());
			ps.setString(2, guestbook.getGuestBookContent());

			ps.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<GuestBook> getGuestBookList() {
		String sql = "select guestBookId, guestBookName, guestBookContent, guestBookDate from guestBook";

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
