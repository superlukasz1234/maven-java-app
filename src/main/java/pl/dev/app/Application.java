package pl.dev.app;

import pl.dev.app.sevice.MessageService;
import pl.dev.app.sevice.impl.MessageServiceImpl;

public class Application {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        System.out.println(messageService.getMessage());
    }
}
