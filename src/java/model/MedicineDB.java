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
public class MedicineDB {
    private int medID;
    private String name;
    private String detail;

    public MedicineDB() {
    }

    public MedicineDB(int medID, String name, String detail) {
        this.medID = medID;
        this.name = name;
        this.detail = detail;
    }

    public int getMedID() {
        return medID;
    }

    public void setMedID(int medID) {
        this.medID = medID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MedicineDB{" + "medID=" + medID + ", name=" + name + ", detail=" + detail + '}';
    }
    
    
}
