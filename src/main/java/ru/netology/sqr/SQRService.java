package ru.netology.sqr;

public class SQRService {
    /* Выделим допустимый диапазон:
    по условию задачи, перебираем числа от 10 до 99, следовательно
    начало диапазона = 10*10 = 100; конец диапазона = 99*99 = 9801;
    значения выходящие за эти рамки не будут запускать цикл.
    */
    public int numberInRangeCalculator(int border1, int border2) {
        int counter = 0;
        if (border1 < 100 || border2 > 9801) {
            return 0;
        } else if (border1 > border2) {
            return 0;
        } else if (border1 > 9801) {
            return 0;
        } else {
            for (int i = 10; i < 100; i++) {
                if (i * i <= border2 && i * i >= border1) {
                    counter = counter + 1;
                }
            }
        }
        return counter;
    }
}
