package se.hs.ac.contoller;

import se.hs.ac.dao.GuestBookDao;
import se.hs.ac.dto.GuestBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/guestBook")
public class ListController extends HttpServlet {
	private final GuestBookDao dao = new GuestBookDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<GuestBook> list = dao.getGuestBookList();

		req.setAttribute("guestBookList", list);
		req.getRequestDispatcher("/GuestBook.jsp").forward(req, resp);
	}
}
