//OOPS by Apna collage

//CLASS AND OBJECT--------------------------------------------------------------------------------
/*
//CREATING PEN CLASS........................................................
class Pen{
    String color;
    String type; //ball point or gel pen

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
//CREATING PEN OBJECT................................................................
public class oop{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball point";

        pen1.write();
        pen1.printColor();

        pen2.write();
        pen2.printColor();
    }
}
*/
/*
//CREATING STUDENTS CLASS.........................................................
class Students{
    int rno;
    String name;
    float percentage;

    public void printInfo(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.percentage);
    }
}

//CREATING STUDENT OBJECTS
public class oop{
    public static void main(String[] args){

        Students s1 = new Students();
        s1.rno = 10;
        s1.name = "Aman";
        s1.percentage = 92.5f;
        s1.printInfo();

        Students s2 = new Students();
        s2.rno = 3;
        s2.name = "Shrdha";
        s2.percentage = 96.5f;
        s2.printInfo(); 
    }
}
*/

/*
//PARAMETARISED CONSTARCTOR................................................................
class Students{
    int rno;
    String name;
    float percentage;

    public void printInfo(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.percentage);
    }

    Students(int rno, String name, float percentage){
        this.rno = rno;
        this.name = name;
        this.percentage = percentage;
    }
    Students(int rno, String name){
        this.rno = rno;
        this.name = name;
    }
}


public class oop{
    public static void main(String[] args){

        Students s1 = new Students(20, "Shradha", 96.5f);
        Students s2 = new Students(21, "Kalyan");
        s1.printInfo();
        s2.printInfo();
    }
}
*/

//POLYMOREPHISM---------------------------------------------------------------------------------------------
/* 
class Student{

    int rno;
    String name;
   
    public void printInfo(int rno){
        System.out.println(rno);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(String name, int rno){
        System.out.println(name+" "+rno);
    }
}

public class oop{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 21;
        s1.name = "Shradha";

        s1.printInfo(s1.name, s1.rno);
    }
}
*/

//INHERITANCE------------------------------------------------------------------------------------------------
/*
class Shape{
    String color;
}

class Tringle extends Shape{

    public void printShape(){
        System.out.println(this.color+" ONE");
    }
}

class Rectangle extends Tringle{
    public void printRectangle(){
        printShape();
    }
}

public class oop{
    public static void main(String[] args) {
        Rectangle t1 = new Rectangle();
        t1.color = "red";

        t1.printRectangle();
    }
}
*/

//ABSTRACTION----------------------------------------------------------------------------------------
/*
abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk(){
        System.out.println("Walk in 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walk in 2 legs");
    }
}

public class oop{
    public static void main(String[] args) {
        Horse horse = new Horse();
         horse.walk();

        //Animal animal= new Animal();      //Animal is abstract; cannot be instantiated
        //animal.walk();
    }
}
*/