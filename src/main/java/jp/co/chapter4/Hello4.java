package jp.co.chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.tool.Page;

@WebServlet(urlPatterns = { "/chapter4/hello4" })
public class Hello4 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        Page.header(out);

        out.println("<p>Hello!</p>");
        out.println("<p>こんにちは</p>");
        out.println("<p>" + new java.util.Date() + "</p>");

        Page.footer(out);
    }
}
