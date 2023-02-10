import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

class detail{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel deluxe = new JLabel();
    JLabel dt = new JLabel();
    JLabel dtext = new JLabel();
    JLabel sup = new JLabel();
    JLabel supt = new JLabel();
    JLabel suptext = new JLabel();
    JLabel p = new JLabel();
    JLabel pt = new JLabel();
    JLabel ptext = new JLabel();
    JButton p1 = new JButton();

    JButton p2 = new JButton();
    JButton p3 = new JButton();
    ImageIcon img ;
    JLabel bgimg;
    ImageIcon img1 ;
    JLabel bgimg1;
    ImageIcon img2 ;
    JLabel bgimg2;



    detail()
    {
        frame.setBounds(180,180,1365,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("Details");

        deluxe.setText("Deluxe Rooms");
        deluxe.setBounds(100,20,300,50);
        deluxe.setFont(new Font("Verdana",Font.BOLD,26));
        frame.add(deluxe);

        dt.setText("Description :-");
        dt.setBounds(40,270,200,50);
        dt.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(dt);

        dtext.setText("<html> The nine Deluxe Rooms offer views of the magnificent <br>turquoise sea — a true indulgence. The rooms measure an <br>average of 23 m2, offering a comfortable amount of space to <br>sleep a maximum of two people.<br><br>Each Deluxe Rooms features:\n" +
                "<br>" +
                "   <br>A fully furnished terrace<br>" +
                "   A television with satellite channels<br>" +
                "   A mini bar fridge<br>" +
                "   A king-size bed<br>" +
                "   Air-conditioning<br>" +
                "   A bathroom with a walk-in shower and double wash basin <br>" +
                "   A hairdryer<br>" +
                "   A safe<br>" +
                "   Wi-Fi </html> ");
        dtext.setBounds(40,250,400,400);
        frame.add(dtext);

        supt.setText("Description :-");
        supt.setBounds(500,270,200,50);
        supt.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(supt);

        sup.setText("Superior Rooms");
        sup.setBounds(550,20,300,50);
        sup.setFont(new Font("Verdana",Font.BOLD,26));
        frame.add(sup);

        suptext.setText("<html> The two Superior Rooms each offer sweeping views of the ocean from an elegantly furnished terrace. Epitomising an island-chic style, these rooms accentuate the tranquillity of this destination. They each measure approximately 30 m2 and sleep a maximum of two people.\n" +
                "\n" +
                "<br>Each Superior Room features:<br>" +
                "<br>A fully furnished terrace<br>" +
                "A television with satellite channels<br>" +
                "A mini bar fridge<br>" +
                "A king-size bed<br>" +
                "Air-conditioning<br>" +
                "A bathroom with a walk-in shower, double wash basin and separate toilet<br>" +
                "A hairdryer<br>" +
                "A safe<br>" +
                "Wi-Fi </html> ");
        suptext.setBounds(500,250,400,400);
        frame.add(suptext);

        pt.setText("Description :-");
        pt.setBounds(970,270,200,50);
        pt.setFont(new Font("Verdana",Font.PLAIN,20));
        frame.add(pt);

        p.setText("Premium Rooms");
        p.setBounds(1000,20,300,50);
        p.setFont(new Font("Verdana",Font.BOLD,26));
        frame.add(p);

        ptext.setText("<html>The four Premium Rooms offer various configurations,<br>including a family unit with two extra beds. All of the Premium<br>Rooms are generously spacious at an average of 46 m2 each<br>and offer a luxurious beachfront setting — a premium<br>experience of the beautiful location. " +

                "<br>Each Superior Room features:<br>" +
                "<br>A fully furnished terrace<br>" +
                "A television with satellite channels<br>" +
                "A mini bar fridge<br>" +
                "A king-size bed<br>" +
                "Air-conditioning<br>" +
                "A bathroom with a walk-in shower, double wash basin,bath tub<br>and separate toilet<br>" +
                "A hairdryer<br>" +
                "A safe<br>" +
                "Wi-Fi </html> ");
        ptext.setBounds(970,250,400,400);
        frame.add(ptext);

        p1.setText("-₹1500");
        p1.setFont(new Font("verdana",Font.BOLD,20));
        p1.setBounds(260,270,120,30);
        p1.setBackground(Color.red);
        Border border = BorderFactory.createLineBorder(new Color(255,0,0));
        p1.setBorder(border);
        p1.setFocusable(false);
        frame.add(p1);

        p2.setText("-₹2500");
        p2.setFont(new Font("verdana",Font.BOLD,20));
        p2.setBounds(720,270,120,30);
        p2.setBackground(Color.red);
        p2.setBorder(border);
        p2.setFocusable(false);
        frame.add(p2);

        p3.setText("-₹4000");
        p3.setFont(new Font("verdana",Font.BOLD,20));
        p3.setBounds(1180,270,120,30);
        p3.setBackground(Color.red);
        p3.setBorder(border);
        p3.setFocusable(false);
        frame.add(p3);


        img= new ImageIcon(this.getClass().getResource("/deluxe.jpg"));
        bgimg = new JLabel(img);
        bgimg.setBounds(30,80,350,180);
        frame.add(bgimg);

        img1= new ImageIcon(this.getClass().getResource("/room.jpg"));
        bgimg1 = new JLabel(img1);
        bgimg1.setBounds(490,80,350,180);
        frame.add(bgimg1);

        img2= new ImageIcon(this.getClass().getResource("/premium.jpg"));
        bgimg2 = new JLabel(img2);
        bgimg2.setBounds(950,80,350,180);
        frame.add(bgimg2);



        panel.setBounds(0,0,1360,650);
        panel.setBackground(new Color(127,255,212));
        frame.add(panel);
        frame.setVisible(true);


    }
}


public class details {
    public static void main(String [] args)
    {


        //new detail();
    }
}
