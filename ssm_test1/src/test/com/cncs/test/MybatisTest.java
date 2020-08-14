package com.cncs.test;

import com.cncs.dao.AccountDao;
import com.cncs.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        InputStream in= Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=factory.openSession();
        //获取代理对象
        AccountDao accountDao= sqlSession.getMapper(AccountDao.class);
        //查找所有
//        List<Account> accounts = accountDao.findAll();
//        System.out.println(accounts);
        //保存用户
        Account account=new Account();
        account.setName("晓春");
        account.setMoney(189.8d);
        accountDao.saveAccount(account);
        //提交
        sqlSession.commit();
    }
}
