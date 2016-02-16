package tech.hasset.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tech.hasset.domain.Mezmur;
import tech.hasset.repo.MezmurRepository;

import java.util.Collection;

/**
 * Created by biniamasnake on 16/02/16.
 */
@RestController
public class MezmurController {

    @Autowired
    private MezmurRepository mezmurRepository;

    @RequestMapping(value = "/", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Mezmur> getAllMezmurs() {

        return this.mezmurRepository.findAll();
    }
}
