var brands = ['kingfisher' , 'bisleri' , 'aqua' , 'kinley'];
for (var element of brands) {
    console.log('Brand =',element);
    
}
console.log('==========')
for (var index in brands) {
    console.log('Brand = ',brands[index]);
}

console.log('=============');

var person = {
    name : 'sundari',
    age : 33,
    color : 'white',
}
for (var key in person) {
    console.log('value = ',person[key]);
    
}
console.log('=============');

var movies = ['sholay' , 'mayabazar' , 'jurassic park' , 'titanic'];
movies.forEach(function(value , key){
    console.log('Movie = ',value);
});

console.log('============');

var items = [{
    item :'bangales',
    id : 1,
    price : 100,
},
{
    item : 'eyeliner',
    id : 2,
    price : 120,
},
{
    item : 'watch',
    id : 3,
    price : 5000,
},
{
    item : 'bike',
    id : 4,
    price : 500000,

}]
items.forEach(function(value,index){
    console.log('Index of item =',value);
})