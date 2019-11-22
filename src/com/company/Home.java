package com.company;
import javafx.scene.web.HTMLEditorSkin;

import java.util.Scanner;
public class Home {
    private State state = State.STOPPED;
    private String Command = "";

    static Home instance() {
        return object;
    }

    public void start() {
        state = State.LAUNCHED;
        while (State.LAUNCHED == state) {
            if(scan.hasNext()){
                Command = scan.nextLine();
                System.out.println(Command);
            }

        }
    }
    public String lock() {
        return "Locked";
    }
    public String unlock (){
        return "Unlocked";
    }
    private static Home object = new Home();
    private Scanner scan = new Scanner(System.in);
    private Home() {};
}

