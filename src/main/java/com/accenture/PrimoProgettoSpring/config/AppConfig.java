package com.accenture.PrimoProgettoSpring.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.accenture.PrimoProgettoSpring.bean.Persona;

@Configuration
@PropertySource(value = "application.properties")
public class AppConfig {

    @Bean(name = "Mario")
    @Primary //serve per definire un oggetto Persona di default, per cui se viene cercato un oggetto persona non specifico, viene fornito questo annotato con primary 
    public Persona getPersona(@Value("${persona.nome}") String nome){
        Persona p = new Persona();
        p.setNome(nome);
        p.setCognome("Rossi");
        p.setIndirizzo("Via Roma");
        p.setDataNascita(LocalDate.of(2000, 5, 10));

        return p;
    }

    @Bean(name = "Francesca")
    public Persona getPersona2(){
        Persona p = new Persona();
        p.setNome("Francesca");
        p.setCognome("Verdi");
        p.setIndirizzo("Via Roma");
        p.setDataNascita(LocalDate.of(2000, 5, 10));

        return p;
    }
    
}
