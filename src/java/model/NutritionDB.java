/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author LudjaPae
 */
public class NutritionDB {
    private int nutriID;
    private String name;
    private double carb;
    private double cal;
    private double quantitySugar;

    public NutritionDB() {
    }

    public NutritionDB(int nutriID, String name, double carb, double cal, double quantitySugar) {
        this.nutriID = nutriID;
        this.name = name;
        this.carb = carb;
        this.cal = cal;
        this.quantitySugar = quantitySugar;
    }

    public int getNutriID() {
        return nutriID;
    }

    public void setNutriID(int nutriID) {
        this.nutriID = nutriID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCarb() {
        return carb;
    }

    public void setCarb(double carb) {
        this.carb = carb;
    }

    public double getCal() {
        return cal;
    }

    public void setCal(double cal) {
        this.cal = cal;
    }

    public double getQuantitySugar() {
        return quantitySugar;
    }

    public void setQuantitySugar(double quantitySugar) {
        this.quantitySugar = quantitySugar;
    }

    @Override
    public String toString() {
        return "NutritionDB{" + "nutriID=" + nutriID + ", name=" + name + 
                ", carb=" + carb + ", cal=" + cal + ", quantitySugar=" + quantitySugar + '}';
    }
    
    
}
