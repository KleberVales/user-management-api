package org.example.usermanagementapi.service;

import org.example.usermanagementapi.domain.perfil.Perfil;
import org.example.usermanagementapi.dto.PerfilRequestDTO;
import org.example.usermanagementapi.repository.PerfilRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PerfilServiceTest {

    @Mock
    private PerfilRepository repo;

    @InjectMocks
    private PerfilService service;

    @Test
    @DisplayName("Deve salvar um perfil com sucesso")
    void deveCriarPerfil() {
        // GIVEN (Dado que tenho um DTO)
        PerfilRequestDTO dto = new PerfilRequestDTO();
        dto.setNome("João");
        dto.setEmail("joao@email.com");
        dto.setPassword("123456");

        Perfil perfilSalvo = new Perfil();
        perfilSalvo.setId(1L); // Simula o ID gerado pelo banco

        when(repo.save(any(Perfil.class))).thenReturn(perfilSalvo);

        // WHEN (Quando eu chamo o método create)
        Perfil resultado = service.create(dto);

        // THEN (Então os dados devem estar corretos)
        assertNotNull(resultado);
        assertEquals(1L, resultado.getId());
        verify(repo, times(1)).save(any(Perfil.class));
    }
}
