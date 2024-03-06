/*
Question 2:
Inheritance happens when a class inherits attributes and objects from another class.

In this project, create a child class called Student that gets attributes and methods from a parent class called Person.

The Student class should have additional properties and methods:
Property:
- gradeLevel (String)

Method:
- study() - The study method takes in a string and should output: "I love studying <string>" ex. I love studying Algebra
*/

class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void greet(){
        System.out.println("Hello, my name is " + this.firstName);
    }
}

//Modify this code
class Student {}
//End code