package org.example;

import org.example.client.Display;
import org.example.client.GameEngine;
import org.example.client.MakaoView;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Makao");
        MakaoView makaoView = new MakaoView();
        GameEngine engine = new GameEngine(display, makaoView);

        display.addListener(makaoView);
        engine.start();
    }
}