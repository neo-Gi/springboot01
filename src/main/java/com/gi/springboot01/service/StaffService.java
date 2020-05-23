package com.gi.springboot01.service;

import com.gi.springboot01.dao.StaffDao;
import com.gi.springboot01.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    @Autowired
    private StaffDao staffDao;

    public Staff getStaffByStaffId(String staffId) {
        return staffDao.getStaffByStaffId(staffId);
    }
}
