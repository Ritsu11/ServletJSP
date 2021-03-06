package jp.co.chapter5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.tool.Page;

@WebServlet(urlPatterns = { "/chapter5/total" })
public class Total extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        try {
            req.setCharacterEncoding("UTF-8");
            int price = Integer.parseInt(req.getParameter("price"));
            int count = Integer.parseInt(req.getParameter("count"));

            Page.header(out);
            out.println(price + "円 *");
            out.println(count + "個 =");
            out.println(price * count + "円");
            Page.footer(out);

        } catch (NumberFormatException e) {
            out.println("数値を入力してください");
        }
    }
}
