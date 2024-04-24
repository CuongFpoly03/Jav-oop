package oop.Class;

class test1 {
  int a;
  String n;

  void passparament(int newa, String newn) {
    a = newa;
    n = newn;
  }

  void printAttribute() {
    System.out.println(a + n);
  }
}

class test2 {
  public static void main(String[] args) {
    test1 t = new test1();
    test1 e = new test1();
    test1 s = new test1();
    t.passparament(10, "le");
    e.passparament(20, "phu");
    s.passparament(30, "cuong");
    t.printAttribute();
    e.printAttribute();
    s.printAttribute();
  }
}
