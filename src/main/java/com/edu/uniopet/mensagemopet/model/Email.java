package com.edu.uniopet.mensagemopet.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmail;


    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data;

    private char situacao;

    private String origem;

    private String titulo;

    @OneToOne(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    private Body body;
}
