package SETema5.patterns.src;

import SETema5.interfaces.ICpu;

/**
 * Created by Mihai on 11/10/2014.\
 *
 * in this class i will produce some Intel microprocessors
 */
public class IntelCPU implements ICpu{

    private int frequency;
    private int band;
    private String firmware="INTEL";
    private int numberCPUCreated = 0;

    public void show_specs(){
        System.out.println(" IntelCPU:" + frequency + " band " + band + "designed by: " + firmware);

    }

    public void IncrementNoProducts(){
        this.numberCPUCreated++;
    }


    @Override
    public void produce(int freq, int band)
    {
        this.frequency = freq;
        this.band  = band;
        this.firmware="INTEL";
        System.out.println(" A INTEL CPU have been created.");
        this.IncrementNoProducts();
        this.show_specs();
    }
}
