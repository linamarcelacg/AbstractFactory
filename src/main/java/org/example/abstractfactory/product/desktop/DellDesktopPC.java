package org.example.abstractfactory.product.desktop;

public class DellDesktopPC implements DesktopPC {

    private final static String MESSAGE_1 = "The computer Dell was created with this features: RAM %s, Processor %s, HardDiskDrive %s";
    private final static String MESSAGE_2 = "You receive a 15% discount in the next purchase";

    @Override
    public void configureFeatures(int RAM, String processor, int hardDiskDrive) {
        System.out.println(String.format(MESSAGE_1, RAM, processor, hardDiskDrive));
        System.out.println(MESSAGE_2);

    }
}
