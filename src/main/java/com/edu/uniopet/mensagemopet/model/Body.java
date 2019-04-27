package com.edu.uniopet.mensagemopet.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "BODY")
public class Body {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBody;

    @NonNull
    private String mensagem;

}
