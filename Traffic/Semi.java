
       package Traffic;
  import java.awt.Color;//importon paketen Color
  import java.awt.Graphics;//importon paketen e Grafikes

   public class Semi extends Vehicle {//klasa Semi e cila permban klasen Vehicle
      public Semi(int new_x, int new_y) {//parametrat e vetures

         super(new_x, new_y);
         /*parametrat e vetures
          (gjatesia,gjeresia dhe shpejtesia)*/
          width = 100; 
          height = 30; 
          speed = 5;
         
    }
   public void updatePosition() {//metoda e cila ben levizjen e piktures
        x += speed;   
    	}
    
   public void paintMe(Graphics g) {//metoda e cila shfaq madhesine e vetures
	   
        g.setColor(Color.RED);//ngjyra e vetures
        g.fillRect(x, y, width, height);//madhesia e vetures
       
      }
     }


   
   
   
