package com.Eventi.Mercury.Service;

import com.Eventi.Mercury.Exception.EventoNotFoundException;
import com.Eventi.Mercury.Model.Evento;
import com.Eventi.Mercury.Repo.EventoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EventoService {
    private final EventoRepo eventoRepo;

    @Autowired
    public EventoService(EventoRepo eventoRepo) {
        this.eventoRepo = eventoRepo;
    }

    public Evento AddEvento(Evento evento)
    {
        evento.setCodiceEvento(UUID.randomUUID().toString());
        return eventoRepo.save(evento);
    }

    public List<Evento> findAllEventi()
    {
        return eventoRepo.findAll();
    }

    public Evento updateEvento(Evento evento)
        {
            return eventoRepo.save(evento);
        }
        public Evento findEventoById(Long id)
        {
            return eventoRepo.findEventoById(id).orElseThrow(()-> new EventoNotFoundException("Evento con questo id "+id+" non trovato"));
        }
    public void deleteEvento(Long id)
    {
        eventoRepo.deleteEventoById(id);
    }



}
