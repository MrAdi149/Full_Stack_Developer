// Hardcoded year (change this to test)
const year = 2024;

// Check leap year conditions
let isLeap = false;

if (year % 4 === 0) {
    if (year % 100 === 0) {
        if (year % 400 === 0) {
            isLeap = true;
        }
    } else {
        isLeap = true;
    }
}

if(isLeap){
    console.log("it is a leap year")
}else{
    console.log("not a leap year")
}