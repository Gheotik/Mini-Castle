import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationFormComponent } from './feature/registration-form/registration-form.component';
import { HomeComponent } from './feature/home/home.component';
import { HeaderComponent } from './layout/header/header.component';
import { ClassCarouselComponent } from './feature/class-carousel/class-carousel.component';
import { MapComponent } from './feature/map/map.component';
import { BodyComponent } from './body/body.component';

const routes: Routes = [
  {
    path:'',
    component:HomeComponent
  },
  {
    path:'Inscription',
  component: RegistrationFormComponent
  },
  {
    path:'Connexion',
    component: HeaderComponent
  },
  {
    path: 'Register',
    component: RegistrationFormComponent
  },
  { 
    path: 'classes', 
    component: ClassCarouselComponent 
  },
  { 
    path: 'play', 
    component: MapComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
