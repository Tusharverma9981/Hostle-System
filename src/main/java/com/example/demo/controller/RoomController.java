package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner/room")
public class RoomController {

    @GetMapping("/add")
    public String addRoom() {
        return "owner/add-room";
    }

    @GetMapping("/list")
    public String roomList() {
        return "owner/room-list";
    }
}
