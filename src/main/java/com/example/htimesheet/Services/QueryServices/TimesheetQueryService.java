package com.example.htimesheet.Services.QueryServices;

import com.example.htimesheet.Models.Timesheet;

import java.util.List;

public interface TimesheetQueryService {

    List<Timesheet> getAllTimeSheets();
    Timesheet getTimesheetByRef(String Ref);
}
