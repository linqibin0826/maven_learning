package com.linqibin.imperial.court.dao.api;

import com.linqibin.imperial.court.entity.Emp;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public interface EmpDao {

    /**
     * 获取用户信息
     * @param loginAccount
     * @param loginPassword
     * @return
     */
    Emp selectEmpByLoginAccount(String loginAccount, String loginPassword);
}
