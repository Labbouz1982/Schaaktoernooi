package com.capgemini.schaaktoernooi.api;


import com.capgemini.schaaktoernooi.controller.SchaakRepository;
import com.capgemini.schaaktoernooi.model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchakerEndpoint {

    @Autowired

    private SchaakRepository mijnSchaakRepository;

    @GetMapping("nieuwschaker/{schakersnaam}")
    public Schaker nieuwSchaker(@PathVariable String schakersnaam) {

        System.out.println("go" + schakersnaam);

        Schaker deSchaker = new Schaker();

        deSchaker.achternaam = schakersnaam;

        Schaker grootMeester = mijnSchaakRepository.save(deSchaker);

        return grootMeester;

    }

    @GetMapping("geefalleSchakers")

    public Iterable<Schaker> geefAlleSchakers() {

        return mijnSchaakRepository.findAll();


    }
}
