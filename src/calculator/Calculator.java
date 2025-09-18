package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String operator, exit ="";
        int num1, num2;
        int result=0;


        while (!exit.equals("exit")) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫번째 양의 정수를 입력해주세요 : ");
            num1 = sc.nextInt();
            System.out.print("두번째 양의 정수를 입력해주세요 ");
            num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력해주세요(+,-,*,/) : ");
            operator = sc.next();

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        continue;
                    }else  {
                        result = num1 / num2;
                        break;
                    }
                default:
                    System.out.println("사칙연산 기호 중 하나를 입력해주세요.");
                    continue;
            }

            System.out.println(num1 + operator + num2 + " = " + result);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) : ");
            exit = sc.next();
        }


    }
}
