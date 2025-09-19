package calculator.lv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator c = new ArithmeticCalculator();
        String operator, input = "";
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        while (!input.equals("exit")) {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            num1 = sc.nextDouble();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            num2 = sc.nextDouble();
            System.out.print("사칙연산 기호를 입력해주세요(+,-,*,/) : ");
            operator = sc.next();


            double result = c.calculate(num1, num2, operator); //연산하기
            System.out.println(result);


            System.out.print("더 계산하시겠습니까? ('exit' 입력 시 종료, 'list' 입력 시 히스토리 보기) : ");
            input = sc.next();

        }
        sc.close();
    }
}
