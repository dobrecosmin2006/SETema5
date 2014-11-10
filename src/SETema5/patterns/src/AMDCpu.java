package SETema5.patterns.src;

import SETema5.interfaces.ICpu;

/**
 * Created by Mihai on 11/10/2014.
 *
 *
 * in this class i will produce some AMD microprocessors
 */
public class AMDCpu implements ICpu {

    @Override
    public void produce(){
        System.out.println(" A AMD CPU have been created.");
    }


}
