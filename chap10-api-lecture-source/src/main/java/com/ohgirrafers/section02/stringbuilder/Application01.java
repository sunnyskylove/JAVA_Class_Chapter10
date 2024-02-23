package com.ohgirrafers.section02.stringbuilder;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. String 과 StringBuilder 의 차이점에 대해 이해할 수 있다. */
        /* 필기.
        *   String : 불변의 특성을 가지고 있다.
        *            즉, 문자열에 + 연산으로 합치기를 하는 경우 기존 인스턴스를 수정하는 것이
        *           아닌, 새로운 인스턴스를 반환한다.
        *           따라서 문자열 변경이 자주 일어나면 성능 면에서 좋지 않다.
        *   StringBuilder : 가변의 특성을 가지고 있다.
        *                   문자열에 append() 메소드를 이용하여 합치기를 하는 경우
        *                   기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
        *                   따라서 잦은 문자열 변경 시 String 보다 성능이 좋다.
        * */

        StringBuilder sb = new StringBuilder("java");

        System.out.println("sb = " + sb);           // java
        // hashcode가 아닌 바로 값이 나온 이유는 자동으로 toString이 오버라이드 되어있어서이다.

        System.out.println("sb 의 hashcode : " + sb.hashCode());

        // 문자열 수정
        sb.append("orcle");         //추가 되면서 문자열 합치기가 됨
        System.out.println("ssb = " + sb);          //javaoracle

        System.out.println("sb 의 hashcode : " + sb.hashCode());


        // ▶ 원본에 영향을 미친다.

    }


}
