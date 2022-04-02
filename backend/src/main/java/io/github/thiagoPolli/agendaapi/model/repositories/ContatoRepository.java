package io.github.thiagoPolli.agendaapi.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.thiagoPolli.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer>{

}
