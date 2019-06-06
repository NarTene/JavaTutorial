package Class_Practice.Class_Practice_Week3.LambdaExpression;

import java.awt.*;

public class ButtonListenerNewWay {

    /*
    import java.awt.*;
public class ButtonListenerNewWay {
   public static void main(String[] args) {
      Frame frame=new Frame("ActionListener java8");

      Button b=new Button("Click Here");
      b.setBounds(50,100,80,50);

      b.addActionListener(e -> System.out.println("Hello World!"));
      frame.add(b);

      frame.setSize(200,200);
      frame.setLayout(null);
      frame.setVisible(true);
   }
     */
    public static void main(String[] args) {
        Frame frame = new Frame("ActionListener java8");

        Button b = new Button("Click Here");
        b.setBounds(50, 100, 80, 50);

        b.addActionListener(e -> System.out.println(" Thank you have just submitted a new click action"));
        frame.add(b);

        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
