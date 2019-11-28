const hobbies = ['sleeping' ,'cricket', 'eating' ,'coding'];
console.log(typeof hobbies); 

console.log('==============');
console.log(Array.isArray(hobbies))// it check is Array or not
console.log('==============');
console.log(hobbies.includes('cricket')) //it check these element is present in the array or not
console.log(hobbies.includes('cricket',6))
console.log('===============')
console.log(hobbies.push('DANCING','music')) //it add the element in the array from the last index 
console.log(hobbies.pop()) //it delete the element array from the last index
console.log('=========')
console.log(hobbies.unshift('sketching','singing'))// adding element in the 1st index
console.log('==============');
console.log(hobbies.shift());// remove the element from the 1st index
console.log('============')
const hobbies1 =['slleping','cricket','eating','coding','roaming'];
console.log(hobbies1.splice(1,0,'Bird watching','pubg'));
console.log('=============')
console.log('after splice method',hobbies1)
console.log(hobbies1.splice(1,2,'cricket','vollyball'));
console.log('after delete',hobbies1)
console.log('================');
console.log(hobbies1.slice(1,3))
console.log('after slice' , hobbies1)
console.log('============')
console.log('index number =',hobbies1.indexOf('cricket'))
console.log(hobbies1.indexOf('ccricket'))
console.log(hobbies1.indexOf('coding',2))

console.log('=============')
console.log(hobbies1.join('-'))
console.log(hobbies1.join())

console.log('===============')
const numbers = [100,200,300,400];
const number1 = numbers.map(function(value,index){
    let newValue = value + 50;
    return newValue;
})
console.log(number1);

const number2 = numbers.filter(function(value,index){
    if(value>200)
    return true;
    else
    return false;
})
console.log('using filter ',number2)

