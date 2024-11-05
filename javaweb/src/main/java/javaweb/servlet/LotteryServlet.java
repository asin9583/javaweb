package javaweb.servlet;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/lottery")
public class LotteryServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 產生電腦選號(四星彩)
				Random random = new Random();
				int n1 = random.nextInt(10); // 0~9 的隨機數
				int n2 = random.nextInt(10); // 0~9 的隨機數
				int n3 = random.nextInt(10); // 0~9 的隨機數
				int n4 = random.nextInt(10); // 0~9 的隨機數	
	
	req.setAttribute("n1", n1);
	req.setAttribute("n2", n2);
	req.setAttribute("n3", n3);
	req.setAttribute("n4", n4);
	
	req.getRequestDispatcher("/WEB-INF/view/lottery.jsp").forward(req, resp);
	}
	public LotteryServlet() {
		
	}

}
