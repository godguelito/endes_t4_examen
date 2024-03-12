package Refactor;

public class InterestCalculator {
    static final int diasdelaño = 365; //Se creo una variable fija de días del año que sea igual a 365.
    double calculateInterest(double principal, double rate, int time) {
        // Cálculo del interés compuesto para 365 días al año
        return principal * Math.pow(1 + (rate / diasdelaño), time * diasdelaño);
    }
}
