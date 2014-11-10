package SETema5.classes;

/**
 * Created by Mihai on 11/10/2014.
 *
 * here i have implemented a class for my method abstract from AbstractFactoryPeriferics
 */
public class FactoryProducer {

    public static AbstractFactoryPeriferics getFactory ( String choice ){


        if(choice.startsWith("CPU")){
            return new CpuFactory();
        } else if(choice.startsWith("HDD")){
            return new HddFactory();
        }
        return null;


    }


}
