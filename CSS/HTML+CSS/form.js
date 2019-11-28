/* -----Id Selectors-------- */

let passwordField = document.getElementById('password-field');
let togglePassword = document.getElementById('toggle-pwd');
let checkBox = document.getElementById('check-box');

checkBox.addEventListener('click', function() {
    if(passwordField.getAttribute('type') === 'password') {
        passwordField.setAttribute('type','text');
    }  
    else {
        passwordField.setAttribute('type','password');
    }
});
togglePassword.addEventListener('click', function() {
    if(passwordField.getAttribute('type') === 'password') {
        passwordField.setAttribute('type','text');
        togglePassword.style.color = 'white';
    }  
    else {
        passwordField.setAttribute('type','password');
        togglePassword.style.color = 'green';
    }
});
