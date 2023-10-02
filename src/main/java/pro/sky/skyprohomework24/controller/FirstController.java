package pro.sky.skyprohomework24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprohomework24.service.api.CalculatorService;

@RestController
public class FirstController {
    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String showWelcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/calculator/plus")
    public String summa(@RequestParam("num1") int usnum1, @RequestParam("num2") int usnum2) {
        return usnum1 + " + " + usnum2 + " = " + (usnum1 + usnum2);
    }

    @GetMapping(path = "/calculator/ minus")
    public String minus(@RequestParam("num1") int usnum1, @RequestParam("num2") int usnum2) {
        return usnum1 + " - " + usnum2 + " = " + (usnum1 - usnum2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int usnum1, @RequestParam("num2") int usnum2) {
        return usnum1 + " * " + usnum2 + " = " + (usnum1 * usnum2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int usnum1, @RequestParam("num2") int usnum2) {
        if (usnum2 == 0) {
            return "Ошибка: на ноль делить нельзя!";
        } else
            return usnum1 + " / " + usnum2 + " = " + (usnum1 / usnum2);

    }

    }

