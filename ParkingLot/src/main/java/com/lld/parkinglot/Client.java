package com.lld.parkinglot;

import com.lld.parkinglot.controller.TicketController;
import com.lld.parkinglot.dtos.IssueTicketRequestDto;
import com.lld.parkinglot.dtos.IssueTicketResponseDto;
import com.lld.parkinglot.models.Ticket;
import com.lld.parkinglot.models.VehicleType;
import com.lld.parkinglot.services.TicketService;

import java.util.Date;

public class Client {
    public static void main(String[] args) {


        IssueTicketRequestDto issueTicketRequestDto = new IssueTicketRequestDto();
        issueTicketRequestDto.setVehicleOwnerName("amar");
        issueTicketRequestDto.setEntryTime(new Date());
        issueTicketRequestDto.setGateId(12L);
        issueTicketRequestDto.setVehicleNumber("ABCD");
        issueTicketRequestDto.setVehicleType(VehicleType.TWO_WHEELER);

        TicketService ticketService = new TicketService();

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto ticketResponse = ticketController.issueTicket(issueTicketRequestDto);

        System.out.println(ticketResponse.toString());
    }
}
