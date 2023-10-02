package pro.sky.skyprohomework24.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.skyprohomework24.service.api.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {



    public int summa(int usnum1, int usnum2) {
        return usnum1 + usnum2;
    }

    public int minus(int usnum1, int usnum2) {
        return usnum1 - usnum2;
    }

    public int multiply(int usnum1, int usnum2) {
        return usnum1 * usnum2;
    }

    public int divide(int usnum1, int usnum2) {
        return usnum1 / usnum2;
    }

}


