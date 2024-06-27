import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-footer',
  standalone: true,
  imports: [RouterLink,RouterOutlet],
  templateUrl: './footer.component.html',
  styles: ``
})
export class FooterComponent {
year= new Date().getFullYear();
}
