import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ItemsComponent } from './components/items/items.component';
import { AboutComponent } from './components/about/about.component';
import { ItemsDetailComponent } from './components/items-detail/items-detail.component';
import { HomepageComponent } from './components/homepage/homepage.component';

// const appRoutes: Routes = [
//   {path: '', component: ItemsComponent},
//   {path: 'about',component: AboutComponent}
// ]

@NgModule({
  declarations: [
    AppComponent,
    ItemsComponent,
    AboutComponent,
    ItemsDetailComponent,
    HomepageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    // RouterModule.forRoot(appRoutes,{enableTracing: true})
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
