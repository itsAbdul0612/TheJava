package JavaGenerics;


enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD -> {
                return a.doubleValue() + b.doubleValue();
            }
            case SUBTRACT -> {
                return a.doubleValue() - b.doubleValue();
            }
            case MULTIPLY -> {
                return a.doubleValue() * b.doubleValue();
            }
            case DIVIDE -> {
                return a.doubleValue() / b.doubleValue();
            }
            default -> throw new AssertionError("Unknown Operation " + this);
        }
    }
}

public class Enum_n_Method {
    public static void main(String[] args) {

        System.out.println(Operation.ADD.apply(20, 30));

    }
}
