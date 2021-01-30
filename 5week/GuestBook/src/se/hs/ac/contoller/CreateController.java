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
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");

		GuestBook guestbook = new GuestBook();

		guestbook.setBbsName(req.getParameter("name"));
		guestbook.setBbsContent(req.getParameter("content"));

		dao.addBbs(guestbook);
		
		resp.sendRedirect("GuestBook");
	}
}
