package tpc;

public class TPC09 {

    public static void main(String[] args) {
        int a = 56;
        int b = 40;

        // non static method 호출, 객체생성(heap Area 생성됨)
        TPC09 tpc = new TPC09();
        int v = tpc.sum(a, b);

        System.out.println("v = " + v);
    }

    public int sum(int a, int b) {
        int v = a + b;
        return v;
    }
}
