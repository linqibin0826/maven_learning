package com.linqibin.imperial.court.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import lombok.extern.slf4j.Slf4j;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Properties;

/**
 * @author lqb
 * @date 2022/6/18
 */
@Slf4j
public class JdbcUtils {

    /**
     * 将数据源对象设置为静态属性，保证大对象的单一实例
     */
    private static DataSource dataSource;

    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    static {
        // 1.创建一个用于存储外部属性文件信息的Properties对象
        Properties properties = new Properties();
        // 2.使用当前类的类加载器加载外部属性文件：jdbc.properties
        InputStream inputStream =
                JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            // 3.将外部属性文件jdbc.properties中的数据加载到properties对象中
            properties.load(inputStream);
            // 4.创建数据源对象
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接
     *
     * @return 连接对象
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = threadLocal.get();
            if (connection == null) {
                connection = dataSource.getConnection();
                // 放进ThreadLocal， 让该线程所有方法使用该连接，用于管理数据库事务
                threadLocal.set(connection);
            }
        } catch (SQLException throwable) {
            log.error("获取数据库连接对象发生异常，错误信息：{}", throwable.getMessage());
            throw new RuntimeException(throwable);
        }
        return connection;
    }

    /**
     * 释放数据库连接对象
     *
     * @param connection 要释放的连接对象
     */
    public static void releaseConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                threadLocal.remove();
            } catch (SQLException e) {
                log.error("释放数据库连接对象时发生异常，异常信息：{}", e.getMessage());
            }
        }
    }


}
