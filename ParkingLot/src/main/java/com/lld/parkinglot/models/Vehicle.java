package com.lld.parkinglot.models;

public class Vehicle extends BaseModel{
    private String number;
    private String vehicleOwner;
    private VehicleType vehicleType;

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", vehicleOwner='" + vehicleOwner + '\'' +
                ", vehicleType=" + vehicleType +
                '}';
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(String vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
