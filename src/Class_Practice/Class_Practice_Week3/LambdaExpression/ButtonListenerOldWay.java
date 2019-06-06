package Class_Practice.Class_Practice_Week3.LambdaExpression;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonListenerOldWay {

          /*
          import java.awt.*;
import java.awt.event.*;
public class ButtonListenerOldWay {
    public static void main(String[] args) {
       Frame frame=new Frame("ActionListener Before Java8");

       Button b=new Button("Click Here");
       b.setBounds(50,100,80,50);

       b.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
    	     System.out.println("Hello World!");
          }
       });
       frame.add(b);

       frame.setSize(200,200);
       frame.setLayout(null);
       frame.setVisible(true);
    }
           */

    public static void main(String[] args) {

        Frame frame = new Frame("ActionListener Before Java8");

        Button b = new Button("Click Here ");
        b.setBounds(50,100, 80, 50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World");
            }
        });
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
