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

@WebServlet(urlPatterns = { "/chapter6/checkbox" })
public class Checkbox extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        req.setCharacterEncoding("UTF-8");
        String[] genre = req.getParameterValues("genre");

        Page.header(out);
        if (Objects.nonNull(genre)) {
            for (String item : genre) {
                out.println("「" + item + "’」");
            }
            out.println("に関するお買い得情報を送りします。");
        } else {
            out.println("お買い得情報はお送りしません。");
        }
        Page.footer(out);
    }
}
