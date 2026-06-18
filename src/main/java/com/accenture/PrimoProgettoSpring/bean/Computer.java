package com.accenture.PrimoProgettoSpring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component //annotazione che implementa l'inversion of control. Spring crea e gestisce interamente oggetti Component
public class Computer {

    @Value("${computer.nome}")
    private String nome;

    @Value("${computer.marca}")
    private String marca;

    @Value("${computer.costo}")
    private String costo;
    
}
