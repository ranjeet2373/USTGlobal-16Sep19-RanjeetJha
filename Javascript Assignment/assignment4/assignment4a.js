/* ----map() and filter() function------- */

const items = [{
    name : 'Ear ring',
    id : 1,
    price : 5000
},
{
   name : 'Kajal',
   id : 2,
   price : 1000
},
{
   name : 'Trimmer',
   id : 3,
   price : 3000
},
{
   name : 'Beardo',
   id : 4,
   price : 170
}]
const items1 = items.map(function(value, index) {
   return value.price + 1000;
})
console.log(items1);

const items2 = items.filter(value => value.price > 1000);
console.log(items2);

/* ----to Upper and toLowerCase-------- */


let quote1 = 'You give respect you take respect';
console.log(quote1.toUpperCase());

let quote2 = 'Guitar';
console.log(quote2.toUpperCase());

let quote3 = 'Bike';
console.log(quote3.toUpperCase());

let quote4 = 'Qspider';
console.log(quote4.toUpperCase());

let quote5 = 'Laptop';
console.log(quote5.toUpperCase());

let quote6 = 'Bengaluru';
console.log(quote6.toUpperCase());

let quote7 = 'Ust Global';
console.log(quote7.toUpperCase());

let quote8 = 'Javascript';
console.log(quote8.toUpperCase());

let quote9 = 'Honesty is the best policy';
console.log(quote9.toLowerCase());

let quote10 = 'Guitar';
console.log(quote10.toLowerCase());

let quote11 = 'Bike';
console.log(quote11.toLowerCase());

let quote12 = 'Qspider';
console.log(quote12.toLowerCase());

let quote13 = 'Laptop';
console.log(quote13.toLowerCase());

let quote14 = 'Bengaluru';
console.log(quote14.toLowerCase());

let quote15 = 'Ust Global';
console.log(quote15.toLowerCase());

let quote16 = 'Javascript';
console.log(quote16.toLowerCase());

/* -----index of------ */

 let str = 'Blue Whale';
console.log(str.indexOf('Blue'));     // returns  0
console.log(str.indexOf('Blute'));    // returns -1
console.log(str.indexOf('Whale', 0)); // returns  5
console.log(str.indexOf('Whale', 5)); // returns  5
console.log(str.indexOf('Whale', 7)); // returns -1
console.log(str.indexOf(''));         // returns  0
console.log(str.indexOf('', 9));      // returns  9
console.log(str.indexOf('', 10));     // returns 10
console.log(str.indexOf('', 11));     // returns 10

/* -----charAt()----- */

var anyString = 'Brave new world';
console.log("The character at index 0   is '" + anyString.charAt()   + "'"); 
// No index was provided, used 0 as default

console.log("The character at index 0   is '" + anyString.charAt(0)   + "'");
console.log("The character at index 1   is '" + anyString.charAt(1)   + "'");
console.log("The character at index 2   is '" + anyString.charAt(2)   + "'");
console.log("The character at index 3   is '" + anyString.charAt(3)   + "'");
console.log("The character at index 4   is '" + anyString.charAt(4)   + "'");
console.log("The character at index 999 is '" + anyString.charAt(999) + "'");

/* -------includes()---------- */

const str1 = 'To be, or not to be, that is the question.';

console.log(str1.includes('To be'));       // true
console.log(str1.includes('question'));    // true
console.log(str1.includes('nonexistent')); // false
console.log(str1.includes('To be', 1));    // false
console.log(str1.includes('TO BE'));       // false
console.log(str1.includes(''))             // true

/* --------slice------------- */

var str2 = 'The quick brown fox jumps over the lazy dog.';

console.log(str2.slice(31));

console.log(str2.slice(4, 19));

console.log(str2.slice(-4));

console.log(str2.slice(-9, -5));

console.log(str2.slice(-4));

console.log(str2.slice(-9, -5));

/* --------split()--------- */

var str3 = 'The quick brown fox jumps over the lazy dog.';

var words = str3.split(' ');
console.log(words[3]);

var chars = str3.split('');
console.log(chars[8]);

var strCopy = str3.split();
console.log(strCopy);

var words1 = str3.split(' ');
console.log(words1[3]);

var chars1 = str3.split('');
console.log(chars1[8]);

var strCopy1 = str3.split();
console.log(strCopy1);

/* ------subStr()------- */

var aString = 'Mozilla';

console.log(aString.substr(0, 1));   // 'M'
console.log(aString.substr(1, 0));   // ''
console.log(aString.substr(-1, 1));  // 'a'
console.log(aString.substr(1, -1));  // ''
console.log(aString.substr(-3));     // 'lla'
console.log(aString.substr(1));      // 'ozilla'
console.log(aString.substr(-20, 2)); // 'Mo'
console.log(aString.substr(20, 2));  // ''

/* -----trim()-------- */

var greeting = '   Hello world!   ';

console.log(greeting);

console.log(greeting.trim());
console.log('====================');


/* ----------Array all methods--------- */

/* -------isArray()------- */

console.log(Array.isArray([]));
console.log(Array.isArray([1]));
console.log(Array.isArray(new Array()));
console.log(Array.isArray(new Array('a', 'b', 'c', 'd')));
console.log(Array.isArray(new Array(3)));
console.log(Array.isArray());
console.log(Array.isArray({}));
console.log(Array.isArray(null));
console.log(Array.isArray(undefined));
console.log(Array.isArray(17));
console.log(Array.isArray('Array'));

/* -------forEach()--------- */

var array1 = ['a', 'b', 'c'];

array1.forEach(function(element) {
  console.log(element);
});

const arraySparse = [1,3,,7];
let numCallbackRuns = 0;

arraySparse.forEach(function(element){
  console.log(element);
  numCallbackRuns++;
});

console.log("numCallbackRuns: ", numCallbackRuns);

const item = ['item1', 'item2', 'item3'];
const copy = [];

// before
for (let i=0; i<item.length; i++) {
  copy.push(items[i]);
}

// after
items.forEach(function(item){
  copy.push(item);
});

var words = ['one', 'two', 'three', 'four'];
words.forEach(function(word) {
  console.log(word);
  if (word === 'two') {
    words.shift();
  }
});

/* ---------includes()------- */

var arr = [1,2,3];
console.log(arr.includes(2));     // true
console.log(arr.includes(4));     // false
console.log(arr.includes(3, 3));  // false
console.log(arr.includes(3, -1)); // true
console.log([1, 2, NaN].includes(NaN)); // true

var arr = ['a', 'b', 'c'];

console.log(arr.includes('c', 3));   // false
console.log(arr.includes('c', 100)); // false

/* ------join()---------- */

var elements = ['Fire', 'Air', 'Water'];

console.log(elements.join());

console.log(elements.join(''));

console.log(elements.join('-'));

console.log(elements.join('*'));

console.log(elements.join('+'));

console.log(elements.join('_'));

/* -------pop()-------- */

var plants = ['broccoli', 'cauliflower', 'cabbage', 'kale', 'tomato'];

console.log(plants.pop());

console.log(plants);

plants.pop();

console.log(plants);

var myFish = ['angel', 'clown', 'mandarin', 'sturgeon'];

var popped = myFish.pop();

console.log(myFish); // ['angel', 'clown', 'mandarin' ] 

console.log(popped); // 'sturgeon'

/* --------push()------------ */

const animals = ['pigs', 'goats', 'sheep'];

const count = animals.push('cows');
console.log(count);
// expected output: 4
console.log(animals);
// expected output: Array ["pigs", "goats", "sheep", "cows"]

animals.push('chickens', 'cats', 'dogs');
console.log(animals);
// expected output: Array ["pigs", "goats", "sheep", "cows", "chickens", "cats", "dogs"]

var sports = ['soccer', 'baseball'];
var total = sports.push('football', 'swimming');

console.log(sports); // ['soccer', 'baseball', 'football', 'swimming']
console.log(total);  // 4

/* -------map()-------- */

var array1 = [1, 4, 9, 16];

const map1 = array1.map(x => x * 2);

console.log(map1);

var numbers = [1, 4, 9];
var roots = numbers.map(function(num) {
return Math.sqrt(num)
});

var kvArray = [{key: 1, value: 10}, 
   {key: 2, value: 20}, 
   {key: 3, value: 30}];

var reformattedArray = kvArray.map(obj =>{ 
var rObj = {};
rObj[obj.key] = obj.value;
return rObj;
});

/* -------filter()-------- */

function isBigEnough(value) {
   return value >= 10;
 }
 
 var filtered = [12, 5, 8, 130, 44].filter(isBigEnough);
 // filtered is [12, 130, 44]

 var fruits = ['apple', 'banana', 'grapes', 'mango', 'orange'];

/**
 * Filter array items based on search criteria (query)
 */
function filterItems(arr, query) {
  return arr.filter(function(el) {
      return el.toLowerCase().indexOf(query.toLowerCase()) !== -1;
  })
}

console.log(filterItems(fruits, 'ap')); // ['apple', 'grapes']
console.log(filterItems(fruits, 'an')); // ['banana', 'mango', 'orange']





