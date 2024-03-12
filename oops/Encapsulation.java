public class Encapsulation {
    // It refers to the bundling of data (attributes or fields) and the methods
    // (functions or procedures) that operate on the data into a single unit known
    // as a class.
    // features
    // 1.data hiding - only showing what users need
    // 2.Access Control - controlling access level of various entities by using
    // public, private and protected
    // 3. Information Bundling - variables and methods which have same purpose are
    // kept in same class.

    // STATIC KEYWORD
    // static keyword is used in those data and methods which are common for every
    // object
    // static entities can be directly accessed by class name we dont need to make
    // object for them
    // e.g Student.school here school is same for every student

    // ABSTRACT VS CLASS
    // abstract is used for creating blueprint
    // we cannot make objects of abstracts
    // declaration of abstract
    // abstract class Example{
    // abstract void printName();
    // }
    // in place of using abstract we can use better practice called interfaces
    // declaration of interfaces
    // interface Example{
    // public void printHello();
    // }
}
