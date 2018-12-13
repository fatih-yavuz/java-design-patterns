package com.fatihpy.Singleton;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println(logger.hashCode() == logger1.hashCode());

        logger.log();

    }
}
