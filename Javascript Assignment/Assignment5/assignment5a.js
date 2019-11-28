function validation_func(){
    var fname = document.getElementById('firstname').value
    var password = document.getElementById('passvalue').value
    alert('inside submit');
}
function validate_fname(){
    var fname = document.getElementById('firstname').value
    var fname_len = fname.length;
    if(fname_len<5){
        document.getElementById('err').innerHTML = 'First name should be greater than 5'
        document.getElementById('mybtn').disabled = true;
    }
    else{
        document.getElementById('err').innerHTML = ''
        document.getElementById('mybtn').disabled = false;
    }
}