package com.adr.test.errorscategory.type;



public class IncorrectCalculationsERR {

    public void LogicError1() {
        int a = 5;
        int b = 3;
        int result = a - b;
        System.out.println("Resultado: " + result);
        // Error de lógica: La resta debería ser una suma (a + b), no una resta.
    }

    public void LogicError2() {
        int x = 10;
        if (x > 20) {
            System.out.println("x es mayor que 20");
        } else {
            System.out.println("x es menor o igual a 20");
        }
        // Error de lógica: La condición x > 20 es incorrecta porque x es 10. Debe ser x < 20.
    }

}
