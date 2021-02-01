package se.hs.ac.contoller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import se.hs.ac.dao.GuestBookDao;
import se.hs.ac.dto.GuestBook;

import java.io.IOException;

@WebServlet("/register")

public class CreateController extends HttpServlet {
	private final GuestBookDao dao = new GuestBookDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		GuestBook guestbook = new GuestBook();

		guestbook.setGuestBookName(req.getParameter("name"));
		guestbook.setGuestBookContent(req.getParameter("content"));

		dao.addGuestBook(guestbook);

		resp.sendRedirect("guestBook");
	}

}
