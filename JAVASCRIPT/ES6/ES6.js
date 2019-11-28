const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve('success')
    }else{
        reject('Failed')
    }
})

message.then(function(msg){
    console.log('success message',msg)
}).catch(function(error){
    console.log('Failure Message',error)
})


const employees = new Promise(function(resolve,reject){
    if(30 > 10){
        resolve([{
            name : 'BillGate',
            age : 67
        },{
            name : 'Mark Zuckerberg',
            age : 40
        
        },{
            name :'ranjeet',
            age :23
        
        }])
    }else{
        reject('Failed')
    }
})

employees.then(function(data){
    console.log('Employee Data',data)
}).catch(function(error){
    console.log('Failure Message',error)
})

//closers
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('counter value',counter)