package SETema5.patterns.src;

import SETema5.interfaces.IHdd;

/**
 * Created by Mihai on 11/10/2014.
 *
 * in this class i will produce some WesternDigital HDD-isk
 */
public class WesternDigitalHDD implements IHdd{

    @Override
    public void create()
    {
        System.out.println(" A WesternDigital Hard Disk have been created.");

    }
}
