package com.accenture.PrimoProgettoSpring.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data

@Entity
@Table(name = "persone")
public class Persona {
    
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private String cognome;
    private String indirizzo;
    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    //tutti esempi di dependency injection

    //@Autowired //inietta un oggetto presente nel contesto di Spring implementando la dependency injection
    //private Computer computer;

    //@Autowired //inietta un oggetto presente nel contesto di Spring implementando la dependency injection
    /* public Persona(Computer computer){
        this.computer=computer;
    }

    public Persona(){

    }

    @Autowired //inietta un oggetto presente nel contesto di Spring implementando la dependency injection
    public void setComputer(Computer computer){
        this.computer=computer;
    } */
    
    
       

}
