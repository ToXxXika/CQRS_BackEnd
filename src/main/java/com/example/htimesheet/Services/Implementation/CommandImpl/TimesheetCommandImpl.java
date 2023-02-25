package com.example.htimesheet.Services.Implementation.CommandImpl;


import com.example.htimesheet.Models.Timesheet;
import com.example.htimesheet.Repositories.TimesheetRepository;
import com.example.htimesheet.Services.CommandServices.TimesheetCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimesheetCommandImpl implements TimesheetCommandService {

    @Autowired
     private TimesheetRepository TimesheetRepo ;

    private TacheCommandImpl tacheCommand ;
    @Override
    public boolean Create_timesheet(Timesheet T) {
        try{
            TimesheetRepo.save(T);
            return true ;
        }catch (Exception E ){
            System.out.println(E.getMessage());
            return false ;
        }
    }

    @Override
    public boolean Supprimer_timesheet(String reference) {
        try{
            TimesheetRepo.deleteById(reference);

         return true ;
        }catch (Exception E){
            System.out.println(E.getMessage());
            return false ;
        }

    }

    @Override
    public boolean update_Timesheet(String Ref) {
        try {
         //   TimesheetRepo.
            return true ;
        }catch (Exception E ){
            System.out.println(E.getMessage());
            return false;
        }
    }
}
