//Q.2 Write a function that finds the largest number in an array of numbers.
function findLargestNumber(numbers) {
    if (numbers.length === 0) {
      return "The array is empty.";
    }
  // Assume the first number is the largest
    let largest = numbers[0]; 
    for (let i = 1; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        // Update largest if a larger number is found
        largest = numbers[i]; 
      }
    }
  
    return largest;
  }
  
  const numberArray = [12, 5, 27, 8, 33, 19];
  const largestNumber = findLargestNumber(numberArray);
  console.log(`The largest number is: ${largestNumber}`);
  