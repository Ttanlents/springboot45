package com.yjf.test;

import com.yjf.App;
import com.yjf.autoConfigruatuinProperties.TestAutoConfigProperties;
import com.yjf.entity.Testutils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @author 余俊锋
 * @date 2020/10/21 11:20
 * @Description
 */
//@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
//默认使用junit 5
// 如果非要使用junit 4作为测试就添加@RunWith注解
public class demo {

    @Autowired
    private Testutils testutils;
    @Autowired
    private DataSource dataSource;
    @Autowired
    TestAutoConfigProperties testAutoConfigProperties;
    @Test
    public void myTest(){
        testutils.demo();
        System.out.println(testAutoConfigProperties.getPath());
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
