var todayDate=new Date();
console.log('Today Date',todayDate);
console.log('Day=',todayDate.getDay());
console.log('Year=',todayDate.getFullYear());
console.log('Month=',todayDate.getMonth());
console.log('Date=',todayDate.getDate());
var constMilli = new Date(0);
console.log('Date =',constMilli);
var constString = new Date('Nov 10');
console.log('Date string constructor ',constString);
var constYear = new Date(2017,10);
console.log('Date year constructuor ',constYear);



console.log("====================");
console.log(hoist);
var hoist;
