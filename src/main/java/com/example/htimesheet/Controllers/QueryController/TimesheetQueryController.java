package com.example.htimesheet.Controllers.QueryController;


import com.example.htimesheet.Models.Timesheet;
import com.example.htimesheet.Services.Implementation.QueryImpl.TimesheetQueryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class TimesheetQueryController {

    @Autowired
    TimesheetQueryImpl timesheetQuery ;

    @GetMapping("/getTimesheets")
    public List<Timesheet> getAll(){
       return   timesheetQuery.getAllTimeSheets();
    }
}
