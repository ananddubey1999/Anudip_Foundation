//Q.3 Write a function that calculates the factorial of a given integer.
function calculateFactorialIterative(n) {
    let result = 1;
    for (let i = 1; i <= n; i++) {
      result *= i;
    }
   return result;
  }
  
  // Example usage:
  const number = 5;
  const factorial = calculateFactorialIterative(number);
  console.log(`The factorial of ${number} is: ${factorial}`);
  