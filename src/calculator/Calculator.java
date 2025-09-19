package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    private String operator, exit = "";
    private int num1, num2;
    private double result = 0;
    List<Double> numbers = new ArrayList<>();


    Calculator() { //생성자
        System.out.println("계산기");
    }

    public void calculate() {
        numbers.add(result);
    }

    public void removeResult() {
        numbers.remove(0);
    }

    //히스토리 list로 출력
    public void resultList() {
        for (double numbers : numbers) {
            System.out.print(numbers + " "); // 각 요소를 한 줄씩 출력
        }
    }


    public void result() {
        if (num1 > 0 && num2 > 0) {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        break;
                    } else {
                        result = (double) num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                        break;
                    }

                default:
                    System.out.println("사칙연산 기호 중 하나를 입력해주세요.");
                    break;
            }
        } else {
            System.out.println("양의 정수만 입력해주세요.");
        }
    }


    void setData(int num1, int num2, String operator) {
        this.operator = operator;

        this.num1 = num1;
        this.num2 = num2;


    }

    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }

    String getOperator() {
        return operator;
    }
}

