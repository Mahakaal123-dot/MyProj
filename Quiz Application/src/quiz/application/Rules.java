
package quiz.application;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener
{
    String name;
    JButton start,back;
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
            JLabel heading1 = new JLabel("Welcome "+ name +" to Simple minds");
            heading1.setBounds(120, 20, 700, 30); 
            heading1.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
            heading1.setForeground(new Color(30, 144, 254));//(Color.RED) this is also right but if we want to put color in rgb pattern then we have to make a object of the color class. like shown 
            add(heading1);
            
            
            JLabel rules = new JLabel();
            rules.setBounds(20, 90, 700, 350); 
            rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
            rules.setForeground(Color.DARK_GRAY);//(Color.RED) this is also right but if we want to put color in rgb pattern then we have to make a object of the color class. like shown 
            rules.setText(
             "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );
           
            
            start = new JButton("Start");
            start.setBounds(250, 500, 100, 30);
            start.setBackground(new Color(30, 144, 254));
            start.setForeground(Color.WHITE);
            start.addActionListener(this);
            add(start);
            
            back = new JButton("Back");
            back.setBounds(400, 500, 100, 30);
            back.setBackground(new Color(30, 144, 254));
            back.setForeground(Color.WHITE);
            back.addActionListener(this);
            add(back);
            
            
            
            add(rules);
        
        
        
      setSize(800,650);
      setLocation(350,100);
      setVisible(true);
      
    }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==start){
             setVisible(false);
             new Quiz(name);
         }
         else{
             setVisible(false);
         }
     }
    
    
    
    
    public static void main (String[] args){
        new Rules("User");
    }
}
