package org.example.abstractfactory.product.screen;

public class LenovoMonitor implements Monitor {
    private final static String MESSAGE = "The Screen Dell that was chosen: Model %s, size %s, resolution %s";
    private final static String RESOLUTION = "Full HD";
    @Override
    public void chooseModel(String model, long size, int resolution) {
        System.out.println(String.format(MESSAGE,model, size,RESOLUTION));
    }
}
