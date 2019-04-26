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
    @Column(name = "IDBODY")
    private Long idBody;

    @NonNull
    private String mensagem;

    @JoinColumn(name = "IDEMAIL")
    @OneToOne
    @MapsId
    private  Email email;
}
