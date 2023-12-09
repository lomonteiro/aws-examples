package br.com.lomonteiro.awsexamples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.lomonteiro.awsexamples.dtos.Cliente;
import br.com.lomonteiro.awsexamples.services.SnsProducerService;


@RestController
@RequestMapping("sns-examples")
public class SnsExamplesController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private SnsProducerService snsProducerService;

    
    @PostMapping("/cadastrar-cliente")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        try{
            final String json  =  objectMapper.writeValueAsString(cliente);
            snsProducerService.sendMessage(json);
            return cliente;
        } catch(Exception e) {
            return null;
        }
    }

}