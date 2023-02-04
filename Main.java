package com.netology.java33.calculatorlyambda;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();


        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        calc.println.accept(c);
        /*
        Причина возникновения ошибки в том, что в строке 12 класса Calculator произошло исключение
         ArithmeticException, а именно ошибка деления на ноль.
          Данная  ошибка возникает, когда программа пытается разделить число на ноль, что не определено
        в математике. Ошибка произошла в лямбда-функции new и была вызвана из метода main в классе Main.
         */
    }
}
