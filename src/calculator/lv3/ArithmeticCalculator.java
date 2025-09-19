package calculator.lv3;

import java.util.ArrayList;
import java.util.List;


public class ArithmeticCalculator<T extends Number> {
//    private T num1, num2;
//    private String operator;  // 입력받은 연산자 기호
    double result;
    private final List<Double> results = new ArrayList<>();

//    public void setData(T num1, T num2, String operator) {
//        this.num1 = num1;
//        this.num2 = num2;
//        this.operator = operator;
//    }
//
//    public T getNum1() {
//        return num1;
//    }
//
//    public T getNum2() {
//        return num2;
//    }
//
//    public String getOperator() {
//        return operator;
//    }

    // 계산 실행
    public double calculate(T num1, T num2, String operator) {
        //OperatorType op = OperatorType.toString(operator);
        OperatorType op = OperatorType.symbol(operator);

        if(op == OperatorType.ADD){
            return num1.doubleValue() + num2.doubleValue();
        } else if(op == OperatorType.SUB){
            return num1.doubleValue() - num2.doubleValue();
        }


        switch (op) {
            case ADD:
                result =  num1.doubleValue() + num2.doubleValue();
                break;
            case SUB:
                result =  num1.doubleValue() - num2.doubleValue();
                break;
            case MUL:
                result =  num1.doubleValue() * num2.doubleValue();
                break;
            case DIV:
                result =  num1.doubleValue() / num2.doubleValue();
                break;

            default:
                return 0;
        }




        results.add(result);
        return result;
    }


}
