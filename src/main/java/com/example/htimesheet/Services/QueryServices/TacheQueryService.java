package com.example.htimesheet.Services.QueryServices;

import com.example.htimesheet.Models.Tache;

import java.util.List;

public interface TacheQueryService {
    Tache TacheExist(String Ref);
    List<Tache> GetTachesByTimesheet(String Ref);
    List<Tache> GetAllTaches(String Ref);
}
