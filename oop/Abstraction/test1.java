package oop.Abstraction;

abstract class test1 {
    abstract int classname();
}

class classOne extends test1 {
    int classname() {
        return 10;
    }
}

class classTwo extends test1 {
    int classname() {
        return 20;
    }
}

class Main {
    public static void main(String args[]) {
        test1 a;
        a = new classOne();
        System.out.println(a.classname());
        a = new classTwo();
        System.out.println(a.classname());
    }
}
