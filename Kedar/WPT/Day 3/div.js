function divide(a, b) {
  if (b === 0) {
    return "Error: division by zero";
  }
  return a / b;
}
const div = divide;
console.log(div(10, 2)); 