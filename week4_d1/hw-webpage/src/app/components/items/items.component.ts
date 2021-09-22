import { Component, OnInit } from '@angular/core';
import { Items } from 'src/app/items';
import { ITEMS } from 'src/app/mock-items';

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  items = ITEMS; 
  selectedItem?:Items; 

  constructor() { }

  ngOnInit(): void {
  }

  onSelect(item:Items):void{
    this.selectedItem = item; 
  }

}
