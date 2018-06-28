package com.wheejuni.mybatisdemo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SqlSessionTest {

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void session_creation_test() {
        System.out.println("session: " + sqlSession);
    }
}
