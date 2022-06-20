package com.linqibin.imperial.court.servlet.module;

import com.linqibin.imperial.court.servlet.base.ViewBaseServlet;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
@WebServlet(value = {"/", "/index.html", "/index"})
@Slf4j
public class PortalServlet extends ViewBaseServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 利用模板引擎 渲染页面
        String templateName = "index";
        processTemplate(templateName, req, resp);
    }
}
