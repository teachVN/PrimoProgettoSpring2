package com.accenture.PrimoProgettoSpring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Component //annotazione che implementa l'inversion of control. Spring crea e gestisce interamente oggetti Component
@Entity
public class Computer {

    @Id
    @GeneratedValue
    private Integer id;

    @Value("${computer.nome}")
    private String nome;

    @Value("${computer.marca}")
    private String marca;

    @Value("${computer.costo}")
    private String costo;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "persona_id")
    private Persona persona;
    
}
