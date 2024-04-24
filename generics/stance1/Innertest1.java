package generics.stance1;

class test1<T> {
    T obj;
    test1(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}

class Main {
    public static void main(String args[]) {
        test1<Integer> iObj = new test1<Integer>(10);
        System.out.println(iObj.getObj());
        test1<String> sObj = new test1<String>("toi la cuong");
        System.out.println(sObj.getObj());
    }
}
