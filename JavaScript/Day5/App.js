let student = {
    name:"Tharun",
    age:22,
    address:{
        city:"Chokli",
        state:"Paglu",
        pincode:18
    }
}

console.log(student.address.pincode);
console.log(Object.keys(student.address));
console.log(Object.values(student.address));


console.log(Object.entries(student.address));


