package org.example;

import org.example.client.Display;
import org.example.client.GameEngine;
import org.example.client.MakaoView;

public class Main {
    public static void main(String[] args) {
        Display display = new Display("Makao");
        GameEngine engine = new GameEngine(display, new MakaoView());

        engine.start();
    }
}