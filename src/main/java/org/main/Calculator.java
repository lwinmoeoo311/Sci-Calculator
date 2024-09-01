package org.main;

import Interface.OperatorEnum;

public class Calculator {

    private final CalculationContainer container = CalculationContainer.getInstance();

    public void isNumber(String input) {
        if (input.matches("-?\\d+(\\.\\d+)?")) {
            container.setOperand(input);
        } else {
            container.setOperator(OperatorEnum.valueOf(input.toUpperCase()));
        }
    }
}
