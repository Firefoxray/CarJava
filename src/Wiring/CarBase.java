package Wiring;

import Commands.TextScanner;

public class CarBase
{
    private TextScanner textScanner;

    public CarBase()
    {
        textScanner.ScanCommand();
    }

}
