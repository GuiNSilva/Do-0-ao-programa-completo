package br.com.projeto.projeto.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.projeto.sistema.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
