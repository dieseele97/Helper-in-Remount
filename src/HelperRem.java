import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import remount.Wallpaper;
import remount.Floor;
import remount.Coloration;
public class HelperRem extends JFrame {    
   public static double wall_wigth;
   public static double wall_length;
    public static void main(String[] args) {         
     JFrame frame = new JFrame("Розрахунки для ремонту");  
     JFrame resulter = new JFrame("Результати розрахунків");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(350, 410);
     resulter.setSize(300, 100);
     frame.setResizable(false);
     resulter.setResizable(false);
     frame.getContentPane().setBackground(new Color(153, 204, 255));    
     resulter.getContentPane().setBackground(new Color(229, 255, 204));  
     JLabel label = new JLabel("Введіть розміри кімнати:");
     label.setBounds(90,10,150,20); 
     JLabel label1 = new JLabel("Довжина");
     label1.setBounds(50,40,85,20);     
     JTextField length = new JTextField(10);
     length.setBounds(50,70,55,20);
     JLabel label2 = new JLabel("Ширина");
     label2.setBounds(150,40,85,20);     
     JTextField width = new JTextField(10);
     width.setBounds(150,70,50,20);  
     JLabel label3 = new JLabel("Висота");
     label3.setBounds(250,40,85,20);     
     JTextField height = new JTextField(10);
     height.setBounds(250,70,45,20);
     JLabel label4 = new JLabel("Оберіть розмірність шпалерів:");
     label4.setBounds(70,100,250,20); 
     JLabel label5 = new JLabel("Ширина:");
     label5.setBounds(130,120,250,20); 
     JRadioButton r1=new JRadioButton("0,53 м");    
     JRadioButton r2=new JRadioButton("1,06 м");
     ButtonGroup bg=new ButtonGroup();    
     bg.add(r1);bg.add(r2);
     r1.setBounds(50,150,65,20);
     r2.setBounds(200,150,65,20);
     JLabel label6 = new JLabel("Довжина:");
     label6.setBounds(130,170,250,20); 
     JRadioButton r3=new JRadioButton("10 м");    
     JRadioButton r4=new JRadioButton("25 м");
     ButtonGroup bg1=new ButtonGroup();    
     bg1.add(r3);bg1.add(r4);
     r3.setBounds(50,190,65,20);
     r4.setBounds(200,190,65,20);
     JButton btn1 = new JButton("Розрахувати кількість рулонів");
     btn1.setBounds(50,230,250,25);
     frame.add(label); 
     frame.add(label1); 
     frame.add(label2); 
     frame.add(label3); 
     frame.add(label4); 
     frame.add(label5);
     frame.add(label6);
     frame.add(length);
     frame.add(width);
     frame.add(height);
     frame.add(btn1);
     frame.add(r1);
     frame.add(r2);
     frame.add(r3);
     frame.add(r4);
     btn1.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
        double b =  Double.parseDouble(length.getText());
        double a =  Double.parseDouble(width.getText());
        double c =  Double.parseDouble(height.getText());
        resulter.getContentPane().removeAll();
        resulter.repaint();
           if(r1.isSelected()){    
             wall_wigth=0.53;
               }  
           if(r2.isSelected()){    
              wall_wigth=1.06;
                } 
           if(r3.isSelected()){    
               wall_length=10;
                  } 
           if(r4.isSelected()){    
               wall_length=25;
                     } 
          Wallpaper wallpaper= new Wallpaper(a,b,c,wall_wigth,wall_length);
          wallpaper.CalculateWallpaper();           
          JLabel rslt = new JLabel("Необхідна кількість рулонів:");
          rslt.setBounds(20,10,270,50);          
          resulter.add(rslt);   
          JLabel labelr = new JLabel();
          labelr.setText(Double.toString(Math.round(wallpaper.result)));                       
          labelr.setBounds(200,10,270,50);    
          resulter.add(labelr);
          resulter.setLayout(null);
          resulter.setVisible(true);           
            }
        });
     JLabel label7 = new JLabel("Введіть розміри лінолеуму:");
     label7.setBounds(80,255,180,25); 
     JLabel label8 = new JLabel("Довжина:");
     label8.setBounds(50,280,85,20);     
     JTextField wigth_lino = new JTextField(10);
     wigth_lino.setBounds(110,280,35,20);
     JLabel label9 = new JLabel("Ширина:");
     label9.setBounds(150,280,85,20);     
     JTextField length_lino = new JTextField(10);
     length_lino.setBounds(200,280,35,20); 
     frame.add(label7);
     frame.add(label8);
     frame.add(wigth_lino);
     frame.add(label9);
     frame.add(length_lino);
     JButton btn2 = new JButton("Розрахувати кількість рулонів ліноліуму");
     btn2.setBounds(40,310,270,25);
     frame.add(btn2);
     btn2.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
        double b =  Double.parseDouble(length.getText());
        double a =  Double.parseDouble(width.getText());
        double c =  Double.parseDouble(wigth_lino.getText());
        double d =  Double.parseDouble(length_lino.getText());
        resulter.getContentPane().removeAll();
        resulter.repaint();
        Floor floor=new Floor(b,a,c,d);
        floor.CalculateLino(); 
        JLabel rslt = new JLabel("Необхідна кількість рулонів ліноліуму:");
          rslt.setBounds(20,10,270,50);
          resulter.add(rslt);   
          JLabel labelr = new JLabel();
          labelr.setText(Double.toString(Math.round(floor.result)));                       
          labelr.setBounds(250,10,270,50);    
          resulter.add(labelr);
          resulter.setLayout(null);
          resulter.setVisible(true);             
     }
     });
     JButton btn3 = new JButton("Розрахувати кількість літрів фарби");
     btn3.setBounds(40,340,270,25);
     frame.add(btn3);
     btn3.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) { 
        resulter.getContentPane().removeAll();
        resulter.repaint();
        double b =  Double.parseDouble(length.getText());
        double a =  Double.parseDouble(width.getText());
        double c =  Double.parseDouble(height.getText());   
        Coloration color=new Coloration(b,a,c);
        color.CalculateColor();  
        JLabel rslt = new JLabel("Необхідна кількість літрів фарби:");
        rslt.setBounds(20,10,270,50);
        resulter.add(rslt);   
        JLabel labelr = new JLabel();
        labelr.setText(Double.toString(Math.round(color.result)));                       
        labelr.setBounds(250,10,270,50);    
        resulter.add(labelr);
        resulter.setLayout(null);
        resulter.setVisible(true); 
     }
     });     
     frame.setLayout(null);
     frame.setVisible(true);          
    }     
}
