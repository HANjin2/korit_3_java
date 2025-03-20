package ch00_review;


    /*
    for 반복문
    for(시작값 ; 한계값; 증감값) {
       반복실행문

      }
      시작값에는 처음 선언하는 변수여야 오류를 막을 수 있습니다.

      for(시작값 ; 한계값 ; 증감값) {
        반복실행문1
        while/if/for() {
            반복실행문2
          }
          반복실행문3
        }
     */
    public class Review04 {
        public static void main(String[] args) {
            int limitNumber =100;

           for ( int i = 0; i < limitNumber ; i++) {
//                // System.out.println(i + "");
//                // 짝수만 뽑아낼 수 있도록 하는 조건문을 작성하시오.
               int addedI = i + 1;
               if (addedI % 2 == 0) {
                   System.out.print(addedI + " ");
               }
           }
            /*\
            실행 예
            2
            4
            6
            8
            ...

            이상의 코드를 응용할겁니다. while문으로 개조할겁니다
            근데 짝수 말고 홀수가 출력되도록 작성하시오.
             */
            int i = 0;
            while(i < limitNumber) {
                if (i % 2 != 0) { // 숫자가 홀수인지 확인
                    System.out.print(i); //홀수만 출력
                }
                i++;
                /*
                여태까지 제가 코드를 작성하는 방식을 봤을 때
                사용하는 클래스들을 import - >  엔터 두번 친 다음에 사용할 변수 목록


                 */
            }

        }
}
