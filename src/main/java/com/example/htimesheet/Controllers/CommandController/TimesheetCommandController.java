package com.example.htimesheet.Controllers.CommandController;


import com.example.htimesheet.Models.Timesheet;
import com.example.htimesheet.Services.Implementation.CommandImpl.TimesheetCommandImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@CrossOrigin("*")
@ConditionalOnProperty(name = "app.write.enabled",havingValue = "false")
public class TimesheetCommandController {

    @Autowired
    TimesheetCommandImpl timesheetCommand ;

    @PostMapping("/Ajouter")
    public boolean CreateTimeSheet(@RequestBody Timesheet T){
        return timesheetCommand.Create_timesheet(T);
    }
    @PostMapping("/Supprimer")
    public boolean DeleteTimeSheet(@Param(value = "Ref") String Ref){

        return timesheetCommand.Supprimer_timesheet(Ref);
    }
}
