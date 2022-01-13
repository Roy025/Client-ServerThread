package com.company;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReaderThread implements Runnable{
    String Name;
    Socket socket;
    ReaderThread(Socket socket, String name){
        this.socket = socket;
        this.Name = name;
        new Thread(this).start();
    }
    @Override
    public void run() {
        while (true) {
            try {
                DataInputStream ois = new DataInputStream(socket.getInputStream());

            try {
                String received = ois.readUTF();
                System.out.println(Name  +  received);
            } catch (IOException e) {
                e.printStackTrace();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
