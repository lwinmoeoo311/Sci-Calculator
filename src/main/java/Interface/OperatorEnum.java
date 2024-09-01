package Interface;

public enum OperatorEnum {
    ADD("+"),
    SUB("-"),
    MUL("*"),
    DIV("/");

    private String operator;
    OperatorEnum(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
