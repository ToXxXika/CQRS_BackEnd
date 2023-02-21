package com.example.htimesheet.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "timesheet")
@Table(name = "timesheet")
public class Timesheet  {
    @Id
    public String Reference ;

    @Column(name = "description")
    public String description ;
    @Column(name = "date")
    public String date ;
    @Column(name = "etat")
    public String etat ;
    @Column(name = "tache")
    public String tache ;
    @Column(name = "employe")
    public String employe ;


    @OneToMany(mappedBy = "timesheet1", cascade = CascadeType.ALL, orphanRemoval = true)

    private List<Tache> taches;

}
