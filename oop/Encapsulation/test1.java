package oop.Encapsulation;

class test1 {
    int a;
    int b;
    test1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void getTong() {
        int tong = a + b;
        System.out.println("tong a va b la :" + tong);
    }
}
class Main {
    public static void main(String args[]) {
        test1 newobj = new test1(10, 30);
        newobj.getTong();
    }
}
