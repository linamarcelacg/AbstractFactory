package org.example.abstractfactory.product.screen;

public class DellMonitor implements Monitor {

    private final static String MESSAGE = "The Screen Dell that was chosen: Model %s, size %s, resolution %s";
    private final static String OPTION_1 = "1080i, Full HD";
    private final static String OPTION_2 = "1440p, Quad HD";
    private final static String OPTION_3 = "4K UHD,  Ultra HD";
    private final static String OPTION_4 = "8K UHD, 8K UHD";
    private final static String DEFAULT = "720p, Standard HD";

    @Override
    public void chooseModel(String model, long size, int resolution) {
        String resolutionStandard;

        switch (resolution){
            case 1: resolutionStandard = OPTION_1; break;
            case 2: resolutionStandard = OPTION_2; break;
            case 3: resolutionStandard = OPTION_3; break;
            case 4: resolutionStandard = OPTION_4; break;
            default: resolutionStandard = DEFAULT;
        }
        System.out.println(String.format(MESSAGE, model, size, resolutionStandard));
    }
}
