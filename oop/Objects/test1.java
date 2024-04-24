package oop.Objects;

public class test1 {
    String hoten;
    int age;
    String hometwo;
    String hobbit;

    public test1(String hoten, int age, String hometwo, String hobbit) {
       this.hoten = hoten;
       this.age = age;
       this.hometwo = hometwo;
       this.hobbit = hobbit;
    } 
    public String getHoten() {
        return hoten;
    }
    public int getage() {
        return age;
    }
    public String gethometwo() {
        return hometwo;
    }
    public String getHobbit() {
        return hobbit;
    }

    @Override public String toString() {
        return ("Hoten: " +hoten  + "Age: "+ age + "Hometwo: " + hometwo + "Hobbit: " + hobbit);
    }

    public static void main(String[]  args) {
        test1 newt = new test1("le phu cuong", 12, "thanh hoa", "da bong");
        System.out.println(newt.toString());

    }
}
