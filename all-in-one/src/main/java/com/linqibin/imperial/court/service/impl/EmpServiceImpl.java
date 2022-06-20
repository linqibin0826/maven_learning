package com.linqibin.imperial.court.service.impl;

import com.linqibin.imperial.court.dao.api.EmpDao;
import com.linqibin.imperial.court.dao.impl.EmpDaoImpl;
import com.linqibin.imperial.court.entity.Emp;
import com.linqibin.imperial.court.exception.LoginFailedException;
import com.linqibin.imperial.court.service.api.EmpService;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public class EmpServiceImpl implements EmpService {

    private final EmpDao empDao = new EmpDaoImpl();

    @Override
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword) {
        if (StringUtils.isNotBlank(loginAccount) && StringUtils.isNotBlank(loginPassword)) {
            return empDao.selectEmpByLoginAccount(loginAccount, loginPassword);
        }
        throw new LoginFailedException("用户名或密码不可为空。");
    }
}
