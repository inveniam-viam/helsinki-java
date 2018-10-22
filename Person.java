public class Person {

    private String name;
    private int age;

    // adding the keyword private in front of the variables
    // means that these variables will not show outside of the object
    // this kind of hiding things within an object is called encapsulation

    // variables defined within a class are called
    // object variables / object fields / object attributes

    // all objects of the Person class will have the variables name and age
    // state of the object is determined by the values set to these variables


    // the method that creates the object is called the constructor of the class
    // the constructor ALWAYS has the same name as its class
    // here, the initial age is set to 0
    // the name is the one that is passed to the constructor
    // imagine the constructor as the method run by Java when an object is
    // created using the new command

    // whenever an object is created, the constructor of the class is called


    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
    } // close constructor

    // writing methods for classes
    // the word static is not used in method definitions for objects

    // all the object variables are visible from all the methods of the object

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // age incrementing method
    public void becomeOlder() {
        this.age += 1;
    }

    // get age method
    public int getAge() {
        return this.age;
    }
} // end class Person
