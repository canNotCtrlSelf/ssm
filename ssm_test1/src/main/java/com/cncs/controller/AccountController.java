package com.cncs.controller;

import com.cncs.domain.Account;
import com.cncs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("findAll执行了");
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
        model.addAttribute("accounts",accounts);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(HttpServletRequest request, HttpServletResponse response, Account account) throws ServletException, IOException {
        System.out.println("saveAccount执行了");
        System.out.println(request.getContextPath());
        accountService.saveAccount(account);
        //request.getRequestDispatcher(request.getContextPath()+"/account/findAll").forward(request,response);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
