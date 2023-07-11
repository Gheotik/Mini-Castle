import { animate, state, style, transition, trigger } from '@angular/animations';
import { Component } from '@angular/core';
import { delay } from 'rxjs';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss'],
  animations: [
    trigger('flipState', [
      state('active', style({
        transform: 'rotateY(180deg)'
      })),
      state('inactive', style({
        transform: 'rotateY(0)'
      })),
      transition('active => inactive', animate('500ms ease-out')),
      transition('inactive => active', animate('500ms ease-in'))
    ])
  ]
})
export class CardComponent {
  constructor() { }

  ngOnInit() {
  }

  flip: string = 'active';

  toggleFlip() {
    this.flip = (this.flip == 'inactive') ? 'active' : 'inactive'
  }
}
