package com.cncs.test;

import com.cncs.domain.Account;
import com.cncs.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void testSpring() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
    }
}
