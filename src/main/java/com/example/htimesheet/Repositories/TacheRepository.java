package com.example.htimesheet.Repositories;

import com.example.htimesheet.Models.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache,String> {
}
