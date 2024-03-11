class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Basics {
    public static void main(String[] args) {
        // Student s1 = new Student(); // this is Default Constructor
        // s1.name = "nasir";
        // s1.age = 23;
        // s1.printInfo();
        Student s2 = new Student("tasir", 24); // this is parameterized constructor
        s2.printInfo();
    }
}