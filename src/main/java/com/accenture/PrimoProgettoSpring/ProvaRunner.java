package com.accenture.PrimoProgettoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.accenture.PrimoProgettoSpring.bean.Computer;
import com.accenture.PrimoProgettoSpring.bean.Persona;
import com.accenture.PrimoProgettoSpring.config.AppConfig;

@Component
public class ProvaRunner implements CommandLineRunner {

    @Autowired //a differenza di ieri quando istanziavamo direttamente un oggetto del contesto e poi usavamo il getBean, ora usiamo Autowired.
                //Spring in automatico assegna alla variabile p un oggetto Persona presente nel contesto. Se non è presente, va in eccezione
    private Persona p;

    @Autowired(required = false) // required false serve perchè se non trova la persona cercata, non va in eccezione
    @Qualifier("Francesco")
    private Persona p2;

    @Autowired
    private Computer computer;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(p);

        System.out.println( p2);

        System.out.println(computer);
        
    }
    
}
