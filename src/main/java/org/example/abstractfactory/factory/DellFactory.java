package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.desktop.DellDesktopPC;
import org.example.abstractfactory.product.desktop.DesktopPC;
import org.example.abstractfactory.product.screen.DellMonitor;
import org.example.abstractfactory.product.screen.Monitor;

public class DellFactory implements ICompanyFactory {

    @Override
    public DesktopPC createDesktopComputer() {
        return new DellDesktopPC();
    }

    @Override
    public Monitor createMonitor() {
        return new DellMonitor();
    }
}
