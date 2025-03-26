package ch12_inheritance.products;

import java.security.spec.RSAOtherPrimeInfo;

public class Product extends Item {
    private int price;
    private int stock;

    // 빨간줄 생기길래 생성자 만들래서 만들었더니 부모 속성만 받아옴
    // 부모의 속성과 자식의 속성을 전부 다 입력해야하는 AllArgsConstructor를 생성하시오
    public Product(String name, String cagegory, int price, int stock) {
        super(name, cagegory);
        this.price = price;
        this.stock = stock;
    }


    // 부모 속성의 Setter / Getter

    public Product(String name, String cagegory) {
        super(name, cagegory);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getCagegory() {
        return super.getCagegory();
    }

    @Override
    public void setCagegory(String cagegory) {
        super.setCagegory(cagegory);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    // 자식 속성의 Setter / Getter

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 이상까지의 코드를 작성했을 때 ProductMain에서 할 수 있는 것
    // 1. 객체 생성을 필드를 전부 초기화했을 떄 할 수 있음.
    // 2. 부모 속성이든 자식 속성이든 상관없이 Getter / Setter

    // 고유 메서드
    public void displayInfo(){
        System.out.println("제품명 :" + this.getName());
        System.out.println("카테고리 : " +this.getName());
        System.out.println("가격 : " + price); // 부모클래스긴 한데 서로 다른 클래스인데다가 private이라서
        System.out.println("재고 : " + stock); // 같은 클래스라서  Private이라도 상관없음
    }
}

