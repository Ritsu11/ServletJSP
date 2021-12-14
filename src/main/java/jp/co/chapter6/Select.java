package jp.co.chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.tool.Page;

@WebServlet(urlPatterns = { "/chapter6/select" })
public class Select extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        req.setCharacterEncoding("UTF-8");
        String count = req.getParameter("count");
        String payment = req.getParameter("payment");
        String review = req.getParameter("review");
        String mail = req.getParameter("mail");

        Page.header(out);
        out.println("<p>" + count + "個の商品をカートに入れました</p>");
        out.println("<p>お支払方法を" + payment + "に設定しました</p>");
        out.println("<p>ご感想ありがとうございます。</p>");
        out.println("<p>「" + review + "」</p>");

        if (Objects.nonNull(mail)) {
            out.println("<p>メールを送りします。</p>");
        } else {
            out.println("<p>メールを送りしません。</p>");
        }
        Page.footer(out);
    }
}
