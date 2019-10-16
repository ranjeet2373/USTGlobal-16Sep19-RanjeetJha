import { Component, OnInit } from '@angular/core';
import { Validators, FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  
  get addmovie(){
    return this.form.get('addmovie');
  }
  get movietitle(){
    return this.form.get('movietitle');
  }
  get url(){
    return this.form.get('url');
  }

  
  // tslint:disable-next-line: member-ordering
  form = new FormGroup({
    addmovie : new FormControl('' , [Validators.required]),
    movietitle : new FormControl('' , [Validators.required]),
    url : new FormControl('' , [Validators.required])

  });

  constructor() { }

  ngOnInit() {
  }

}
