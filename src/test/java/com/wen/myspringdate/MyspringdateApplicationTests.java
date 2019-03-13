package com.wen.myspringdate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyspringdateApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass());
        try  {
            Connection root = dataSource.getConnection("root", "123456");
            System.out.println(root);
                 System.out.println("hello world");
        }catch (Exception e){
            e.getMessage();
        }
//        try (Connection connection = dataSource.getConnection()) {
//            System.out.println(connection);
//        }catch (Exception e){}

    }

    public static void main(String[] args) {
        MyspringdateApplicationTests ss=new MyspringdateApplicationTests();
        MathInterface add=(a,b)->a+b;
        int operate = ss.operate(1, 2, add);
        System.out.println(operate);

    }

    private int operate(int a, int b, MathInterface mathOperation) {
        return mathOperation.addMath(a, b);
    }


}
