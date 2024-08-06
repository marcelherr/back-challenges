//Step 1
const numbers = [4, 8, 15, 16, 23, 42];

console.log(numbers)

const doubledNumbers: number[] = numbers.map(n => n * 2);

console.log("Alle Zahlen verdoppelt: ", doubledNumbers)

//Step2
const words: string[] = ["Apfel", "Banane", "Kirsche", "Dattel", "Erdbeere", "Feige"];

console.log(words)

const filterdWords = words.filter(word => word.length > 5)

console.log(filterdWords)

//Step3
const sumOfAllNumbers = numbers.reduce((a, b) => a + b)

console.log(sumOfAllNumbers)

//Step4
const someNumber = numbers.some(n => n > 10)

console.log(someNumber)

//Bonus

const list = [15, 6, 3213, 9, 0, 12, 8464, 1, 1264, 481, 186, 1031, 194];

const sortedList = list.sort((a, b) => b - a)

console.log(sortedList)

const squaredList = sortedList.map(n => n * n)

console.log(squaredList)