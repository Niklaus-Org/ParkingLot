package com.lld.parkinglot.controller;

import com.lld.parkinglot.dtos.IssueTicketRequestDto;
import com.lld.parkinglot.dtos.IssueTicketResponseDto;
import com.lld.parkinglot.models.Ticket;
import com.lld.parkinglot.services.TicketService;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
        return null;
    }
}
