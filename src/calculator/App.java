package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        String operator, select = "";
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        while (!select.equals("exit")) {
            System.out.print("첫번째 양의 정수를 입력해주세요 : ");
            num1 = sc.nextInt();
            System.out.print("두번째 양의 정수를 입력해주세요 ");
            num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력해주세요(+,-,*,/) : ");
            operator = sc.next();

            c.setData(num1, num2, operator); //데이터 세팅
            c.result(); //연산하기
            c.calculate(); //list에 저장
            c.removeResult(); //리스트 내용 제거

            System.out.print("더 계산하시겠습니까? ('exit' 입력 시 종료, 'list' 입력 시 히스토리 보기) : ");
            select = sc.next();

            if(select.equals("list")) { //list 입력 시 출력
                c.resultList();
                System.out.println("");
                continue;
            }

        }


    }


}
