public class Am {
    public static void main(String[] args) {
        Dummy s1 =new Dummy();
        s1.age = 23;
        s1.setPass("hello");
        System.out.println( s1.getPass());
    }

}

class Dummy {
    // there are 4 types of access modifiers
    // 1. public - these can be accessed from anywhere in the package outside the
    // package as well

    // 2.private - these can not be accessed outside the class to access them we
    // have to make get and set methods

    // 3. protected - these can be accessed by  those which inherit(extend) the
    // class in which they are defined and they can be accessed in the same package from anywhere.

    // 4. default- in we don't wrtie any keyword before variable/method then this is
    // used , they can be accessed within the same package only not outside the
    // package

    public String name ;
    private String password; // cannot be accessed outside dummy class
    protected int age;

    // getter for password 
    public String getPass(){
          return password;
    }

    // setter for password
    public void setPass(String pass) {
        this.password = pass;
    }

}


