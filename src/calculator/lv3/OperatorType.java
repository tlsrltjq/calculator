package calculator.lv3;

public enum OperatorType {
    //ADD, SUB, MUL, DIV;


//    static OperatorType toString (String operator) {
//        return switch (operator) {
//            case "+" -> OperatorType.ADD;
//            case "-" -> OperatorType.SUB;
//            case "*" -> OperatorType.MUL;
//            case "/" -> OperatorType.DIV;
//            default  -> throw new IllegalArgumentException("연산자 오류: ");
//        };
//    }


    ADD("+"), SUB("-"), MUL("*"), DIV("/");


    private String symbol;
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType symbol(String operator) {
        for (OperatorType op : values()) {
            if (op.symbol.equals(operator)) {
                return op;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자");
    }



}
