package org.example.abstractfactory.factory;

import org.example.abstractfactory.product.desktop.DesktopPC;
import org.example.abstractfactory.product.screen.Monitor;

public interface ICompanyFactory {

    DesktopPC createDesktopComputer();
    Monitor createMonitor();
}
