import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sec
{
    JFrame frame = new JFrame();
    JLabel menu=new JLabel();
    JButton customer = new JButton();
    JButton booking = new JButton();
    JButton details = new JButton();
    JButton report = new JButton();
    JPanel panel = new JPanel();
    JLabel heading = new JLabel();
    JButton logout = new JButton();
    JButton line = new JButton();
    JButton line1 = new JButton();
    ImageIcon image1;
    ImageIcon image2;
    JLabel bgimg2;
    JLabel bgimg1;
    ImageIcon image3;
    JLabel bgimg3;
    ImageIcon image4;
    JLabel bgimg4;



    sec()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Hotel Management System");
        frame.setBounds(-10,0,1920,900);
        frame.setLayout(null);

        line.setBounds(0,140,1550,2);
        line.setForeground(Color.white);
        frame.add(line);


        heading.setText("Prāvī Wizard Hotel");
        heading.setForeground(Color.orange);
        heading.setFont(new Font("SANS_SERIF",Font.ITALIC,70));
        heading.setBounds(500,10,1500,100);
        frame.add(heading);

        menu.setText("Menu");
        menu.setBackground(new Color(0,0,0));
        menu.setForeground(Color.ORANGE);
        menu.setFont(new Font("Verdana",Font.PLAIN,34));
        menu.setBounds(50,160,170,35);
        frame.add(menu);
        line1.setBounds(0,208,190,2);
        line1.setForeground(Color.ORANGE);
        frame.add(line1);

        customer.setText("Customer");
        customer.setBackground(new Color(0,0,0));
        customer.setForeground(Color.yellow);
        customer.setFont(new Font("Verdana",Font.PLAIN,20));
        customer.setFocusable(false);
        customer.setBounds(15,240,170,35);
       customer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new list();
            }
        });
        frame.add(customer);

        booking.setText("Booking");
        booking.setBackground(new Color(0,0,0));
        booking.setForeground(Color.yellow);
        booking.setFont(new Font("Verdana",Font.PLAIN,20));
        booking.setFocusable(false);
        booking.setBounds(15,280,170,35);
        booking.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new book();
            }
        });
        frame.add(booking);

        details.setText("Details");
        details.setBackground(new Color(0,0,0));
        details.setForeground(Color.yellow);
        details.setFont(new Font("Verdana",Font.PLAIN,20));
        details.setFocusable(false);
        details.setBounds(15,320,170,35);
        details.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new detail();
            }
        });
        frame.add(details);

        report.setText("Report");
        report.setBackground(new Color(0,0,0));
        report.setForeground(Color.yellow);
        report.setFont(new Font("Verdana",Font.PLAIN,20));
        report.setFocusable(false);
        report.setBounds(15,360,170,35);
        report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new rep();
            }
        });
        frame.add(report);

        logout.setText("Logout");
        logout.setBackground(new Color(0,0,0));
        logout.setForeground(Color.yellow);
        logout.setFont(new Font("Verdana",Font.PLAIN,20));
        logout.setFocusable(false);
        logout.setBounds(15,400,170,35);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.add(logout);

        image4= new ImageIcon(this.getClass().getResource("/logo1.jpg"));
        bgimg4 = new JLabel(image4);
        bgimg4.setBounds(5,5,190,130);
        frame.add(bgimg4);

        image3= new ImageIcon(this.getClass().getResource("/room.jpg"));
        bgimg3 = new JLabel(image3);
        bgimg3.setBounds(5,450,180,340);
        frame.add(bgimg3);

        image2= new ImageIcon(this.getClass().getResource("/hotelletters.jpeg"));
        bgimg2 = new JLabel(image2);
        bgimg2.setBounds(1350,150,200,900);
        frame.add(bgimg2);

       image1= new ImageIcon(this.getClass().getResource("/hotel.jpg"));
       bgimg1 = new JLabel(image1);
       bgimg1.setBounds(0,150,1550,700);
       frame.add(bgimg1);

       panel.setBackground(new Color(0,0,0));
       panel.setBounds(0,0,1920,900);
       frame.add(panel);


        frame.setVisible(true);

    }
}


public class second {
    public static void main(String [] agrs)
    {
        new sec();

    }
}
