package com.linqibin.imperial.court.dao.api;

import com.linqibin.imperial.court.entity.Memorials;

import java.util.List;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public interface MemorialsDao {

    /**
     * 查询所有奏折
     * @return
     */
    List<Memorials> selectAllMemorialsDigest();

    /**
     * 查询详情
     * @param memorialsId
     * @return
     */
    Memorials selectMemorialsById(String memorialsId);

    /**
     * 更新奏折状态
     * @param memorialsId
     */
    void updateMemorialsStatusToRead(String memorialsId);

    /**
     * 批复奏折
     * @param memorialsId
     * @param feedbackContent
     */
    void updateMemorialsById(String memorialsId, String feedbackContent);
}
