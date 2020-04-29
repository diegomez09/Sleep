
package practicasleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PracticaSleep extends Thread{

    private String nombre;
    Thread t;
    
    public PracticaSleep(String n) {
        this.nombre=n;
        
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hola "+nombre);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(PracticaSleep.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
        
    }

    
   
    public static void main(String[] args) {
        PracticaSleep o1 = new PracticaSleep("Eli");
        o1.start();
    }
    
}
