package com.example.htimesheet.Repositories;


import com.example.htimesheet.Models.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet,String> {
}
