package com.alexmikha.coffeeMachine;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    static List<Integer> bankList = new ArrayList<>();
    private int bankAll ;
    private int bankMin = 10;
    private int bankMax = 27;
    int bank;

    public int checkBank() {

        if (!bankList.isEmpty()) {
            int sum = 0;
            for (Integer b : bankList) {
                sum = sum + b;
            }
            bankAll = sum;
            setBankAll(sum);
            if (getBankAll() >= getBankMax()) {
                System.out.println("The Bank is full!!!");
                MenuCoffee mc = new MenuCoffee();
                mc.menuAdmin();
            }
        }
            else
                bankList.add(getBankMin());
        return 0;
    }

    public int putBank(int cost) {

            bankList.add(cost);
            int sum = 0;
            for (Integer b : bankList) {
                sum = sum + b;
            }
            bank = sum;
            setBankAll(bank);
        return cost;
    }

    public int getBankAll() {
        return bankAll;
    }

    public void setBankAll(int bankAll) {
        this.bankAll = bankAll;
    }

    public int getBankMin() {
        return bankMin;
    }

    public int getBankMax() {
        return bankMax;
    }

    public static List<Integer> getBankList() {
        return bankList;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "allbank=" + bankAll +
                ", bankmin=" + bankMin +
                ", bankmax=" + bankMax +
                ", bank=" + bank +
                '}';
    }
}
