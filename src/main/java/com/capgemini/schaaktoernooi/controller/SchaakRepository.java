package com.capgemini.schaaktoernooi.controller;

import com.capgemini.schaaktoernooi.model.Schaker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface SchaakRepository extends CrudRepository<Schaker,Long> {

}
