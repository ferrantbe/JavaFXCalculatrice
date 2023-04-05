package be.ephec.java.calculatricecours;

public class Model {

    public long compute(long num1, String operator, long num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "x":
                return num1 * num2;
            case ":":
                if (num2 == 0) {
                    System.out.println("Erreur : division par 0");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Erreur : opérateur invalide");
                return 0;
        }
    }
}
