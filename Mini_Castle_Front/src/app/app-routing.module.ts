import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ClassCarouselComponent } from './components/class-carousel/class-carousel.component';

const routes: Routes = [
  { path: 'classes', 
  component: ClassCarouselComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
