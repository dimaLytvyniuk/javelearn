package com.company;

/**
 * Created by dima on 04.04.17.
 */
public class Date implements Command {
    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}