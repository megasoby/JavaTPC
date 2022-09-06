package tpc;

import tpc.kr.model.BookDTO;
import tpc.kr.model.BookVO;

public class TPC12 {

    public static void main(String[] args) {

//        BookVO b1 = new BookVO("Oracle", 19000, "SSG", 700);

        BookDTO bookDTO = new BookDTO("megasoby", 10000, "pwerbhs", 700);

        System.out.println(bookDTO.toString());

    }
}
