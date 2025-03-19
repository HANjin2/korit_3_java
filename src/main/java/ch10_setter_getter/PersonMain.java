package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
       Person person1 = new Person(-10);
//        person1.name = "한영진";
//        System.out.println(person1.name);
        // System.out.println(person1.age);
//        person1.age = 20; // Private 적용후에 오류 발생해서 주석처리합니다.

          // 메서드 호출 방식 : 객체명.메서드명();
        person1.setName("한영진");
        person1.setAge(38);
        person1.setAge(300);

        System.out.println(person1.getName());
        person1.setName("레오나르도디카프리오");
        System.out.println(person1.getName());
        person1.setName("김일");
        System.out.println(person1.getName());

    }
}

