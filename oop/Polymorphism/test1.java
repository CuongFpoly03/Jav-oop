package oop.Polymorphism;

class Info {
    void getInfo() {
        System.out.println("loadings...");
    }
}

class Hoten extends Info {
    void getInfo() {
        System.out.println("Le Phu Cuong");
    }
}

class Age extends Info {
    void getInfo() {
        System.out.println("12");
    }
}

class Hometwo extends Info {
    void getInfo() {
        System.out.println("Thanh Hoa");
    }
}

class test {
    public static void main(String[] args) {
        Info a = new Hoten();
        a.getInfo();
        Info b = new Age();
        b.getInfo();
        Info c = new Hometwo();
        c.getInfo();
    }
}