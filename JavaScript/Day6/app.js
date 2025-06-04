let student = {
    name: "Aditya",
    id: 1,
    age: 23,
    marks:{
        kannada:98,
        english:49,
        marathis:85
    }
}

for(let key in student){
    console.log(key,student[key]);
    
}

for(let key in student.marks){
    console.log(key,student.marks[key]);
    
}

let arr = [10,20,30,40,50]
console.log(arr.slice(1,4));
arr.splice(3,0,100,200)
console.log(arr);

let numbers = [1, 2, 3, 4, 5];
console.log("Original array:", numbers);

numbers.push(6);
console.log("After push:", numbers);

let poppedElement = numbers.pop();
console.log("Popped element:", poppedElement);
console.log("After pop:", numbers);

numbers.unshift(0);
console.log("After unshift:", numbers);

let shiftedElement = numbers.shift();
console.log("Shifted element:", shiftedElement);
console.log("After shift:", numbers);



