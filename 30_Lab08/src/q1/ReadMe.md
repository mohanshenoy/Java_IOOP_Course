## Exercise_1

#### Define a java Class Student having following
Members: sname, marks_array, total, avg and provide the following methods:
* assign(): to assign initial values to the Student object
* display(): to display the Student object
* compute(): to Compute Total, Average marks

_Write a Java program Illustrating Class Declarations, Definition, and Accessing Class Members to test the class defined_

#### To the already defined Student class above, add two subclasses ScienceStudent and ArtsStudent and implement the following:
* Add a data member practicalMarks (int) to the ScienceStudent class that represents the marks obtained by the student in the laboratory subject. The ScienceStudent class should override the compute() method to include the practical marks in the total marks and average marks calculation. Additionally, the ScienceStudent class should provide a method displayPracticalMarks() to display the practical marks obtained by the science student. 
* Add a data member electiveSubject (String): to the ArtsStudent class that represents the elective subject chosen by the arts student. Also, add appropriate constructors to the subclasses.

_In main(), create objects of Student, ScienceStudent, and ArtsStudent, and demonstrate the keyword ‘super’ and other functionalities of the classes by assigning values, computing marks, and displaying the information of the students. Also, demonstrate dynamic polymorphism_