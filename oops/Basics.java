class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // default constructor
    Student() {

    }

    // parameterized constructor
    // Student(String name, int age) {
    // this.name = name;
    // this.age = age;
    // }

    // copy constructor
    // copies another object
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // *in java there is no need for destructors because there is garbage collector
    // mechanism and it makes destructors by itself
}

class Basics {
    public static void main(String[] args) {
        Student s1 = new Student(); // this is Default Constructor
        s1.name = "nasir";
        s1.age = 23;
        // s1.printInfo();

        // Student s2 = new Student("tasir", 24); // this is parameterized constructor
        // s2.printInfo();

        Student s3 = new Student(s1); // this is copy constructor
        s3.printInfo();
    }
}