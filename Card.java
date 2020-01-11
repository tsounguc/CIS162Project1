import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

/**
 * Description: This program displays a Java Applet used to represent
 * an animated business card for myself.
 *
 * @author: Christian Tsoungui Nkoulou 
 * @version 1/30/2018
 */
public class Card extends JPanel
{
    // initializing y coordinate of the each string on the guitar
    int ystring1 = 155;
    int ystring2 = 163;
    int ystring3 = 171;
    int ystring4 = 179;
    int ystring5 = 187;
    int ystring6 = 195;
    
    //initializing x coordinate of oval part of each the musical notes
    int xOval1 = 345;
    int xOval2 = 395;
    int xOval3 = 250;
    int xOval4 = 275;

    //initializing y coordinate of oval part of each the musical notes
    int yOval1 = 130;
    int yOval2 = 80;
    int yOval3 = 230;
    int yOval4 = 220;
    
    //initializing the x coordinate of vertical lines on the musical notes
    int x1Line1 = 365;
    int x2Line1 = 365;
    int x1Line2 = 415;
    int x2Line2 = 415;
    int x1Line3 = 270;
    int x2Line3 = 270;
    int x1Line4 = 295;
    int x2Line4 = 295;
    
    //initializing the y coordinate of vertical lines on the musical notes
    int y1Line1 = 136;
    int y2Line1 = 105;
    int y1Line2 = 86;
    int y2Line2 = 55;
    int y1Line3 = 236;
    int y2Line3 = 205;
    int y1Line4 = 226; 
    int y2Line4 = 195;

    public static void main() {
        JFrame Cardframe = new JFrame();
        Cardframe.setContentPane(new Card());
        Cardframe.setSize(600, 400);
        Cardframe.setVisible(true);
    }

    public void paintComponent(Graphics g)
    {
        //this statement is required to be able to draw or color
        super.paintComponent(g);

        // optional: point the background color (default is white)
        setBackground(Color.WHITE);

        // Colors used on the business card
        Color saddleBrown = new Color(139, 69, 19);
        Color brownPeru = new Color(205, 133, 63);
        Color brownSienna =  new Color(160, 82, 45);
        Color brownTan = new Color(210, 180, 140);
        Color darkOrange = new Color(255, 140, 0);
        Color blueViolet = new Color(138, 43, 226);
        
        //coordinates and dimensions of frame
        int xr = 45;
        int yr = 30;
        int width = 500;
        int height = 300;

        //coordinates of info
        //name
        int xName = xr + 30;
        int yName = yr + 70;

        //Business 
        int xBusiness = xr + 300;
        int yBusiness = yr + 190;

        //Address
        int xAddress = xr + 300;
        int yAddress = yr + 215;

        //Phone number
        int xPhone = xr + 300;
        int yPhone = yr + 265;

        //Emai address
        int xEmail = xr + 300;
        int yEmail = (yr + 290);

        /*-----------------------------------------------*/
        
        // draw frame
        g.setColor(blueViolet);
        g.fillRect(xr, yr, width, height); 

        //Body of guitar
        g.setColor(darkOrange);
        g.fillOval(xr, yr, 280, 300);
        g.fillOval(xr + 185, yr + 25, 210, 250);
        g.setColor(saddleBrown);
        g.fillRect(xr + 140, yr + 111, 10, 75);

        //Neck of guitar
        g.setColor(saddleBrown);
        g.fillRect(xr + 200, yr + 122, 300, 50);

        //Hole and strings on the guitar
        g.setColor(Color.WHITE);
        g.fillOval(xr + 190, yr + 100, 90, 90);
        g.setColor(saddleBrown);
        g.fillOval(xr + 193, yr + 102, 85, 85);
        g.setColor(Color.WHITE);
        
        /* the if statements makes the strings on the guitar 
        move back and forth*/
        if (ystring1 >= 155 && ystring2 >= 163 && ystring3 >= 171 
                && ystring4 >=179 && ystring5 >= 187 && ystring6 >= 195)
        {
            ystring1 = ystring1 - 2;
            ystring2 = ystring2 - 2;
            ystring3 = ystring3 - 2;
            ystring4 = ystring4 - 2;
            ystring5 = ystring5 - 2;
            ystring6 = ystring6 - 2;

        }
        if (ystring1 < 155 && ystring2 < 163)
        {
            ystring1 = ystring1 + 5;
            ystring2 = ystring2 + 5;
            ystring3 = ystring3 + 5;
            ystring4 = ystring4 + 5;
            ystring5 = ystring5 + 5;
            ystring6 = ystring6 + 5;
        }
        
        // guitar strings 
        g.drawLine(xr + 145, ystring1, xr + 500, ystring1);
        g.drawLine(xr + 145, ystring2, xr + 500, ystring2);
        g.drawLine(xr + 145, ystring3, xr + 500, ystring3);
        g.drawLine(xr + 145, ystring4, xr + 500, ystring4);
        g.drawLine(xr + 145, ystring5, xr + 500, ystring5);
        g.drawLine(xr + 145, ystring6, xr + 500, ystring6);

        //draws musical notes with ovals and lines
        g.setColor(Color.BLACK);
        g.fillOval(xOval1, yOval1, 20, 12);
        g.drawLine(x1Line1, y1Line1, x2Line1, y2Line1);

        g.fillOval(xOval2, yOval2, 20, 12);
        g.drawLine(x1Line2, y1Line2, x2Line2, y2Line2);

        g.fillOval(xOval3, yOval3, 20, 12);
        g.drawLine(x1Line3, y1Line3, x2Line3, y2Line3);

        g.fillOval(xOval4, yOval4, 20, 12);
        g.drawLine(x1Line4, y1Line4, x2Line4, y2Line4);

        /* the if statements makes the strings on the guitar 
        move back and forth*/
        if (xOval1 < 450)
        {
            xOval1 = xOval1 + 8;
            x1Line1 = x1Line1 + 8;
            x2Line1 = x2Line1 + 8;
            yOval1 = yOval1 - 8;
            y1Line1 = y1Line1 - 8;
            y2Line1 = y2Line1 - 8;

            xOval2 = xOval2 - 12;
            x1Line2 = x1Line2 - 12;
            x2Line2 = x2Line2 - 12;
            yOval2 = yOval2 - 5;
            y1Line2 = y1Line2 - 5;
            y2Line2 = y2Line2 - 5;

            xOval3 = xOval3 - 5;
            x1Line3 = x1Line3 - 5;
            x2Line3 = x2Line3 - 5;
            yOval3 = yOval3 + 5;
            y1Line3 = y1Line3 + 5;
            y2Line3 = y2Line3 + 5;

            xOval4 = xOval4 + 5;
            x1Line4 = x1Line4 + 5;
            x2Line4 = x2Line4 + 5;
            yOval4 = yOval4 + 5;
            y1Line4 = y1Line4 + 5;
            y2Line4 = y2Line4 + 5;
        }
        if (xOval1 >= 450)
        {
            xOval1 = 345;
            x1Line1 = 365;
            x2Line1 = 365;
            yOval1 = 130;
            y1Line1 = 136;
            y2Line1 = 105;

            xOval2 = 330;
            yOval2 = 80;
            x1Line2 = 350;
            x2Line2 = 350;
            y1Line2 = 86;
            y2Line2 = 55;

            xOval3 = 250;
            yOval3 = 230;
            x1Line3 = 270;
            x2Line3 = 270;
            y1Line3 = 236;
            y2Line3 = 205;

            xOval4 = 275;
            yOval4 = 220;
            x1Line4 = 295;
            x2Line4 = 295;
            y1Line4 = 226; 
            y2Line4 = 195;

        }

        //Name and Business
        g.setColor(Color.BLACK);
        Font myNameFont = new Font("French Script MT",Font.BOLD ,32);
        g.setFont(myNameFont);
        g.drawString("Christian Tsoungui Nkoulou", xName, yName);

        Font myBusiness = new Font("Times",Font.BOLD,15);
        g.setFont(myBusiness);
        g.drawString("Singer/ Musician", xBusiness, yBusiness);

        Font myAddress = new Font("Times",Font.BOLD,15);
        g.setFont(myAddress);
        g.drawString("250 Douglas Street," , xAddress, yAddress);
        g.drawString("Grand Rapid, MI 90210" , xAddress, (yAddress+25));
        g.drawString("(585) 203-4268" , xPhone, yPhone);
        g.drawString("tsounguc@mail.gvsu.edu" , xEmail, yEmail);

        BufferedImage photo = null;
        try {
            File file = new File("Myprofilepicture2.jpg");
            photo = ImageIO.read(file);
        } catch (IOException e){
            g.drawString("Problem reading the file", 100, 100);
        }
        g.drawImage(photo, xr, yr + 160, 140, 140, null);
    }
}
