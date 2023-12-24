package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestMouthService calculate = new RestMouthService();
        int mouth = calculate.calculate(100_000, 60_000, 150_000);
        System.out.println("В итоге месяцев отдыха: " + mouth);


    }
}