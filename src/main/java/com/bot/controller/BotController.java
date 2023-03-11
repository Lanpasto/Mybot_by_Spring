package com.bot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class BotController {

    private final BotService botService;

    @Autowired
    public BotController(BotService botService) {
        this.botService = botService;
    }

    @PostMapping("/bot")
    public ResponseEntity<BotApiMethod<?>> onUpdateReceived(@RequestBody Update update) {
        BotApiMethod<?> response = botService.onUpdateReceived(update);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/help")
    public ResponseEntity<String> help() {
        return ResponseEntity.ok("How can I help you?");
    }

    @GetMapping("/start")
    public ResponseEntity<String> start() {
        return ResponseEntity.ok("Hello, I'm your bot!");
    }

}
