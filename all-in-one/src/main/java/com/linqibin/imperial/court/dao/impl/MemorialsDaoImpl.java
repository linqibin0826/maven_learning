package com.linqibin.imperial.court.dao.impl;

import com.linqibin.imperial.court.dao.BaseDao;
import com.linqibin.imperial.court.dao.api.MemorialsDao;
import com.linqibin.imperial.court.entity.Memorials;

import java.time.LocalDate;
import java.util.List;

/**
 * @author lqb
 * @date 2022/6/19
 */
public class MemorialsDaoImpl extends BaseDao<Memorials> implements MemorialsDao {

    @Override
    public List<Memorials> selectAllMemorialsDigest() {
        String sql = "select memorials_id memorialsId," +
                " memorials_title memorialsTitle," +
                " concat(left(memorials_content, 10), '...') memorialsContentDigest," +
                " emp_name memorialsEmpName," +
                " memorials_create_time memorialsCreateTime," +
                " memorials_status memorialsStatus" +
                " from t_memorials m left join t_emp e on m.memorials_emp=e.emp_id;";
        return getBeanList(sql, Memorials.class);
    }

    @Override
    public Memorials selectMemorialsById(String memorialsId) {
        String sql = "select memorials_id memorialsId," +
                " memorials_title memorialsTitle," +
                " memorials_content memorialsContent," +
                " emp_name memorialsEmpName," +
                " memorials_create_time memorialsCreateTime," +
                " memorials_status memorialsStatus," +
                " feedback_time feedbackTime," +
                " feedback_content feedbackContent" +
                " from t_memorials m left join t_emp e on m.memorials_emp = e.emp_id " +
                " where memorials_id=?;";
        return getSingleBean(sql, Memorials.class, memorialsId);
    }

    @Override
    public void updateMemorialsStatusToRead(String memorialsId) {
        String sql = "update t_memorials set memorials_status = 1 where memorials_id=?";
        updateEntity(sql, memorialsId);
    }

    @Override
    public void updateMemorialsById(String memorialsId, String feedbackContent) {
        LocalDate date = LocalDate.now();
        String sql = "update t_memorials set memorials_status = 2, feedback_content = ?, feedback_time = ? where memorials_id = ?";
        updateEntity(sql, feedbackContent, date, memorialsId);
    }


}
