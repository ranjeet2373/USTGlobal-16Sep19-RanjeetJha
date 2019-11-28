//named function
console.log('Named Function');
function factorial(num1)
{
    var fact = 1;
    for (var index = num1; index >=1; index--) {
        var fact = fact * index;
        
    }
    console.log('Factorial of '+num1+ '=',fact);
}
factorial(5);
console.log('=============');
console.log('Function Expression');
var fact1 = function(num2)
            {
                var fact1 = 1;
                for (var index =num2 ; index >= 1 ;index--)
                {
                   fact1 = fact1 * index;
                }
                return fact1;

            }
        var factorial = fact1(6);
        console.log('Factorial =',factorial);


        console.log('=============');
        console.log('self invoked function');



(function(num2)
{
    var f=1;
    for (let index = num2; index >= 1; index--)
     {
        f = f * index;
    }
    console.log('factorial of '+num2+ '=',f);
} )(7)       

console.log('=============');
console.log('Fat Arrow Function');
var fact2 = (num3) =>{
    var f2 = 1;
    for (var index =num3 ; index >= 1 ;index--)
    {
       f2 = f2 * index;
    }
    console.log('Factorial =',f2);
}
fact2(8)


                  

        