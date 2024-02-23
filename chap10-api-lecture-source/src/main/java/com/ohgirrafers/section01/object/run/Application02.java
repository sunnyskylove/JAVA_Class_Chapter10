package com.ohgirrafers.section01.object.run;

import com.ohgirrafers.section01.object.book.Book;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. Object 클래스의 equals() 메소드 오버라이딩 목적을 이해하고, 활용 할 수 있다. */
        /* 필기.
         *   equals() 메소드 오버라이딩
         *   equals() 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false 를 반환한다.
         *   즉, 동일(주소는 달라도 값은 똑같다.)한 인스턴스인지 비교하는 역할을 한다.
         *
         * 필기.
         *  동일객체와 동등객체
         *   동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         *   동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체 라고 한다.
         * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        /* 필기.
         *   equals() 메소드의 기본 기능은 동일객체 판단할 수 있다.
         *   경우에 따라서 동등객체(값이 같은 지) 를 동일 객체로 취급해서 비교하고 싶은 경우가 생길 수 있다.
         *   그러한 경우에 equals() 메소드를 오버라이딩 하여, 각각의 필드가 동일한 값을 가지는 지 확인하고
         *   모든 필드 값이 같은 경우 true, 아닌 경우 false 를 반환한다.
         * */
        System.out.println(" 두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println(" 두 인스턴스의 equals() 비교 : " + (book1.equals(book2))); //false였는데, equals 다른 클래스에 작성하고, 필드의 값이 같게 되어서 true로 변경됨 확인

    }

}
