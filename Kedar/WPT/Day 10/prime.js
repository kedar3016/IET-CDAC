
function isPrime(num) {
  if (num <= 1) return false;      // 0 and 1 are not prime
  for (let i = 2; i < num; i++) {
    if (num % i === 0) return false;  // divisible by i → not prime
  }
  return true;  // no divisors found → prime
}

const input = process.argv.slice(2);

if (input.length !== 10) {
  console.log("Please enter exactly 10 numbers.");
  process.exit(1);
}

const nums = input.map(Number);

if (nums.some(isNaN)) {
  console.log("Please enter only valid numbers.");
  process.exit(1);
}

const sumEven = nums.filter(n => n % 2 === 0).reduce((a, b) => a + b, 0);
const sumEvenIndex = nums.filter((_, i) => i % 2 === 0).reduce((a, b) => a + b, 0);
const sumPrime = nums.filter(isPrime).reduce((a, b) => a + b, 0);

console.log("Sum of even numbers:", sumEven);
console.log("Sum of numbers at even indexes:", sumEvenIndex);
console.log("Sum of prime numbers:", sumPrime);
