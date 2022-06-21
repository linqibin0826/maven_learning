package com.linqibin.imperial.court.test;

import com.linqibin.imperial.court.entity.Emp;
import com.linqibin.imperial.court.entity.EmpExample;
import com.linqibin.imperial.court.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(value = {"classpath:spring-persist.xml"})
public class CourtTest {

    @Autowired
    private DataSource dataSource;

    private final Logger logger =
            LoggerFactory.getLogger(CourtTest.class);

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testEmpMapper() {
        List<Emp> empList = empMapper.selectByExample(new EmpExample());
        for (Emp emp : empList) {
            System.out.println("emp = " + emp);
        }
    }

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        logger.debug("connection:" + connection.toString());
    }


}
