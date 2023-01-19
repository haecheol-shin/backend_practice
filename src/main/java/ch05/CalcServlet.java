package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc") // /jwbook (context parameter(or path) )�� �ۼ����� �ʴ´�.
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1 = Integer.parseInt(request.getParameter("n1")); // getParameter ���ϰ��� ���ڿ��̱� ������ int������ ��ȯ
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String op = request.getParameter("op");
		
		long result = 0;
		
		switch(op) {
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2>���� ����</h2><hr>")
		.append("��� ���: "+result+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
