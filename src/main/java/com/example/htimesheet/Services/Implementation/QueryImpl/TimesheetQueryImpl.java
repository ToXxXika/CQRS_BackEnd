package com.example.htimesheet.Services.Implementation.QueryImpl;


import com.example.htimesheet.Models.Timesheet;
import com.example.htimesheet.Repositories.TimesheetRepository;
import com.example.htimesheet.Services.QueryServices.TimesheetQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetQueryImpl implements TimesheetQueryService {
    @Autowired
    TimesheetRepository timesheetRepository;
    @Override
    public List<Timesheet> getAllTimeSheets() {
        return timesheetRepository.findAll();
    }

    @Override
    public Timesheet getTimesheetByRef(String Ref) {
        return timesheetRepository.getReferenceById(Ref);
    }
}
