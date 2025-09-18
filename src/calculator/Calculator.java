package calculator;

public class Calculator {
    private String operator, exit = "";
    private int num1, num2;
    private int result = 0;

    Calculator() {
        System.out.println("계산기");
    }


    public double calculate() {
        return result;
    }

    public void removeResult() {
        /* 구현 */
    }


    public void result() {
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
                    double div = (double) num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + div);
                    break;
                }

            default:
                System.out.println("사칙연산 기호 중 하나를 입력해주세요.");
                break;
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

