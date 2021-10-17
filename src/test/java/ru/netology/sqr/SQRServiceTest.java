package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void whenLimitInBorders() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int border1 = 200;
        int border2 = 300;
        int expected = 3;
        // вызываем целевой метод:
        int actual = service.numberInRangeCalculator(border1, border2);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void whenLimitOnBoundaryValues() {
        SQRService service = new SQRService();
        int border1 = 100;
        int border2 = 9801;
        int expected = 90;
        int actual = service.numberInRangeCalculator(border1, border2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void whenLimitIsOutBorders() {
        SQRService service = new SQRService();
        int border1 = 10;
        int border2 = 9801;
        int expected = 0;
        int actual = service.numberInRangeCalculator(border1, border2);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void whenBorderValueIsUncorrect() {
        SQRService service = new SQRService();
        int border1 = -200;
        int border2 = 300;
        int expected = 0;
        int actual = service.numberInRangeCalculator(border1, border2);
        assertEquals(expected, actual);

    }
}