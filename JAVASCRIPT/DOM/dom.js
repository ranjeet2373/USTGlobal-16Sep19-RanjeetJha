let h1element = document.getElementById('demo');
console.log('Element =',h1element);
let content = h1element.textContent;
console.log(content);
h1element.textContent = 'Good Evening';
let button1 = document.createElement('button');
button1.textContent = 'click Me';
console.log(button1)
document.body.appendChild(button1);
let ulelement = document.createElement('ul');
let li2element = document.createElement('li');
let li3element = document.createElement('li');
let li4element = document.createElement('li');
let li5element = document.createElement('li');

li2element.textContent = 'java';
li3element.textContent = 'sql';
li4element.textContent ='javascript';
li5element.textContent = 'c++';

ulelement.appendChild(li2element);
ulelement.appendChild(li3element);
ulelement.appendChild(li4element);
ulelement.appendChild(li5element);
document.body.appendChild(ulelement);


h1element.style.color ='red';
h1element.style.fontSize = '200px';

function showMessage(){
    alert('Hi Hello Welcome!!!');
}

function changeColor(){
    let pElement = document.getElementById('mover');
    pElement.style.color ='green';
}

function removeColor(){
    document.getElementById('mover').style.color = 'black';
}
function printHello(){
    console.log('hello');
    let userName = document.getElementById('username').value;
    document.getElementById('showusername').textContent = userName;
}

let name = 'ranjeet'
let age = 21
let phoneno = 12456327
console.log(`Name is ${name} Age is ${age} phone number ${phoneno}`);
console.log(`2 + 2 = ${2+2}`)
