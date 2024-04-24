
package oop.Inheritance;

class test1 {
    public int a;
    public int b;

    public test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void ferforma(int increment) {
        b += increment;
    }

    public void ferformb(int decrement) {
        b -= decrement;
    }

    public String toString() {
        return ("a : " + a + "b: " + b);
    }
}

class test2 extends test1 {
    public int values;
    public test2(int a, int b, int newvalues){
        super(a, b);
        values = newvalues;
    }

    public void setValues(int newvalues) {
        values = newvalues;
    }

    @Override public String toString() {
        return (super.toString() + "value: " + values);
    }
}

public class test3 {
    public static void main(String[] args) {
        test2 newobj = new test2(10, 20, 30);
        System.out.println(newobj.toString());
    }
    
}