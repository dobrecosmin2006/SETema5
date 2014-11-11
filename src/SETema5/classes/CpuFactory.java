package SETema5.classes;

import SETema5.interfaces.ICpu;
import SETema5.interfaces.IHdd;
import SETema5.patterns.src.AMDCpu;
import SETema5.patterns.src.IntelCPU;

/**
 * Created by Mihai on 11/10/2014.
 *
 * this class is for my cpu factory. Here i will test what I might need to produce some cpu's
 *
 * those methods are override from the class AbstractFactoryPeriferics
 *
 */
public class CpuFactory extends AbstractFactoryPeriferics {

    @Override
    public IHdd getHddDevices(int capacity, String p) {
        return null;
        // don't change anything here
    }

    @Override
    public ICpu getMicroprocessor(int frecventa, String producer) {

        if (frecventa == 0)
            return null;

        else if( producer.startsWith("AMD")) {

            return new AMDCpu();
        }

        else if (producer.startsWith("INTEL")){

            return new IntelCPU();

        }
        else
        {
            return null;
        }
    }
}
