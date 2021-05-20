  
     package Traffic;

 import java.awt.Graphics;//importon paketen e Grafikes

  public abstract class Vehicle {//klasa abstrakte vehicle
   //parametrat (dimensionet) e klases
	int x;
    int y;
    int height = 0;
    int width = 0;
    int speed = 0;
   
   
   public Vehicle(int new_x, int new_y) {
        x = new_x;
        y = new_y;
    }
    //paraqet grafiken e klases (ben vizatimin e saj)
    public abstract void paintMe(Graphics g);
    
   }

  
  
  
  