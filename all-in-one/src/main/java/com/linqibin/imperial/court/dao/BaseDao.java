package com.linqibin.imperial.court.dao;

import com.linqibin.imperial.court.util.JdbcUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * 所有Dao的基类
 * @author lqb
 * @date 2022/6/18
 */
@Slf4j
public class BaseDao<T> {

    private final QueryRunner queryRunner = new QueryRunner();

    /**
     * 获取单个实体信息
     * @param sql     sql语句
     * @param tClass  实体的class对象
     * @param params  sql的参数
     * @return
     */
    public T getSingleBean(String sql, Class<T> tClass, Object ...params) {
        try {
            return queryRunner.query(JdbcUtils.getConnection(), sql, new BeanHandler<>(tClass), params);
        } catch (SQLException e) {
            log.error("数据库操作异常, 异常信息:{}", e.getMessage());
        }
        return null;
    }


    /**
     * 获取实体列表
     * @param sql
     * @param tClass
     * @param params
     * @return
     */
    public List<T> getBeanList(String sql, Class<T> tClass, Object ...params) {
        try {
            return queryRunner.query(JdbcUtils.getConnection(), sql, new BeanListHandler<>(tClass), params);
        } catch (SQLException e) {
            log.error("查询列表操作发生异常,异常信息:{}", e.getMessage());
        }
        return null;
    }

    /**
     * 更新单个实体
     * @param sql
     * @return
     */
    public int updateEntity(String sql, Object ...params) {
        try {
            return queryRunner.update(JdbcUtils.getConnection(), sql, params);
        } catch (SQLException e) {
            log.error("更新数据发生异常,异常信息:{}", e.getMessage());
        }
        return 0;
    }


}
