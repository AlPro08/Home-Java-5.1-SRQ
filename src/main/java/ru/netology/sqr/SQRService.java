package ru.netology.sqr;

public class SQRService {

    public static void main(String[] args) {
        FindNumberSQR service = new FindNumberSQR();
        System.out.println("Количество кадратов = " + service.calculate(100, 500));

    }
}
