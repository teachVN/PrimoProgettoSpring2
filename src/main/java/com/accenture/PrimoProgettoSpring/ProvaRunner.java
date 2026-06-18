package com.accenture.PrimoProgettoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.accenture.PrimoProgettoSpring.bean.Computer;
import com.accenture.PrimoProgettoSpring.bean.Persona;
import com.accenture.PrimoProgettoSpring.config.AppConfig;
import com.accenture.PrimoProgettoSpring.repository.ComputerRepository;
import com.accenture.PrimoProgettoSpring.repository.PersonaRepository;

@Component
public class ProvaRunner implements CommandLineRunner {

    @Autowired //a differenza di ieri quando istanziavamo direttamente un oggetto del contesto e poi usavamo il getBean, ora usiamo Autowired.
                //Spring in automatico assegna alla variabile p un oggetto Persona presente nel contesto. Se non è presente, va in eccezione
    private Persona p;

    @Autowired(required = false) // required false serve perchè se non trova la persona cercata, non va in eccezione
    @Qualifier("Francesca")
    private Persona p2;

    @Autowired
    private Computer computer;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private ComputerRepository computerRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(p);

        System.out.println( p2);

        System.out.println(computer);

        //personaRepository.save(p);

        //personaRepository.save(p2);

        System.out.println(personaRepository.count());

        System.out.println(personaRepository.findAll());

        //System.out.println(personaRepository.findById(1).orElseThrow());

        //personaRepository.deleteById(1);

        personaRepository.findByNome("Roberto").forEach(p->System.out.println(p));

        personaRepository.findByNomeLikeOrderByCognome("%a").forEach(p->System.out.println(p));

        personaRepository.cercaPersonaPerNome("%a").forEach(p->System.out.println(p));

        computer.setPersona(p);

        computerRepository.save(computer);
        
    }
    
}
