package com.example.htimesheet.Models;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Tache")
@Table(name = "Tache")
public class Tache {
    @Id
    public String Ref_Tache ;
    @Column(name = "description")
    public String description ;
    @Column(name = "date")
    public String date ;
    @Column(name = "etat")
    public String etat ;
    @Column(name = "employe")
    public String employe ;
    @Column(name = "timesheet")
    public String timesheet ;


    @JoinColumn(name = "timesheet", referencedColumnName = "Reference")
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    public Timesheet timesheet1;



}
