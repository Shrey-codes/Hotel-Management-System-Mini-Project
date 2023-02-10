import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class launch{
    JFrame frame = new JFrame();
    JLabel l1 = new JLabel();
    JPanel panel = new JPanel();
    JPanel panel1=new JPanel();
    JLabel l2 =new JLabel();
    JTextField user = new JTextField();
    JLabel l3 = new JLabel();
    JPasswordField pass =new JPasswordField();
    JButton btn = new JButton();
    JLabel heading = new JLabel();
    JButton forget = new JButton();
    JButton newuser = new JButton();
    JLabel bgimg1;
    ImageIcon image1;

    Connection con=null;
    launch() {

        con = DB.dbconnect();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setLayout(null);




        l1.setText("Login");
        l1.setBounds(710,300,200,100);
        l1.setFont(new Font("Verdana", Font.PLAIN, 50));
        l1.setForeground(new Color(255,215,0));
        frame.add(l1);

        user.setBounds(750,450,200,24);
        user.setBackground(new Color(100,100,100));
        frame.add(user);

        l2.setText("Username :");
        l2.setBounds(620,410,200,100);
        l2.setFont(new Font("Verdana",Font.PLAIN,18));
        l2.setForeground(Color.white);
        frame.add(l2);

        pass.setBounds(750,500,200,24);
        pass.setBackground(new Color(100,100,100));
        frame.add(pass);

        l3.setText("Password :");
        l3.setBounds(630,460,200,100);
        l3.setFont(new Font("Verdana",Font.PLAIN,18));
        l3.setForeground(Color.white);
        frame.add(l3);

        btn.setText("Login");
        btn.setFont(new Font("Verdana",Font.PLAIN,18));
        btn.setForeground(new Color(255,255,255));
        Border border = BorderFactory.createLineBorder(new Color(255,0,0));
        btn.setBorder(border);

        btn.setFocusable(false);
        btn.setBounds(710,600,150,40);
        btn.setBackground(new Color(255,0,0));
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String u = user.getText();
                    String p = pass.getText();
                    PreparedStatement pst = con.prepareStatement("select * from login where fname=? and password=?");

                    pst.setString(1,u);
                    pst.setString(2,p);
                    ResultSet r= pst.executeQuery();
                    if(r.next())
                    {
                        new sec();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"incorrect id or password");
                    }
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        });
        frame.add(btn);

        heading.setText("Hotel Management System");
        heading.setFont(new Font("Verdana",Font.BOLD,50));
        heading.setForeground(Color.yellow);
        heading.setBounds(400,10,1500,70);
        frame.add(heading);

        forget.setText("Forget Password?");
        forget.setForeground(Color.red);
        forget.setBounds(820,530,150,30);
        forget.setBackground(Color.black);
        Border border1 = BorderFactory.createLineBorder(new Color(0,0,0));
        forget.setBorder(border1);
        forget.setFocusable(false);
        frame.add(forget);

        newuser.setText("New User Register");
        newuser.setForeground(Color.red);
        Border border2 = BorderFactory.createLineBorder(new Color(0,0,0));
        newuser.setBorder(border2);
        newuser.setBackground(Color.black);
        newuser.setFocusable(false);
        newuser.setBounds(810,560,150,30);
        newuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             new neww();
             frame.dispose();
            }
        });
        frame.add(newuser);




// heading panel
        panel.setBackground(new Color(0,0,0));
        panel.setBounds(0,0,1550,90);
        frame.add(panel);
//login panel
        panel1.setBackground(new Color(0,0,0));
        panel1.setBounds(580,280,400,400);
        frame.add(panel1);

       /*panel.setBackground(new Color(172,172,172));
        panel.setBounds(0,0,1800,800);
        frame.add(panel);*/

        image1 = new ImageIcon(this.getClass().getResource("/new.jpg"));
        bgimg1 = new JLabel(image1);
        bgimg1.setBounds(0,90,1650,700);
        frame.add(bgimg1);

        frame.setVisible(true);
    }
}

public class LaunchPage {
    public static void main(String []args)
    {
        new launch();
    }
}
