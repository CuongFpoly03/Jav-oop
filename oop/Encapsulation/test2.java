package oop.Encapsulation;

class test2 {
    private int sum;
    
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

class Main {
    public static void main(String[] args) {
        test2 newobj = new test2();
        newobj.setSum(20);
        System.out.println("tong la" + newobj.getSum());
    }
}


