var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myname = "mikel";
console.log(myname, typeof myname);
var age;
console.log(age, typeof age);
age = 54;
console.log(age, typeof age);
var mobilenumber;
console.log(mobilenumber, typeof mobilenumber, typeof mobilenumber);
var address;
address = 6564141654;
console.log(address, typeof address);
address = "patna";
console.log(address, typeof address);
var calAge = function () {
    console.log('your age is 23');
};
calAge();
////************class******************** */////
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("ranjeet", 23);
console.log(person1);
////////*************INHERITENCE************ 
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollNo) {
        var _this = _super.call(this, name, age) || this;
        _this.rollNo = rollNo;
        ;
        return _this;
    }
    return student;
}(person));
var student1 = new student("anuj", 24, 420);
console.log(student1);
