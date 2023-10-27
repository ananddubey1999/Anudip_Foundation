//Q.1 Write a function that checks if a given string is a palindrome (reads the same forwards and backward).
function isPalindrome(str) {
      // Remove non-alphanumeric characters and convert the string to lowercase
      str = str.replace(/[^a-zA-Z0-9]/g, "").toLowerCase();
    
      // Compare the original string with its reverse
      return str === str.split("").reverse().join("");
    }
    
    // Example usage:
    const inputString = "Madam";
    const isPalindromic = isPalindrome(inputString);
    
    if (isPalindromic) {
      console.log(`"${inputString}" is a palindrome.`);
    } else {
      console.log(`"${inputString}" is not a palindrome.`);
    }
    
  



  