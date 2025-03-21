package com.example.javaviikko10;

import java.util.ArrayList;

public class CarDataStorage {

    String city;
    int year;
    ArrayList<CarData> carData = new ArrayList<>();

    public CarDataStorage() {
        this.city = city;
        this.year = year;
        carData = new ArrayList<>();
    }
    private static CarDataStorage storage = null;

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCarData(ArrayList<CarData> carData) {

        this.carData = carData;
    }


    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<CarData> getCarData() {

        return carData;
    }

    static  public  CarDataStorage getInstance() {
        if (storage == null) {
            storage = new CarDataStorage();
        }
        return storage;
    }



}
