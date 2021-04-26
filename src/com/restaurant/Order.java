package com.restaurant;

public class Order implements Command {
    private final Object chef;
    private final String food;

    public Order(Chef chef,
                 String food) {
        this.chef = chef;
        this.food = food;
    }

    @Override
    public void execute() {
        //TODO: COMPLETE
    }
}
