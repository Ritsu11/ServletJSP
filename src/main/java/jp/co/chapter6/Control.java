package jp.co.chapter6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.tool.Page;

@WebServlet(urlPatterns = { "/chapter6/control" })
public class Control extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        Page.header(out);

        req.setCharacterEncoding("UTF-8");
        List<String> names = Collections.list(req.getParameterNames());

        for (String name : names) {
            String[] values = req.getParameterValues(name);

            for (String value : values) {
                out.println("<p>" + name + "=" + value + "</p>");
            }
        }

        Page.footer(out);
    }
}
