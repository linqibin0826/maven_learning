package com.linqibin.imperial.court.service;

import com.linqibin.imperial.court.entity.Emp;

public interface EmpService {

    /**
     *  获取用户
     * @param loginAccount
     * @param loginPassword
     * @return
     */
    Emp getEmpByLogin(String loginAccount, String loginPassword);
}
