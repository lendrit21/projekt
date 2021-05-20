   package Traffic;

 import java.awt.BorderLayout;//importon paketen e BorderLayout
 import javax.swing.JFrame;//importon paketen e JFrame

  public class Traffic {//emri i klases
    JFrame frame = new JFrame("Traffic intersection");//shfaq framen dhe emrin e saj
    Road road = new Road();//ekzekuton klasen Road

   public Traffic() {//eshte metoda e konstruktorit
       frame.setSize(900, 900);//madhesia e frames
       frame.setLayout(new BorderLayout());//shfaq BorderLayout
       frame.add(road, BorderLayout.CENTER);//shton klasen road dhe BorderLayout
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//mbyll Jframen(kryesisht progamin)
       frame.setVisible(true);//shfaq framen

    Semi testsemi = new Semi(0, 330);//ekzekuton klasen Semi
        road.addCar(testsemi);//shton veturen e klases Semi ne road
        frame.repaint();//shfaq(pikturon) ate

    Suv testsuv = new Suv(400, 900);//ekzekuton klasen Suv
        road.addCar(testsuv);//shton veturen e klases Suv ne road
        frame.repaint();//shfaq(pikturon) ate

     while (true) {//unaza while e cila nese eshte true shfaq veturat ne program
         try {  Thread.sleep(10);   
            } 
        catch (InterruptedException e) {
                e.printStackTrace();
            }
          //shfaq(pikturon) pozicionin e tyre
          testsemi.updatePosition();
          testsuv.updatePosition();
            road.repaint();//shfaq(pikturon) veturat
        }}
    public static void main(String[] args) {//eshte metoda kryesore e klases Traffic 
        new Traffic();//ekzekuton klasen Traffic
    }}