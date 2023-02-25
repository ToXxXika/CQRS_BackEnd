package com.example.htimesheet.Services.CommandServices;

import com.example.htimesheet.Models.Timesheet;

public interface TimesheetCommandService {

    boolean Create_timesheet(Timesheet T);
    boolean Supprimer_timesheet(String reference);

    boolean update_Timesheet(String Ref );


}
