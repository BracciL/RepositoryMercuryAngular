package com.Eventi.Mercury;

import com.Eventi.Mercury.Model.Evento;
import com.Eventi.Mercury.Service.EventoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoResource
{
    private final EventoService eventoService;

    public EventoResource(EventoService eventoService) {
        this.eventoService = eventoService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Evento>> getEventi()
    {
    List<Evento> eventi = eventoService.findAllEventi();
    return new ResponseEntity<>(eventi, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Evento> findEventibyid(@PathVariable("id")Long id)
    {
        Evento evento = eventoService.findEventoById(id);
        return new ResponseEntity<>(evento, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Evento> addEvento(@RequestBody Evento evento)
    {
        Evento newEvento = eventoService.AddEvento(evento);
        return new ResponseEntity<>(newEvento, HttpStatus.CREATED);
    }
    @PutMapping ("/update")
    public ResponseEntity<Evento> updateEvento(@RequestBody Evento evento)
    {
        Evento updateEvento = eventoService.updateEvento(evento);
        return new ResponseEntity<>(updateEvento, HttpStatus.OK);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> deleteEvento(@PathVariable("id")Long id)
    {
        eventoService.deleteEvento(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
