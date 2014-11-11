package SETema5.patterns.src;

import SETema5.interfaces.IHdd;

/**
 * Created by Mihai on 11/10/2014.
 *
 * in this class i will produce some WesternDigital HDD-isk
 */
public class WesternDigitalHDD implements IHdd{

    private int capacity;
    private int nrRotations;
    private String firm="Seagate";
    private int guarantee;
    private int numberOfProductsCreated = 0;

    public void incrementNrProducts (){
        this.numberOfProductsCreated ++;
    }

    public void showSpecifications() {
        System.out.println("Seagate with "+capacity+" capacity and "+nrRotations+" nr rotations.");
    }

    @Override
    public void create(int cap, int nrr, int g){

        this.capacity = cap;
        this.nrRotations = nrr;
        this.guarantee = g;

        System.out.println(" A Seagate Hard Disk have been created.");
        this.showSpecifications();
    }

}
