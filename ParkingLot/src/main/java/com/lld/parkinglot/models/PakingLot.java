package com.lld.parkinglot.models;

import java.util.List;

public class PakingLot extends BaseModel{
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gateList;
    private List<VehicleType> vehicleTypes;
    private FeeCalculationStrategyType feeCalculationStrategyType;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;

    @Override
    public String toString() {
        return "PakingLot{" +
                "parkingFloorList=" + parkingFloorList +
                ", gateList=" + gateList +
                ", vehicleTypes=" + vehicleTypes +
                ", feeCalculationStrategyType=" + feeCalculationStrategyType +
                ", spotAssignmentStrategyType=" + spotAssignmentStrategyType +
                '}';
    }

    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }

    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }
}
