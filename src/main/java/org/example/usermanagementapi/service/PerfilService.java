package org.example.usermanagementapi.service;

import org.example.usermanagementapi.domain.perfil.Perfil;
import org.example.usermanagementapi.dto.PerfilRequestDTO;
import org.example.usermanagementapi.repository.PerfilRepository;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    private PerfilRepository repo;

    public PerfilService(PerfilRepository perfilRepository) {
        this.repo = perfilRepository;
    }

    //===========INSERT IN DATABASE====================

    public Perfil create(PerfilRequestDTO dto) {

        Perfil perfil = new Perfil();

        perfil.setName(dto.getNome());
        perfil.setEmail(dto.getEmail());
        perfil.setPassword(dto.getPassword());

        return repo.save(perfil);


    }

}
