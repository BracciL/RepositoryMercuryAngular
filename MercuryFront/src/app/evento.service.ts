import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Eventi } from './eventi';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class EventoService {
private apiServerUrl= environment.apiBaseUrl;
  constructor(private http: HttpClient) { }

  public  getEventi(): Observable<Eventi[]>{
    return this.http.get<Eventi[]>(`${this.apiServerUrl}/evento/all`)
  }
  public  addEvento(evento:Eventi): Observable<Eventi>{
    return this.http.post<Eventi>(`${this.apiServerUrl}/evento/add`,evento)
  }
  public  updateEvento(evento:Eventi): Observable<Eventi>{
    return this.http.put<Eventi>(`${this.apiServerUrl}/evento/update`,evento)
  }
  public  deleteEvento(eventoId:number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/evento/delete/${eventoId}`)
  }

}
