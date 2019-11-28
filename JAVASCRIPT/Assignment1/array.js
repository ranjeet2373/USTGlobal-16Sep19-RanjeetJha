console.log('=============');
console.log('Named Function');

function array1(arr)
{
    var sum=0;
    for (var index = 0; index < arr.length;index++)
{
    var sum = sum + arr[index]; 
}
return sum;
}
var arr = [1 , 2 , 3];
console.log('Sum= ' , array1(arr));

console.log('=========');
console.log('Expressed Function');

var array2 = function(arr1)
{
    var sum1 = 0;
   for (var index = 0; index < arr1.length; index++) 
   {
       sum1 = sum1 + arr1[index];
       
   }
   return sum1;
} 
var arr1 = [1 , 2 , 3];
console.log('sum=' ,array2(arr1));

console.log('=========');
console.log('self function');

(function(arr2)
{
    var sum2 = 0;
    for (var index = 0; index < arr2.length; index++) {
        sum2 = sum2 + arr[index];
        
    }
    console.log('sum=',sum2);
})([1,2,3]);

console.log('===============');
console.log('Fat Array Function');

var array3 = (arr3) =>{
    var sum3 = 0;
    for (var index = 0; index < arr3.length; index++) {
        sum3 = sum3 + arr3[index];
        
    }
return sum3;
}
var arr3 =[1,2,3];
console.log('sum=',array3(arr3));

