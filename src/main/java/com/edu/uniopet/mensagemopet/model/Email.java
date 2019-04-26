package com.edu.uniopet.mensagemopet.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "EMAIL")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEMAIL")
    private Long idEmail;

    @NonNull
    private Date data;

    @NonNull
    private char situacao;

    @NonNull
    private String origem;

    @NonNull
    private String titulo;

    @OneToOne (cascade = CascadeType.ALL, mappedBy="email")
    private Body body;
}
