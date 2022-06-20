package com.linqibin.imperial.court.service.api;

import com.linqibin.imperial.court.entity.Emp;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public interface EmpService {

    /**
     * 登录
     * @return
     * @param loginAccount
     * @param loginPassword
     */
    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
