package com.atgui;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author hanxn
 * @date 2018/12/19
 */
public class MapperTest {
    private ApplicationContext iocContainer = new ClassPathXmlApplicationContext("config/spring-context.xml");

    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource = iocContainer.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
