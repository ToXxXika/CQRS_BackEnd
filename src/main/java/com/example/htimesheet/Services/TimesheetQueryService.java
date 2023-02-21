package com.example.htimesheet.Services;

import com.example.htimesheet.Models.Timesheet;

import java.util.List;

public interface TimesheetQueryService {

    List<Timesheet> getAllTimeSheets();
    Timesheet getTimesheetByRef(String Ref);
}
