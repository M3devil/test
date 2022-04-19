package mysql;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class c3p0Test {
    @Test
//    c3p0
    public void test1() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/user");
        dataSource.setUser("root");
        dataSource.setPassword("pjx123");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
//    druid
    public void test2() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/user");
        dataSource.setUsername("root");
        dataSource.setPassword("pjx123");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
//    读取c3p0.properties配置c3p0连接池
    public void test3() throws Exception {
        ResourceBundle rb = ResourceBundle.getBundle("c3p0");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");
        //创建数据源对象 设置连接参数
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setPassword(password);
        dataSource.setUser(username);
        dataSource.setJdbcUrl(url);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
//    测试配置
    public void test5() throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = app.getBean(DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
