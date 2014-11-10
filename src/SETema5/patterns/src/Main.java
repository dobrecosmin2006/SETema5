package SETema5.patterns.src;

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
        microp1.produce();

        microp1 = myCpuFactory.getMicroprocessor(2200,"AMD");
        microp1.produce();

        /*
            May i continue with my production of cpu-microprocessors
        */

        /*
            * let's make some HDD-s
         */

        AbstractFactoryPeriferics myHddFactory = FactoryProducer.getFactory("HDD");
        IHdd myHddSet = myHddFactory.getHddDevices(320,"WesternDigital  Business");
        myHddSet.create();

        myHddSet = myHddFactory.getHddDevices(250,"Seagate Enterprise");
        myHddSet.create();


        /*
            May i continue with my production of hdd's
        */

    }


}
