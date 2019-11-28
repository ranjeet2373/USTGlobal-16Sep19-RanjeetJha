let myname : string = "mikel";

console.log(myname , typeof myname);

let age : number;
console.log(age , typeof age);
age = 54;
console.log(age , typeof age);



let mobilenumber : 54664546546;
console.log(mobilenumber , typeof mobilenumber , typeof mobilenumber);

let address;
address = 6564141654;
console.log(address , typeof address);

address ="patna";
console.log(address , typeof address);

let calAge = function() : void {
    console.log('your age is 23');
}
calAge();

////************class******************** */////

class person{
    constructor(public name : string , public age : number){

    }
}
let person1 = new 00person("ranjeet" , 23);
console.log(person1);

////////*************INHERITENCE************ 
class student extends person {
    constructor(name : string , age : number , public rollNo : number){
        super(name , age);;
    }
    
}
let student1 = new student("anuj" , 24 , 420);
    console.log(student1);
