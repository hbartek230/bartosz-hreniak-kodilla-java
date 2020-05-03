package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.interfaces.MessageService;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(User user) {
        System.out.println("Ordered");
    }
}
