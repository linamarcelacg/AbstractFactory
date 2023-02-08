package org.example.abstractfactory;


import org.example.abstractfactory.factory.ICompanyFactory;
import org.example.abstractfactory.product.desktop.DesktopPC;
import org.example.abstractfactory.product.screen.Monitor;

public class Client {

    private DesktopPC desktopPC;
    private Monitor monitor;

    public Client(ICompanyFactory companyFactory){
        desktopPC = companyFactory.createDesktopComputer();
        monitor = companyFactory.createMonitor();
    }

    public void generateOrder(int RAM, String processor, int hardDiskDrive, String model, long size, int resolution ){
        desktopPC.configureFeatures(RAM,processor, hardDiskDrive);
        monitor.chooseModel(model, size, resolution);
    }

}
