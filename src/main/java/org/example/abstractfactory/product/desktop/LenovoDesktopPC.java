package org.example.abstractfactory.product.desktop;

public class LenovoDesktopPC implements DesktopPC{

    private final static String MESSAGE_1 = "The computer Lenovo was created with this features: RAM %s, Processor %s, HardDiskDrive %s";
    private final static String MESSAGE_2 = "You receive a bag as gift";
    @Override
    public void configureFeatures(int RAM, String processor, int hardDiskDrive) {
        System.out.println(String.format(MESSAGE_1, RAM, processor, hardDiskDrive));
        System.out.println(MESSAGE_2);
    }
}
