const person = {
                 name : 'sundra',
                  age :   69,
                  color : 'white',
                  address : {
                              city : 'patna',
                              state :'bihar',
                              pincode :800002
                            },
                   hobbies : ['coding' , 'bird watching' ,'singing']         
 
                            }
console.log('javascript person object' ,person)
const jsonobject = JSON.stringify(person)
console.log('JSON person object ',jsonobject)
const javascriptobject = JSON.parse(jsonobject)
console.log('javascript person object',javascriptobject)


/// local storage 
localStorage.setItem('email','billgates@gmail.com')
const emailId = localStorage.getItem( 'email')
console.log('Email ID' ,emailId)
localStorage.clear();
    
