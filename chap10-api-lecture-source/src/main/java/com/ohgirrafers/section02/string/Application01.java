package com.ohgirrafers.section02.string;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메소드에 대해 알 수 있다. */

        /* 필기.
         *   charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         * */

        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /* 필기.
         *   compareTo() : 인자로 문자열을 전달하여, 같으면 0을 반환,
         *                 전달 된 문자열이 작으면 음수, 크면 양수를 반환한다.
         * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));
        System.out.println("compareTo() : " + (str2.compareTo(str4)));  // 아스키코드 32만큼 차이나기때문에 32출력됨
        System.out.println("compareTo() : " + (str4.compareTo(str2)));

        /* 필기. compareToIgnoreCase() : 대소문자 구분하지 않고 비교 */
        System.out.println("compareToIgnoreCase() " + (str4));   // 문자열인 JAVA로 출력됨

        /* 필기. concat() : 문자열 합쳐주기, 원본 문자열에는 영향을 주지 않는다. */
        System.out.println("concat() : " + (str2.concat(str5)));      // javaorcle 이 출력됨
        System.out.println("str2 : " + str2);   //java로 출력, 원본에는 영향 주지 않는다 확인

        /* 필기. trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   ";      // 공백 3칸씩

        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim()+ "#");     // 공백제거됨 확인

        /* 필기. toLowerCase() : 모든 문자를 소문자로 변환  -> 반대 toUpper */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        // 모두 소문자로 변경되어 출력

        /* 필기. length() : 문자열의 길이를 정수형으로 반환 */
        System.out.println("length() : " + caseStr.length());     // 문자 개수 출력

        /* 필기. replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환, 원본에는 영향 x */
        String javaoracle = "javaoracle";

        System.out.println("replace() : " + javaoracle.replace("java","python"));
        // 원래 있는 문자열중을 다른것으로 변경

        /* 필기. isEmpty() : 문자열의 길이가 0이면 true, 아니면 false 반환 */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abs".isEmpty());



    }
}
