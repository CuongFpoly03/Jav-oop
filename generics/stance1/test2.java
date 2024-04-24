package generics.stance1;

class test2 {
    static <T> void geniricsNew(T element) {
        System.out.println(element.getClass().getName() + "=" + element);
    }

    public static void main(String[] args) {
        geniricsNew(10);
        geniricsNew("Le Phu Cuong");
        geniricsNew(1.2);
        geniricsNew("hen gap lai ngay mai !");
    }
}
