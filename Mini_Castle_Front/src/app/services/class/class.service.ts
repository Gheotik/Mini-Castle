import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import { Class } from 'src/app/entities/class';
import { Classes } from 'src/app/entities/classes';

@Injectable({
  providedIn: 'root'
})
export class ClassService {
  json: string = "assets/json.json";
  constructor(private httpClient: HttpClient) { }
  getClass(): Observable<Class[]> {
    
    return this.httpClient.get<Classes>(this.json)
    .pipe (
      map((res: Classes) => res.Classes)
    )
  }
}
