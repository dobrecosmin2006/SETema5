package SETema5.classes;

import SETema5.interfaces.ICpu;
import SETema5.interfaces.IHdd;

/**
 * Created by Mihai on 11/10/2014.
 *
 *
 *  the main abstract class for my project is represented few lines down.
 *
 *  i have 2 abstract methods for my example project
 *
 *  those methods are overriden in another classes in the main project
 *
 */
public abstract class AbstractFactoryPeriferics {

    public abstract ICpu getMicroprocessor(int frecventa, String producer);
    public abstract IHdd getHddDevices(int capacity, String producer);



}
