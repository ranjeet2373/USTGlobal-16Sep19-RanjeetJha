console.log('Named Function');

function fibonic(range1)
{
    var a =0;
    var b = 1;
    console.log(a);
    console.log(b);
    for (var index = 1; index  <= range1; index++) 
    {
        var c = a+b;
        console.log(c);
        a = b;
        b = c;
    }
}
fibonic(5);

console.log('=============');
console.log('Function Expression');

var fibonic1 = function(range2)
{
    var a1 =0;
    var b1 = 1;
    console.log(a1);
    console.log(b1);
    for (var index = 1; index  <= range2; index++) 
    {
        var c1 = a1 + b1;
        console.log(c1);
        a1 = b1;
        b1 = c1;
    }
}
fibonic1(6);

console.log('=============');
console.log('self function');

(function (range3)
{
    var a2 =0;
    var b2 = 1;
    console.log(a2);
    console.log(b2);
    for (var index = 1; index  <= range3; index++) 
    {
        var c2 = a2 + b2;
        console.log(c2);
        a2 = b2;
        b2 = c2;
    }

})(7)

console.log('=============');
console.log('Fat Array function');

var fibonic2 = (range4) =>
{
    var a3 =0;
    var b3 = 1;
    console.log(a3);
    console.log(b3);
    for (var index = 1; index  <= range4; index++) 
    {
        var c3 = a3 + b3;
        console.log(c3);
        a3 = b3;
        b3 = c3;
    }
}
fibonic2(9);






        
        
    
