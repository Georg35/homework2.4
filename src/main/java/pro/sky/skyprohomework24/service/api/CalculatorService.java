package pro.sky.skyprohomework24.service.api;

public interface CalculatorService {
    String showWelcome();

    String summa(int usnum1, int usnum2);

    String minus(int usnum1, int usnum2);
    String multiply(int usnum1, int usnum2);
    String divide(int usnum1, int usnum2);
}
