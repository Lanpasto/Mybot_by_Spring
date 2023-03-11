package com.bot.service.implementation;


import com.example.bot.model.Update;
import com.example.bot.service.UpdateService;
import org.springframework.stereotype.Service;

@Service
public class UpdateServiceImpl implements UpdateService {

    @Override
    public void processUpdate(Update update) {
        // Реалізація обробки отриманих оновлень
    }
}