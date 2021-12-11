package jp.co.chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/chapter4/hello2" })
public class Hello2 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/plain; charset=UTF-8");

        PrintWriter out = res.getWriter();
        out.println("Hello");
        out.println("こんにちは！");
        out.println(new java.util.Date());
    }
}
