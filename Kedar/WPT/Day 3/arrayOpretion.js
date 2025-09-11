let a = [12, 34, 56, 78, 99, 21, 32, 1, 5, 10]

function callbk(x) {
    console.log("SEE THIS ", x)
}
a.forEach(callbk)
a.forEach((x) => console.log(x))


let sqrarr = a.map((e) => e * e)

console.log("origianl array ", a)
console.log("square array ", sqrarr)

let arr2 =
    ["red", "green", "blue", "yellow"]


console.log(arr2.map((ele) =>
    ele.substring(0, 2).toUpperCase()))

//using map and lamda show  each string in titlecase 
//console.log(arr2.map((e) => e.substring(0, 1).toUpperCase().concat(e.substring(1).toLowerCase())))


let oddnumbers =
    arr.filter((e) => { return e % 2 != 0 })
console.log(oddnumbers)