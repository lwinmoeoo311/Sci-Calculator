package Operation;

import Interface.OperatorInterface;

public class Operator implements OperatorInterface {
    protected String opt;
    protected static String result;

    public Operator(String opt) {
        this.opt = opt;
    }
    @Override
    public <T> T calculate(T num) {
        return null;
    }
}
