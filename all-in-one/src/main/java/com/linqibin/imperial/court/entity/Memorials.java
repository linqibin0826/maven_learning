package com.linqibin.imperial.court.entity;

import lombok.Data;

/**
 *
 * @author lqb
 * @date 2022/6/18
 */
@Data
public class Memorials {

    private Integer memorialsId;
    private String memorialsTitle;
    private String memorialsContent;
    /**
     * 奏折摘要数据库没有，这里是为了配和页面显示
     */
    private String memorialsContentDigest;
    private Integer memorialsEmp;
    /**
     * 员工姓名数据库没有，这里是为了配合页面显示
     */
    private String memorialsEmpName;
    private String memorialsCreateTime;
    private String feedbackTime;
    private String feedbackContent;
    private Integer memorialsStatus;

}
