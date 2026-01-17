package org.example.usermanagementapi.repository;

import org.example.usermanagementapi.domain.perfil.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {

}
