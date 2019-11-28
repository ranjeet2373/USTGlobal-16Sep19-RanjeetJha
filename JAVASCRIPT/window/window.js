console.log('window object',window);
console.log('This keyword',this);
console.log(this === window);
// window.alert('welcome to javascript class');
// alert('welcome UST and Test Yantra');
// window.confirm('Are You want to delete');
// let confirmDelete = confirm('Are You want to delete');
// console.log('confirm delete',confirmDelete);
// let userName = prompt('what is your name','ranjeet');
// console.log('user name =',userName);
const person ={
    firstName : 'Alia',
    age :26,
    lastName : 'kapoor',
    getName :function(){
        console.log(this)
        return this.firstName + ' ' + this.lastName;
    }
}
let fullName = person.getName();
console.log('Full name =',fullName);
