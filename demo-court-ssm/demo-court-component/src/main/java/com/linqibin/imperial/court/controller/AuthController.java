package com.linqibin.imperial.court.controller;

import com.linqibin.imperial.court.constant.ImperialCourtConst;
import com.linqibin.imperial.court.entity.Emp;
import com.linqibin.imperial.court.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 *
 * @author lqb
 * @date 2022/6/21
 */
@Controller
public class AuthController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/auth/login")
    public String doLogin(
            @RequestParam("loginAccount") String loginAccount,
            @RequestParam("loginPassword") String loginPassword,
            HttpSession session,
            Model model) {
        // 1、尝试查询登录信息
        Emp emp = empService.getEmpByLogin(loginAccount, loginPassword);
        // 2、判断登录是否成功
        if (emp == null) {
            // 3、如果登录失败则回到登录页面显示提示消息
            model.addAttribute("message", ImperialCourtConst.LOGIN_FAILED_MESSAGE);
            return "index";
        } else {
            // 4、如果登录成功则将登录信息存入 Session 域
            session.setAttribute("loginInfo", emp);
            return "target";
        }
    }
}

