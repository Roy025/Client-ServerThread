package com.company;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client started..");
        Socket socket = new Socket("127.0.0.1", 22223);
        System.out.println("Client Connected..");
        new WriterThread(socket, "Client : ");
        new ReaderThread(socket, "Server : ");
    }
}