package tpc.kr.model;

public class BookVO {

    public String title;
    public int price;
    public String company;
    public int page;

    public BookVO() {
        super();
    }

    public BookVO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
