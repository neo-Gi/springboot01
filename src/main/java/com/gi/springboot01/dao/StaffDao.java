package com.gi.springboot01.dao;

import com.gi.springboot01.domain.Staff;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffDao {
    Staff getStaffByStaffId(String staffId);
    Staff deleteStaffByStaffId(String staffId);
}