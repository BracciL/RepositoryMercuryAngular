package com.Eventi.Mercury.Repo;

import com.Eventi.Mercury.Model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventoRepo extends JpaRepository<Evento,Long>
{


    void deleteEventoById(Long id);

    Optional<Evento> findEventoById(Long id);
}
