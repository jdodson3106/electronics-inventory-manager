package com.justindodson.electronicsinventorymanager.business.data.entity;

import javax.persistence.Entity;

@Entity
public class Electromechanical extends Component {
    private String category;
    private String type;
    private double torqueRating;
    private double power;
    private double coilVoltage;
    private double tolearance; // "Accuracy for motors"

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTorqueRating() {
        return torqueRating;
    }

    public void setTorqueRating(double torqueRating) {
        this.torqueRating = torqueRating;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getCoilVoltage() {
        return coilVoltage;
    }

    public void setCoilVoltage(double coilVoltage) {
        this.coilVoltage = coilVoltage;
    }

    public double getTolearance() {
        return tolearance;
    }

    public void setTolearance(double tolearance) {
        this.tolearance = tolearance;
    }
}
