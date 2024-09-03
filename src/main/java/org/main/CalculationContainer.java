package org.main;

import Interface.OperatorEnum;

public class CalculationContainer {

    public static boolean FINISHED_OPERATION = true;
    private static String prompt = "";
    private static String operator = "+";
    private static String operand = "";
    private double tmpResult = 0.0;
    private static double result = 0.0;
    private static CalculationContainer container;

    public static CalculationContainer getInstance() {

        if (container == null) {
            container = new CalculationContainer();
        }
        return container;
    }

    protected void setOperand(String operand) {
        if (!FINISHED_OPERATION) {
            CalculationContainer.operand = operand;
            FINISHED_OPERATION = true;
        } else {
            CalculationContainer.operand += operand;
            result = tmpResult;
        }
        prompt += operand;
        calculate();
    }

    protected void setOperator(String operator) {
        switch (OperatorEnum.valueOf(operator)) {
            case ADD, SUB, MUL, DIV, MOD -> {
                CalculationContainer.operator = OperatorEnum.valueOf(operator).getOperator();
                tmpResult = result;
                FINISHED_OPERATION = false;
            }
            case CLR -> prompt = "";
            case STOP -> Main.inputFlg = false;
            default -> CalculationContainer.operator = "";
        }
        prompt += CalculationContainer.operator;
    }

    protected void calculate() {

        switch (operator) {
            case "+" -> {
                result += Integer.parseInt(operand);
            }
            case "-" -> {
                result -= Integer.parseInt(operand);
            }
            case "*" -> {
                result *= Integer.parseInt(operand);
            }
            case "/" -> {
                result /= Integer.parseInt(operand);
            }
        }
    }

    public static String getPrompt() {
        return prompt;
    }

    public static String getResult() {
        return Double.toString(result);
    }
}
