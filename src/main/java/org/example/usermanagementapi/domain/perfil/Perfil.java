package org.example.usermanagementapi.domain.perfil;

import jakarta.persistence.*;

@Entity
@Table(name="perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String password;

}
