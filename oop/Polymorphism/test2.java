package oop.Polymorphism;

class test2 {
    int a = 10;
}

class change extends test2 {
    int a = 20;

    public static void main(String args[]) {
        test2 newobj = new change();
        System.out.println(newobj.a);
    }
}
