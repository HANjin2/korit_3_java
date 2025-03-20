package ch11_access_modfier;


class Person {
    private String name;

    // Private 이기 떄문에 이 Person 클래스 외부에서는 name을
    // 참조 할 수 없다 -> 우회방법이 뭐다 ? Setter / Getter다

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // setter / getter는 보니까 access modifer가 public이니까
    // 클래스 외부에서 사용할 수 있겠다.
    // 그러니까 우회를 통해서 Person 클래스의 객체의 속성값을
    // 바꿀 수 있다.
    // 귀찮은데 왜 하는가?
  // 어제 했던 것처럼 말도 안되는 데이터 값을 걸러내는 로직을 쓸 수 있다.


}

public class PersonMain {
    public static void main(String[] args) {
       // 객체 생성
//        Person person1 = new Person();
//        person1.setName("김일");
//        System.out.println(person1.getName());
//        person1.setName("이일");
//        System.out.println(person1.getName());

        int num = 1;
        System.out.println(num);
         num += 3;
        System.out.println(num);
        num -= 2;
        System.out.println(num);
        num *= 3;


    }
}
