package com.example.demo5.solar.entities;

import java.sql.Timestamp;

public class Donnee {

    public Donnee(){}
    public Donnee(double voltage, double courant, double energie, double puissance, Timestamp temps) {
        this.voltage = voltage;
        this.courant = courant;
        this.energie = energie;
        this.puissance = puissance;
        this.temps = temps;
    }

    double voltage;
    double courant;
    double energie;
    double puissance;
    Timestamp temps;

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCourant() {
        return courant;
    }

    public void setCourant(double courant) {
        this.courant = courant;
    }

    public double getEnergie() {
        return energie;
    }

    public void setEnergie(double energie) {
        this.energie = energie;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public Timestamp getTemps() {
        return temps;
    }

    public void setTemps(Timestamp temps) {
        this.temps = temps;
    }
}
