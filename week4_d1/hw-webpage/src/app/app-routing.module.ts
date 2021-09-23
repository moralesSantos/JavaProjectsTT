import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ItemsComponent } from './components/items/items.component';
import { HomepageComponent } from './components/homepage/homepage.component';
const routes: Routes = [
  {path:'items', component:ItemsComponent},
  {path: 'about',component: AboutComponent},
  {path: 'homepage',component:HomepageComponent},
  {path: '', redirectTo: '/homepage',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
