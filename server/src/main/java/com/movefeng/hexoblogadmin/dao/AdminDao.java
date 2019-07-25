package com.movefeng.hexoblogadmin.dao;

import com.movefeng.hexoblogadmin.model.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author z
 */
@Mapper
public interface AdminDao {

    /**
     * 根据名称查询管理员信息
     *
     * @param admin
     * @return
     */
    @Select("select * from admin where username = #{username} and password=#{password}")
    Admin selectAdminByUsernameAndPassword(Admin admin);

    /**
     * 根据名称查询管理员信息
     *
     * @param admin
     * @return
     */
    @Select("select * from admin where username = #{username}")
    Admin selectAdminByUsername(Admin admin);

}