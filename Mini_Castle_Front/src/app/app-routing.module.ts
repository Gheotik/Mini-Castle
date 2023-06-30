import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationFormComponent } from './components/registration-form/registration-form.component';
import { HomeComponent } from './components/home/home.component';
import { HeaderComponent } from './components/header/header.component';
import { ClassCarouselComponent } from './components/class-carousel/class-carousel.component';

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
    path: 'register',
    component: RegistrationFormComponent
  },
  { path: 'classes', 
  component: ClassCarouselComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
