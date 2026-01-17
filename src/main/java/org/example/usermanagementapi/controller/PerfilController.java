package org.example.usermanagementapi.controller;

import org.example.usermanagementapi.domain.perfil.Perfil;
import org.example.usermanagementapi.dto.PerfilRequestDTO;
import org.example.usermanagementapi.dto.PerfilResponseDTO;
import org.example.usermanagementapi.service.PerfilService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/perfil")
public class PerfilController {

    private PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @PostMapping("/register")
    public PerfilResponseDTO register(@RequestBody PerfilRequestDTO dto) {

        perfilService.create(dto);

        PerfilResponseDTO perfilResponseDTO = new PerfilResponseDTO();

        perfilResponseDTO.setEmail(dto.getEmail());
        perfilResponseDTO.setNome(dto.getNome());

        return perfilResponseDTO;


    }
}
