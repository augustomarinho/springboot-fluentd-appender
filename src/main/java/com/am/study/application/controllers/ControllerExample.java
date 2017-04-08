package com.am.study.application.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by augustomarinho on 26/03/17.
 */
@RestController
public class ControllerExample {

    private static final Logger logger = LoggerFactory.getLogger(ControllerExample.class);

    @RequestMapping(value = "/query/cpf/{cpf}", method = RequestMethod.GET)
    public ResponseEntity<String> queryByCPF(@PathVariable String cpf) {
        try {
            logger.info("Recendo requisicao para CPF " + cpf);
            return new ResponseEntity<String>("OK", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
