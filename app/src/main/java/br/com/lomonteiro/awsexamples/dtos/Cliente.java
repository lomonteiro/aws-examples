package br.com.lomonteiro.awsexamples.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    private UUID id;
    private String nome;
    private String sobrenome;
    private String email;

}