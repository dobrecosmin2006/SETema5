package SETema5.classes;

import SETema5.classes.AbstractFactoryPeriferics;
import SETema5.classes.FactoryProducer;
import SETema5.interfaces.*;

/**
 * Created by Mihai on 11/10/2014.
 *
 *
 * this is my Main class for my homework
 * from here I will call some methods for my homework
 *
 *
 */
public class Main {


    public static void main(String[] args)
    {

        /*
                * let's make some microP
         */
        AbstractFactoryPeriferics myCpuFactory = FactoryProducer.getFactory("CPU");

        ICpu microp1 = myCpuFactory.getMicroprocessor(2500,"INTEL");
        microp1.produce(2500,22);

        microp1 = myCpuFactory.getMicroprocessor(2500,"AMD");
        microp1.produce(2500,22);

        /*
            May i continue with my production of cpu-microprocessors
        */

        /*
            * let's make some HDD-s
         */

        AbstractFactoryPeriferics myHddFactory = FactoryProducer.getFactory("HDD");

        IHdd myHddSet = myHddFactory.getHddDevices(320,"Seagate 4Family");
        myHddSet.create(1000,7200,3);

        myHddSet = myHddFactory.getHddDevices(250,"Seagate Enterprise");
        myHddSet.create(320,10000,5);


        /*
            May i continue with my production of hdd's
        */

    }


}
