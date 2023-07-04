import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { MatDialogModule } from '@angular/material/dialog';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import { MatCardModule } from '@angular/material/card'
import { MatGridListModule} from '@angular/material/grid-list';

import { AppComponent } from './app.component';
import { MapComponent } from './feature/map/map.component';
import { RegistrationFormComponent } from './feature/registration-form/registration-form.component';
import { HomeComponent } from './feature/home/home.component';
import { HeaderComponent } from './layout/header/header.component';
import { ClassCarouselComponent } from './feature/class-carousel/class-carousel.component';
import { TableComponent } from './shared/table/table.component';
import { CardHolderComponent } from './shared/card-holder/card-holder.component';
import { CreationCardComponent } from './feature/creation-card/creation-card.component';
import { NavbarComponent } from './layout/navbar/navbar.component';
import { BodyComponent } from './body/body.component';


@NgModule({
  declarations: [
    AppComponent,
    MapComponent,
    RegistrationFormComponent,
    HomeComponent,
    HeaderComponent,
    ClassCarouselComponent,
    TableComponent,
    CardHolderComponent,
    CreationCardComponent,
    NavbarComponent,
    BodyComponent

  ],
  imports: [
    NgModule,
    BrowserModule,
    HttpClientModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    NgbModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatMenuModule,
    MatDialogModule,
    MatSlideToggleModule,
    MatCardModule,
    MatGridListModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }