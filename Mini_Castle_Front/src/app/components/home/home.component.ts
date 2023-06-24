import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})

export class HomeComponent implements OnInit {

  token: string | null | undefined ;
 
  ngOnInit(): void {
    this.tokenUser();
  }

  //Variables for the HTML 
  field1 : string | undefined;
  field2 : string | undefined;
  field3 : string | undefined;

  tokenUser(){
    this.token = 'j';
    if(this.token != null){
      this.field1 = 'New Game';
      this.field2 = 'Load Game';
      this.field3 = 'Quit';
    } else {
      this.field1 = 'Register';
      this.field2 = 'Connection';
      this.field3 = 'Quit';
    }

  }
}
