package com.lld.parkinglot.dtos;

import com.lld.parkinglot.models.VehicleType;

import java.util.Date;

public class IssueTicketRequestDto {
    private long gateId;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private Date entryTime;
    private String vehicleOwnerName;

    @Override
    public String toString() {
        return "IssueTicketRequestDto{" +
                "gateId=" + gateId +
                ", vehicleType=" + vehicleType +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", entryTime=" + entryTime +
                ", vehicleOwnerName='" + vehicleOwnerName + '\'' +
                '}';
    }

    public long getGateId() {
        return gateId;
    }

    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getVehicleOwnerName() {
        return vehicleOwnerName;
    }

    public void setVehicleOwnerName(String vehicleOwnerName) {
        this.vehicleOwnerName = vehicleOwnerName;
    }
}
