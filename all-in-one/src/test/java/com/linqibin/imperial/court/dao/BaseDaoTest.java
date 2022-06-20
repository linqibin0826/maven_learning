package com.linqibin.imperial.court.dao;

import com.linqibin.imperial.court.dao.BaseDao;
import com.linqibin.imperial.court.entity.Emp;
import org.junit.Test;

import java.util.List;


/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public class BaseDaoTest {

    @Test
    public void testBaseDao() {
        BaseDao<Emp> dao = new BaseDao<>();
        Emp bean = dao.getSingleBean("select emp_id as empId, emp_name empName, emp_position empPosition, login_account loginAccount, login_password loginPassword from t_emp where emp_id = ?", Emp.class, 1);
    }

    @Test
    public void testBeanList() {
        BaseDao<Emp> dao = new BaseDao<>();
        List<Emp> daoBeanList = dao.getBeanList("select emp_id as empId, emp_name empName, emp_position empPosition, login_account loginAccount, login_password loginPassword from t_emp", Emp.class);
        System.out.println(daoBeanList);
    }

    @Test
    public void testUpdateBean() {
        BaseDao<Emp> dao = new BaseDao<>();
        int entity = dao.updateEntity("update t_emp set login_account = ? where emp_id = ?", "67890", 1);
        System.out.println(entity);
        testBeanList();
    }
}
