package ch12_inheritance.products;
/*
부모 클래스 Item
자식 클래스 Product
실행 클래스 ProductMain 클래스 생성

Item 클래스에
1. field 선언 private String name, private String category
2. AllArgsConstructor를 생성하세요 ( 필드 전체를 다 사용하는 생성자)
3. Setter / Getter
4. Product.java에서 Item - 부모 클래스 / Product - 자식 클래스
 */

public class Item {
    private String name;
    private String cagegory;

    //생성자

    public Item(String name, String cagegory) {
        this.name = name;
        this.cagegory = cagegory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCagegory() {
        return cagegory;
    }

    public void setCagegory(String cagegory) {
        this.cagegory = cagegory;
    }
}
