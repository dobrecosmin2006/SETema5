package SETema5.patterns.src;

import SETema5.interfaces.ICpu;

/**
 * Created by Mihai on 11/10/2014.
 *
 *
 * in this class i will produce some AMD microprocessors
 */
public class AMDCpu implements ICpu {

    private int frequency;
    private int band;
    private String firmware="AMD";
    private int numberCPUCreated = 0;

    public void show_specs(){
        System.out.println(" AmdCPU:" + frequency + " band " + band + "designed by: " + firmware);

    }

    public void IncrementNoProducts(){
        this.numberCPUCreated++;
    }


    @Override
    public void produce(int freq, int band)
    {
        this.frequency = freq;
        this.band  = band;
        this.firmware="AMD";
        System.out.println(" A AMD CPU have been created.");
        this.IncrementNoProducts();
        this.show_specs();
    }


}
