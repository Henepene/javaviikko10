package com.example.javaviikko10;

public class CarData {
    int amount;

    String type;
    public CarData(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public int getAmount() {

        return amount;
    }


    public String getType() {

        return type;
    }


}
