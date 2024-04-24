package oop.Inheritance;

class test4 {
    int value1 = 1000;
}

class test5 extends test4 {
    int value2 = 2000;
}

class test6 {
    public static void main(String[] args) {
        test5 newobj = new test5();
        System.out.println("value1:" + newobj.value1 + "value2 :" + newobj.value2);
    }
}