//Named Functions
function add(num1,num2)
{
    console.log('sum=',num1+num2);
}
add(10,20);
//Function Expression (Anonymous)
var sub=function(num1,num2)
{
    var subValue = num1 - num2;
    return subValue;
}
var value = sub(90,85);
console.log('value=',value);

console.log('=============');
console.log('hello');
(function(num1,num2)
{
    console.log('value=',num1*num2);
})(10,20)
console.log('=============');
var div=(num1,num2)=>{
    console.log('value=',num1/num2);
}
div(10,5);
console.log('================');
var div1 = num1 => {
    console.log('value=',num1);
}
div1(10);

console.log('===============');
var add1 = (num1,num2) => num1+num2;
var value1 = add1(25,30);
console.log('value =',value1);


greeting('ranjeet');

function greeting(msg)
{
    console.log('hello ',msg);
}

greet('dinga');
var greet = function(msg)
{
    console.log('hi ',msg);
}
greets('dingi');
var greets=(msg) => {
    console.log('hi ',msg);
}

