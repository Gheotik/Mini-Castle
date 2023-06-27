import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';


const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'Inscription',
    component: HeaderComponent
  },
  {
    path:'Connexion',
    component: HeaderComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
