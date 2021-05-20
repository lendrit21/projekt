   
         package Traffic;
  import java.awt.Color;//importon paketen Color
  import java.awt.Graphics;//importon paketen e Grafikes

    public class Suv extends Vehicle {//klasa Suv e cila permban klasen Vehicle
      public Suv(int new_x, int new_y) {//parametrat e vetures
    	
          super(new_x, new_y);
          /*parametrat e vetures
          (gjatesia,gjeresia dhe shpejtesia)*/
          width = 30;
          height = 100;
          speed = 5;
     }
     public void updatePosition() {//metoda e cila ben levizjen e piktures
          y -= speed;
       }
     public void paintMe(Graphics g) {//metoda e cila shfaq madhesine e vetures
        g.setColor(Color.GREEN);//ngjyra e vetures
        g.fillRect(x, -y, width, height);//madhesia e vetures
       }
    }

    
    