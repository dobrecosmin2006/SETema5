package SETema5.patterns.src;

import SETema5.interfaces.ICpu;

/**
 * Created by Mihai on 11/10/2014.\
 *
 * in this class i will produce some Intel microprocessors
 */
public class IntelCPU implements ICpu{

    @Override
    public void produce(){
        System.out.println(" A Intel CPU have been created.");

    }
}
