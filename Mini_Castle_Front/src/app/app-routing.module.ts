import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationFormComponent } from './feature/registration-form/registration-form.component';
import { HomeComponent } from './feature/home/home.component';
import { HeaderComponent } from './layout/header/header.component';
import { ClassCarouselComponent } from './feature/class-carousel/class-carousel.component';
import { TestComponent } from './feature/test/test.component';
import { MapComponent } from './feature/map/map.component';
import { BodyComponent } from './body/body.component';

const routes: Routes = [
  {
    path:'',
    component:BodyComponent
  },
  {
    path:'inscription',
    component: RegistrationFormComponent
  },
  {
    path:'connexion',
    component: HeaderComponent
  },
  {
    path: 'register',
    component: RegistrationFormComponent
  },
  { 
    path: 'classes', 
  component: ClassCarouselComponent 
  },
  { 
    path: 'home', 
  component: HomeComponent
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
