package com.accenture.PrimoProgettoSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.accenture.PrimoProgettoSpring.bean.Persona;

//il repository è responsabile della connessione al db e dei metodi per eseguire le operazioni crud e non solo sul db
public interface PersonaRepository extends JpaRepository<Persona,Integer>{

    public List<Persona> findByNome(String nome);

    public List<Persona> findByNomeLikeOrderByCognome(String nome);

    @Query("select p from Persona p where p.nome like :nome")
    public List<Persona> cercaPersonaPerNome(String nome);
    
}
