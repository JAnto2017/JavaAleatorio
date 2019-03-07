
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    private static int a;
    
    public static void setA(int _a) {a = _a;}
    
    public static int getA() {return a;}
    
    public static void main(String[] args)
    {
        int num = 0;
        Aleatorio ale = new Aleatorio();
        
        setA(0);
        System.out.println("Inicio");
        setA((int) ale.generaNumAleatorio());
        num = getA();
        System.out.println("Numero aleatorio: "+num);
    }
    
}
