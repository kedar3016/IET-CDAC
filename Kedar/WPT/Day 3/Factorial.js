


// do{
    

// }while(ch != 0);


// function fact(){
    
//     fact = 1;
//     for(i = 1;i<=num;i++){
//         fact = fact * i;
//     }
//     return fact;
// }


function fact(n){
    if(n == 0 || n == 1){
        return 1;
    }
    else{
        return n*fact(n-1)
    }
}
rv = fact(3);
console.log("Factorial of the  is:"+rv);
