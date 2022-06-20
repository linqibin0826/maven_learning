package com.linqibin.imperial.court.dao.impl;

import com.linqibin.imperial.court.dao.BaseDao;
import com.linqibin.imperial.court.dao.api.EmpDao;
import com.linqibin.imperial.court.entity.Emp;
import com.linqibin.imperial.court.util.MD5Util;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public class EmpDaoImpl extends BaseDao<Emp> implements EmpDao {

    @Override
    public Emp selectEmpByLoginAccount(String loginAccount, String loginPassword) {
        String sql = "select emp_id as empId, emp_name empName, emp_position empPosition, " +
                "login_account loginAccount, login_password loginPassword " +
                "from t_emp where login_account = ?";
        Emp emp = this.getSingleBean(sql, Emp.class, loginAccount);
        String encode = MD5Util.encode(loginPassword);
        if (emp != null && emp.getLoginPassword().equals(encode)) {
            return emp;
        }
        return null;
    }
}
