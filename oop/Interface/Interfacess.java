package oop.Interface;
interface It2 {
    void test1(int a);

    void test2(int a);

    void test3(int a);
}

class Interfacess implements It2 {
    int weight;
    int gear; 

    @Override
    public void test1(int newc) {
        gear = newc;
    }

    @Override
    public void test2(int increment) {
        weight = weight + increment;
    }

    public void test3(int decrement) {
        weight = weight - decrement;
    }

    public void printState() {
        System.out.println("weight: " + weight + " " + "gear: " + gear);
    }
}

class passparameters {
    public static void main(String[] args) {
        Interfacess values = new Interfacess();
        values.test1(2);
        values.test2(4);
        values.test3(1);
        System.out.println("complete : ");
        values.printState();
    }
}