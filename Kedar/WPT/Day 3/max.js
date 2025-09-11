// let numbers = [3, 7, 2, 8, 5];
// let max = numbers[0];
// for (let i = 1; i < numbers.length; i++) {
//   if (numbers[i] > max) {
//     max = numbers[i];
//   }
// }


// let numbers = [3, 7, 2, 8, 5];
// let max = numbers.reduce((i, j) => {
//   return Math.max(i, j);
// }, numbers[0]);
// console.log(max);

// let numbers = [3, 7, 10, 8, 5];
// let max = numbers[0];


// numbers.forEach(element => {
//     if(element>max){
//         max = element;
//     }
    
// });


numbers.sort((a,b)=>a-b)
let len = numbers.length;
console.log("The Largest Element is: "+numbers[len-1]);


