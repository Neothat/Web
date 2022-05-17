package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {
	private static Logger logger = LoggerFactory.getLogger(HelloServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().printf("<html><body>");
		resp.getWriter().printf("<h1>Hello World!</h1>");
		resp.getWriter().printf("</body></html>");
		resp.getWriter().close();
	}

	@Override
	public void init() throws ServletException {
		logger.debug("Init");
	}
}