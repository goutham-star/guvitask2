package guvitask2;
public class person {
    public String name;
    public int age;

    public person(String name){
        this.name = name;
        this.age = 18;
    }

    public person(String name, int age){

        this.name = name;
        this.age = age;
    }

    public void display(){
System.out.println("MY name is: " + name);
System.out.println("My age is: " + age);
    }

    public static void main(String[] args) {
   
        person p1Person = new person("john", 18);

        p1Person.display();
    }

}


/*
Output
My name is john
My age is 18
*/
