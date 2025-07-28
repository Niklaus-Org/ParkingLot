package com.lld.parkinglot.models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
     private Ticket ticket;
     private Gate gate;
     private Date exitTime;
     private BillStatus billStatus;
     private List<Payment> paymentList;
     private double amount;

    @Override
    public String toString() {
        return "Bill{" +
                "ticket=" + ticket +
                ", gate=" + gate +
                ", exitTime=" + exitTime +
                ", billStatus=" + billStatus +
                ", paymentList=" + paymentList +
                ", amount=" + amount +
                '}';
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
