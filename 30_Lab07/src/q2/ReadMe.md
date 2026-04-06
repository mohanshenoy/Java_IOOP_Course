## Exercise_2

#### Define a java class Employee having following members: Ename, Eid, Basic, DA, Gross_Sal, Net_Sal and following methods:
* read(): to read N employee details
* displayEmployeeDetails(): to display employee details
* calculateSalary(): to compute net salary
_Write a Java program to read data of N employee and compute and display net salary of each employee Note: (DA = 52% of Basic, gross_Sal = Basic + DA; IT = 30% of the gross salary)_

#### To the already defined Employee class, add two subclasses FullTimeEmp and PartTimeEmp and implement the following:
* Include the following data members to the PartTimeEmp class-hoursWorked (int) that represents the number of hours worked by the part-time employee and hourlyRate (double, static and final) that represents the hourly rate at which the part-time employee is paid. Also, override calculateSalary() and displayEmployeeDetails() method of the base class to display the part-time employee's details, including the hours worked and hourly rate. 
* The FullTimeEmployee subclass includes the data members bonus and deductions as additional data members and are of type double and overrides the calculateSalary() and displayEmployeeDetails() methods to incorporate these factors. 
_In main(), create various objects to illustrate the functionality of all the classes._