 class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Tolymorphism {
    public static void main(String[] args) {
        // Polymorphism in programming refers to the multiple functions with same name
        // but different purpose

        // Compile-time Polymorphism:
        // Also known as method overloading.
        // Involves having multiple methods in the same class with the same name but
        // different parameter lists (different types or different numbers of
        // parameters).
        // The appropriate method is selected at compile time based on the method
        // signature.

        Student s1 = new Student();
        s1.name = "nasir";
        s1.age = 25;

        s1.printInfo(s1.age); //prints age 
    }
}
