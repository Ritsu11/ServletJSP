package jp.co.chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello3 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Servlet/JSP</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<p>Hello</p>");
        out.println("<p>こんにちは！</p>");
        out.println("<p>" + new java.util.Date() + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
