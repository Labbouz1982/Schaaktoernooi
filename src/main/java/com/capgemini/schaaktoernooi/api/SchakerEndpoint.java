package com.capgemini.schaaktoernooi.api;


import com.capgemini.schaaktoernooi.controller.SchaakRepository;
import com.capgemini.schaaktoernooi.model.Schaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("toonalleschakers")

    public Iterable<Schaker> geefAlleSchakers() {

        return mijnSchaakRepository.findAll();


    }


    @PostMapping("nieuwschaker")

    public String SchakerMaken(@RequestBody Schaker schaken){

        mijnSchaakRepository.save(schaken);

        return "het is gelukt";

    }

}

