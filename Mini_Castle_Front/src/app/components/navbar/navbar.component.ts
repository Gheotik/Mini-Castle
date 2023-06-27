import { Component } from '@angular/core';
import { navbarData } from './navbar_data';

@Component({
  selector: 'navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
  collapsed = false;
  navData = navbarData;

  toggleCollapsed(): void{
    this.collapsed = !this.collapsed;
  }

  closeSideNav(): void{
    this.collapsed = false;
  }
}
