import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FunctionServiceService } from '../function-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-studenthomepage',
  templateUrl: './studenthomepage.component.html',
  styleUrls: ['./studenthomepage.component.css']
})
export class StudenthomepageComponent implements OnInit {

  myBook = null;
  show = false;


  constructor(private functionservice: FunctionServiceService, private router: Router) { }

  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/studentlogin');
  }

  getBook(search: NgForm) {
    console.log('======',search.value.bid);
    this.functionservice.getBook(search.value.bid).subscribe(res => {
      console.log(res);
      this.myBook = res.bookbean;
    }, err => {
      console.log(err);
    });
  }

  ngOnInit() {
  }
  showsaerch(){
    this.show = true;
    return this.show;
  }

}
