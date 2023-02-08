package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.desktop.DesktopPC;
import org.example.abstractfactory.product.desktop.LenovoDesktopPC;
import org.example.abstractfactory.product.screen.LenovoMonitor;
import org.example.abstractfactory.product.screen.Monitor;

public class LenovoFactory implements ICompanyFactory {
    @Override
    public DesktopPC createDesktopComputer() {
        return new LenovoDesktopPC();
    }

    @Override
    public Monitor createMonitor() {
        return new LenovoMonitor();
    }
}
