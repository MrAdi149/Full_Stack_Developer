function sumOfDigits(number) {
  let sum = 0;
  let num = number; 

  while (num > 0) {
    sum += num % 10;
    num = Math.floor(num / 10);
  }

  return sum;
}

function countOfDigits(number) {
  let sum = 0;
  let num = number; 
  let count = 0;

  while (num > 0) {
    sum += num % 10;
    count++;
    num = Math.floor(num / 10);
  }

  return count;
}

function sumFirstAndLastDigit(number) {
    
    let num = number; 
    let last = num % 10;
    let first = num;
    while (first >= 10) {
        first = parseInt(first / 10);
    }
    return first + last;
}


let inputNumber = 12345;
console.log("Sum of digits of", inputNumber, "is:", sumFirstAndLastDigit(inputNumber));
