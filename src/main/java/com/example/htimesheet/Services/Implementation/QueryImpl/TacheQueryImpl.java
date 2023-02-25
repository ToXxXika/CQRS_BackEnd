package com.example.htimesheet.Services.Implementation.QueryImpl;


import com.example.htimesheet.Models.Tache;
import com.example.htimesheet.Models.Timesheet;
import com.example.htimesheet.Repositories.TacheRepository;
import com.example.htimesheet.Services.QueryServices.TacheQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheQueryImpl implements TacheQueryService {


    @Autowired
    private TacheRepository tacheRepository;
    private TimesheetQueryImpl timesheetQuery ;
    @Override
    public Tache TacheExist(String Ref) {
        if(tacheRepository.existsById(Ref)){
            return tacheRepository.getReferenceById(Ref);
        }
        return null;
    }

    @Override
    public List<Tache> GetTachesByTimesheet(String Ref) {
        Timesheet T = timesheetQuery.getTimesheetByRef(Ref);

      return null ;
    }

    @Override
    public List<Tache> GetAllTaches(String Ref) {
        return tacheRepository.findAll();
    }
}

