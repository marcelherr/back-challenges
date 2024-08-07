//Step1
console.log("-Step 1-------------------------")
type Student = {
    firstName: string;
    lastName: string;
    age: number;
    grades: GradeNumbers[];
}

type GradeNumbers = 1 | 2 | 3 | 4 | 5 | 6;

const student1: Student = {
    firstName: "Anton",
    lastName: "Meier",
    age: 17,
    grades: [1, 4, 3, 1, 3, 2, 1, 2]
}

function output(student: Student | Student2) {
    console.log(`${student.firstName} ${student.lastName}(${student.age})
==============================
Grades: ${student.grades}`);
}

output(student1);

//Step2
console.log("-Step 2-------------------------")
type GradeString = "A" | "B" | "C" | "D" | "E" | "F";

type Student2 = {
    firstName: string;
    lastName: string;
    age: number;
    grades: (GradeNumbers | GradeString | "*")[];
}

const student2: Student2 = {
    firstName: "Anton",
    lastName: "Meier",
    age: 14,
    grades: ["A", 2, "F", 3, 1, "B", 2, 5]
}

output(student2);

//Step 3
console.log("-Step 3-------------------------")
const student3: Student2 = {
    firstName: "Caesar",
    lastName: "Schmidt",
    age: 17,
    grades: ["A", "F", 3, "*", "B", 2, 5]
}

output(student3);

// Step 4
console.log("-Step 4-------------------------")

const studentList = [student1, student2, student3]

function outputListOfStudents(studentList: Student2[]) {
    studentList.forEach(output)
}

outputListOfStudents(studentList)