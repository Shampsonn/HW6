package ru.netology.services;

public class RestMouthService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int mouth = 1; mouth <= 12; mouth++) {
            if (money >= threshold) {
                System.out.println("Месяц " + mouth + ". Денег " + money + ". Буду отдыхать" + ". Потратил -" + expenses + ", затем еще -" + money / 3);
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                System.out.println("Месяц " + mouth + ". Денег " + money + ". Буду работать" + ". Заработал +" + income + ". Потратил -" + expenses);
                money = (money + income) - expenses;
            }
        }
        return count;
    }
}
