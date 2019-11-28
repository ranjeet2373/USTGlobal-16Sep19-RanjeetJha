console.log('Named Function');
function circum(r1)
{
    var circum1 = 2 * 3.14 * r1;
    console.log('Circumference of circle is ',circum1); 
}
circum(2)

console.log('=============');
console.log('Function Expression');

var circum2 = function(r2)
{
    var value1 = 2 * 3.14 * r2;
    return value1;
}
var value2 = circum2(3);
console.log('Circumference of circle is ',value2);

console.log('=============');
console.log('self invoked function');


(function(r3)
{
    var value3 = 2 * 3.14 * r3; 
    console.log('Circumference of circle is ',value3);

})(4)

console.log('=============');
console.log('Fat Arrow Function');

var value4 = (r4) =>
           {
            var value4 = 2 * 3.14 * r4; 
            console.log('Circumference of circle is ',value4);
           }
           value4(5);