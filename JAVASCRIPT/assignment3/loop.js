console.log('For loop');
var color = ['red', 'black' ,'green' ,'white'];
for (let index = 0; index < color.length; index++) {
    console.log('color =',color[index]);
    
}
console.log('=============')
var college1 =['pcs' ,'rps' ,'lnct'];
for(var i = 0;i<college1.length;i++){
    console.log('college =',college1[i])
}
console.log('==================');
var city = ['patna' , 'hajipur' ,'munger' , 'madhubani'];
for (let index = 0; index < city.length; index++) {
    console.log('city =',city[index]);
    
}
console.log('======================');
var brands = ['maruti' , 'suzuki' , 'honda' , 'hero'];
for (let index = 0; index < brands.length; index++) {
    console.log('brand =',brands[index]);
    
}


console.log('==============');
var watch = ['fastrack' , 'sonata' ,'titan' , 'timex'];
for (let index = 0; index < watch.length; index++) {
    console.log('watchs =',watch[index]);
    
}

console.log('====================');
var car = ['alto' , 'bmw' , 'honda city' , 'amaze'];
for (let index = 0; index < car.length; index++) {
    console.log('car =',car[index]);
    
}
console.log('==============');
console.log('For of loop');
var color = ['red', 'black' ,'green' ,'white'];
for (const element of color) {
    console.log('color =',element);
    
}
console.log('==================');
var city = ['patna' , 'hajipur' ,'munger' , 'madhubani'];
for(var element of city)
{
    console.log('city =',element)
}

console.log('======================');
var brand = ['maruti' , 'suzuki' , 'honda' , 'hero'];
for (var element of brand) {
    console.log('brand =',element)  
}

console.log('==============');
var watch = ['fastrack' , 'sonata' ,'titan' , 'timex'];
for (var element of watch) {
    console.log('watch =',element);
    
}

console.log('====================');
var car = ['alto' , 'bmw' , 'honda city' , 'amaze'];
for (var element of car) {
    console.log('car =',element);    
}


console.log('====================');
console.log('For in loop');
var color = ['red', 'black' ,'green' ,'white'];
for (var index in color) {
    console.log('color =',color[index]);
    }

    console.log('==================');
var city = ['patna' , 'hajipur' ,'munger' , 'madhubani'];
for(var index in city)
{
    console.log('city =',city[index]);
}
console.log('======================');
var brands = ['maruti' , 'suzuki' , 'honda' , 'hero'];
for (var index in brands) {
    console.log('brands =',brands[index]);
    
}
console.log('==============');
var watch = ['fastrack' , 'sonata' ,'titan' , 'timex'];
for(var index in watch){
    console.log('watch =',watch[index]);
}


console.log('====================');
var car = ['alto' , 'bmw' , 'honda city' , 'amaze'];
for (var element of car) {
    console.log('car =',element);    
}

var person = {
    name : 'ranjeet',
    age : 33,
    color : 'white'
}

for(var index in person){
    console.log('value =',person[index]);
}

console.log('=======')

var bike ={
    name : 'duke',
    regno : 1234,
    color : 'red',
}
for(var index in bike){
    console.log('bike =',bike[index]);
}

console.log('=================')
var car ={
    name :'BMW',
    color : 'red',
    regno :12345,
}
for (var index in car) {
    
    console.log('car =',car[index]);
}

console.log('=============');
var institute = {
    name : 'jspiders',
    CEO : 'shsishira bhatt',
    regno : 12345,
}
for (var index in institute) {
    console.log('institute =',institute[index]);

}

console.log('====================');
var color = ['red' ,'black' ,'white'];
color.forEach(function(value,index){
    console.log('Color =',value);
});

console.log('==========');
var bike = ['activa' , 'duke' ,'pulser'];
bike.forEach(function(value,index){
    console.log('bike =',value);
});
console.log('===========');
var name1 = ['ranjeet' ,'amit', 'rahul' ,'anuj'];
name1.forEach(function(value, index){
    console.log(value);
})

console.log('===================');

var car1 = ['bmw' ,'alto' ,'xuv'];
car1.forEach(function(value, index){
    console.log(value);
})

var bike1 = ['duke' ,'splender' ,'pulser'];
bike1.forEach(function(value, index){
    console.log(value);
})

var fruit = ['mango' ,'apple' ,'orange'];
fruit.forEach(function(value, index){
    console.log(value);
})
console.log('===========')

var animal =['cow' ,'dog' ,'lion'];
animal.forEach(function(value, index){
    console.log(value);
})
console.log('==============')
var college =['rps' ,'lnct' ,'oriental'];
college.forEach(function(value, index){
    console.log(value);
})