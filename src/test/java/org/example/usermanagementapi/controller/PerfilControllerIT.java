package org.example.usermanagementapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.usermanagementapi.dto.PerfilRequestDTO;
import org.example.usermanagementapi.repository.PerfilRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest // Sobe a aplicação inteira para o teste
@AutoConfigureMockMvc // Configura o objeto que simula requisições HTTP
class PerfilControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper; // Converte objetos para JSON

    @Autowired
    private PerfilRepository perfilRepository;

    @Test
    @DisplayName("Deve registrar um novo perfil via API e salvar no banco")
    void deveRegistrarPerfilComSucesso() throws Exception {
        // GIVEN
        PerfilRequestDTO request = new PerfilRequestDTO();
        request.setNome("Maria Silva");
        request.setEmail("maria@email.com");
        request.setPassword("senha123");

        // WHEN & THEN
        mockMvc.perform(post("/api/perfil/register")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isOk()) // Verifica se retornou HTTP 200
                .andExpect(jsonPath("$.email").value("maria@email.com"))
                .andExpect(jsonPath("$.nome").value("Maria Silva"));

        // Verificação extra: O dado realmente está no banco?
        assertEquals(1, perfilRepository.count());
    }
}
