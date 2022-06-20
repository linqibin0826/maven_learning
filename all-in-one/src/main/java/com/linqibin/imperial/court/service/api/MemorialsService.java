package com.linqibin.imperial.court.service.api;

import com.linqibin.imperial.court.entity.Memorials;

import java.util.List;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public interface MemorialsService {
    /**
     * 获取所有奏折
     * @return
     */
    List<Memorials> getAllMemorialsDigest();

    /**
     * 获取详情
     * @param memorialsId
     * @return
     */
    Memorials getMemorialsById(String memorialsId);

    /**
     * 更新奏折状态
     * @param memorialsId
     */
    void updateMemorialsStatusToRead(String memorialsId);

    /**
     * 更新奏折
     * @param memorialsId
     * @param feedbackContent
     */
    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
