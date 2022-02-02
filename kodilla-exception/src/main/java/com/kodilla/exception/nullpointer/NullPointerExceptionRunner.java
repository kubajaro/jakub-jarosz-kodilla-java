package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageToUser(user, "messageeeee");
        }catch(MessageNotSendException e){
            System.out.println("Message will not be sent but the program will keep running...");
        }
    }
}
