package com.gi.springboot01.controller;

import com.gi.springboot01.domain.Staff;
import com.gi.springboot01.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/StaffController")
public class StaffController {
    @Autowired
    private StaffService staffService;


    @RequestMapping("/getStaffByStaffId/{staffId}")
    public Staff getStaffByStaffId(@PathVariable String staffId) {
        return staffService.getStaffByStaffId(staffId);
    }

    @RequestMapping("/deleteStaffByStaffId/{staffId}")
    public Staff deleteStaffByStaffId(@PathVariable String staffId) {
            return staffService.deleteStaffByStaffId(staffId);
    }
}
