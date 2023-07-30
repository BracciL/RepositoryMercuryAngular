import { Component, OnInit } from '@angular/core';
import { Eventi } from './eventi';
import { EventoService } from './evento.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public eventi!: Eventi[];
  constructor(private eventoservice: EventoService) { }
  ngOnInit(): void {
      this.getEventi();
  }

public getEventi():void{

  this.eventoservice.getEventi().subscribe(
  (response: Eventi[]) =>
  {
    this.eventi = response;
  }
  
  )
}

}
