package com.succhiamileabitudini.succhiamileabitudini.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String nome;

    private String cognome;


    private String email;

    private String cf;


}
