import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink,RouterOutlet],
  templateUrl: './header.component.html',
  styles: ``
})
export class HeaderComponent {

}
