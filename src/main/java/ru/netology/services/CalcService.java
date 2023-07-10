package ru.netology.services;

public class CalcService {

    public int calculate(int income, int expenses,int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int i= 0; i < 12; i++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;
                money /=3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}
