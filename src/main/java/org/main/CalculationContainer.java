package org.main;

import Interface.OperatorEnum;

public class CalculationContainer {

    static String prompt = null;
    private static CalculationContainer container;

    public static CalculationContainer getInstance() {

        if (container == null) {
            container = new CalculationContainer();
        }
        return container;
    }

    protected void setOperand(String operand) {
        if (prompt == null) {
            prompt = "";
        }
        prompt += operand;
    }

    protected void setOperator(OperatorEnum operator) {
        switch (operator) {
            case ADD -> System.out.println("Add");
            case SUB -> System.out.println("Sub");
            case MUL -> System.out.println("Mul");
            case DIV -> System.out.println("Div");
        }
        prompt += operator.getOperator();
    }

    public static String getPrompt() {
        return prompt;
    }
}
