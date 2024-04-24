package generics.stance2;

public class test1 {
    public static void main(String[] args) {
        Integer[] a = { 10, 20, 30 };
        Character[] c = { 'a', 'b', 'c' };
        String[] s = { "hello toi la cuong", "xin chao moi nguoi" };
        System.out.println("kq cua interger: ");
        sort_generics(a);
        System.out.println("kq cua character: ");
        sort_generics(c);
        System.out.println("kq cua string: ");
        sort_generics(s);
    }

    public static <T extends Comparable<T>> void sort_generics(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    swap(j, j + 1, a);
                }
            }
        }

        for (T i : a) {
            System.out.println(i + ", ");
        }
        System.out.println();
    }

    public static <T> void swap(int i, int j, T[] a) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
