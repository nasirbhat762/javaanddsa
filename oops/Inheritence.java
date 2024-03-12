// Inheritence can be of 04 types
// 1.single level Inheritence :- when there is one parent class and one derived class 
// 2. multi level inheritence :- when base derived extends parent class and then that derived class is extended by  another   class 
// 3. multiple inheritence :- when a single class  extends  more than one base class. It can be achieved in java
// through interfaces 

// interface A {
//     void methodA();
// }


// interface B {
//     void methodB();
// }

// class C implements A, B {
   
// }



// 4. hybrid inheritence :- when combo of any two or more methods of inheritence is there 
// 5. hierarcical inheritence :- one base class and more than one derived class 


class Shapes {
    String color;
    public void area(){
        System.out.println("prints area");
    }
}

class Circle extends Shapes {
    // even though we have not declared any color variable here but it can access
    // the color variable of parent class
    public void area(int r){
        System.out.println("area of circle is " + 3.14*r*r);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Circle r1 = new Circle();
        r1.color = "red";
        r1.area(); // prints area because no param is passed so parent method function is called 
        r1.area(5); // prints area of circle with radius 5
        System.out.println(r1.color);
    }
}
