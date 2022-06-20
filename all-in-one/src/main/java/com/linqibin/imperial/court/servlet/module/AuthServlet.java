package com.linqibin.imperial.court.servlet.module;


import com.linqibin.imperial.court.entity.Emp;
import com.linqibin.imperial.court.exception.LoginFailedException;
import com.linqibin.imperial.court.service.api.EmpService;
import com.linqibin.imperial.court.service.impl.EmpServiceImpl;
import com.linqibin.imperial.court.servlet.base.ModelBaseServlet;
import com.linqibin.imperial.court.util.ImperialCourtConst;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 负责登录认证的servlet
 *
 * @author lqb
 * @date 2022/6/19
 */
@WebServlet("/auth")
public class AuthServlet extends ModelBaseServlet {

    private EmpService empService = new EmpServiceImpl();

    /**
     * 登录
     *
     * @param request
     * @param response
     */
    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            // 1、获取请求参数
            String loginAccount = request.getParameter("loginAccount");
            String loginPassword = request.getParameter("loginPassword");
            // 2、调用 EmpService 方法执行登录逻辑
            Emp emp = empService.getEmpByLoginAccount(loginAccount,
                    loginPassword);
            if (emp == null) {
                throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
            }
            // 3、通过 request 获取 HttpSession 对象
            HttpSession session = request.getSession();
            // 4、将查询到的 Emp 对象存入 Session 域
            session.setAttribute(ImperialCourtConst.LOGIN_EMP_ATTR_NAME,
                    emp);
            // 5、前往指定页面视图
            response.sendRedirect(request.getContextPath() + "/work?method=showMemorialsDigestList");
        } catch (Exception e) {
            e.printStackTrace();
            // 6、判断此处捕获到的异常是否是登录失败异常
            if (e instanceof LoginFailedException) {
                // 7、如果是登录失败异常则跳转回登录页面
                // ①将异常信息存入请求域
                request.setAttribute("message", e.getMessage());
                // ②处理视图：index
                processTemplate("index", request, response);
            } else {
                // 8、如果不是登录异常则封装为运行时异常继续抛出
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * 退出
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        // 跳转登录页
        processTemplate("index", request, response);
    }
}

