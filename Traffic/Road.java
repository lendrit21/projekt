     package Traffic;

 import java.awt.Color;//importon paketen Color
 import java.awt.Graphics;//importon paketen e Grafikes
 import javax.swing.JPanel;//importon paketen e JPanelit

 public class Road extends JPanel {//klasa publike Road e cila permban JPanelin
	 Vehicle[] vehicles = new Vehicle[2];//paraqet  strukturen e vargut qe permban 2 vetura 
      int i = 0;

   public Road() {//metoda e konstrutorit te klasa Road
        super();
    }

   public void addCar(Vehicle v) {//metoda  cila shton automobilat
        vehicles[i] = v;
        i++;
    }

   public void paintComponent(Graphics g) {//metoda e cila paraqet grafikun e klases road
        super.paintComponent(g);

        int height = 300;//gjatesia (lartesia) se ku fillon rruga
        int width = 370;//gjeresia se ku fillon rruga

        g.setColor(Color.BLACK);//paraqet ngjyren e zeze
        g.fillRect(0, 0, getWidth(), getHeight());//ngjyros pjeset jo rrugore me ngjyre te zeze
        g.setColor(Color.WHITE);//paraqet ngjyren e bardhe
       //ngjyros pjesen kryqezore te rruges me ngjyre te bardhe
        g.fillRect(0, height, 900, 100);
        g.fillRect(width, 0, 100, 900);
     //paraqet veturat ne rruge(kryq)   
        vehicles[0].paintMe(g);
        vehicles[1].paintMe(g);  
    }
  }
