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

