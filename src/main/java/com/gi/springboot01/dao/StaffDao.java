package com.gi.springboot01.dao;

import com.gi.springboot01.domain.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffDao {
    /*
    获取员工ID
    */
    Staff getStaffByStaffId(String staffId);
    /*
    删除员工
    */
    Staff deleteStaffByStaffId(String staffId);
    /*
    以下功能未测试
    */
    List<Staff> staffList();
    int insertStaff();
    int updateStaff();
}