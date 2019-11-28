
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