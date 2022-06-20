package com.linqibin.imperial.court.service.impl;

import com.linqibin.imperial.court.dao.api.MemorialsDao;
import com.linqibin.imperial.court.dao.impl.MemorialsDaoImpl;
import com.linqibin.imperial.court.entity.Memorials;
import com.linqibin.imperial.court.service.api.MemorialsService;

import java.util.List;

/**
 *
 * @author lqb
 * @date 2022/6/19
 */
public class MemorialsServiceImpl implements MemorialsService {

    private final MemorialsDao memorialsDao = new MemorialsDaoImpl();

    @Override
    public List<Memorials> getAllMemorialsDigest() {
        return memorialsDao.selectAllMemorialsDigest();
    }

    @Override
    public Memorials getMemorialsById(String memorialsId) {
        return memorialsDao.selectMemorialsById(memorialsId);
    }

    @Override
    public void updateMemorialsStatusToRead(String memorialsId) {
        memorialsDao.updateMemorialsStatusToRead(memorialsId);
    }

    @Override
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent) {
        memorialsDao.updateMemorialsById(memorialsId, feedbackContent);
    }


}
