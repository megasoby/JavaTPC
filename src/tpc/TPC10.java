package tpc;

import tpc.kr.model.BookDTO;

public class TPC10 {
    public static void main(String[] args) {

        int a;
        a = 10;

        //객체 생성 - 메모리생성:heap area - new + 생성자 method
        BookDTO b = new BookDTO();
        b.title = "자바";
        b.price = 17000;
        b.company = "영진";
        b.page = 670;

        System.out.println(b.title + "\t");
        System.out.println(b.price + "\t");
        System.out.println(b.company + "\t");
        System.out.println(b.page + "\t");


    }
}
