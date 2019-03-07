
/**
 * Write a description of class Aleatorio here.
 * 
 * @author JoséAntonio
 * @version 01/03/2019
 */
public class Aleatorio
{
    // instance variables - replace the example below with your own
    private int x;
    private double y;

    /**
     * Constructor for objects of class Aleatorio
     */
    public Aleatorio()
    {
        // initialise instance variables
        x = 0; y=0.0d;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int generaNumAleatorio(int y)
    {
        // put your code here
        x = (int) Math.random();
        return (x*y);
    }
    
    public double generaNumAleatorio()
    {
        y = (Math.random())*10;
        return (y);
    }
}
