package SETema5.classes;

import SETema5.interfaces.ICpu;
import SETema5.interfaces.IHdd;
import SETema5.patterns.src.SeagateHDD;
import SETema5.patterns.src.WesternDigitalHDD;

/**
 * Created by Mihai on 11/10/2014.
 *
 * this class is for hdd factory. here i will call the methods for hard disk realization
 *
 * those methods are override from the class AbstractFactoryPeriferics
 *
 */
public class HddFactory extends AbstractFactoryPeriferics {

    @Override
    public IHdd getHddDevices(int capacity, String producer) {
        if (capacity == 0)
            return null;
        else if( producer.startsWith("Seag")) {

            return new SeagateHDD();
        }
        else if (producer.startsWith("Wes")){

            return new WesternDigitalHDD();

        }
        else
        {
            return null;
        }
    }

    @Override
    public ICpu getMicroprocessor(int frecventa, String procesor) {
       return  null;

    }
}
