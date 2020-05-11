package ru.kpfu.itis.j903.minsafin.test;

import ru.kpfu.itis.j903.minsafin.test.myutils.Controller;

public class MyApp implements App {
    public static void main(String[] args) {
        App app = new MyApp();
        app.init();
        app.start();
    }

    public void start() {
        Controller controller = new Controller();
        controller.start();
    }

    public void init() {

    }
}
