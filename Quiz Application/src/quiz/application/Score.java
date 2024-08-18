
package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("QuizIcons/score.png"));
        Image i3 = i2.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image2 = new JLabel(i4);
        image2.setBounds(0, 200, 300, 250);
        add(image2);
        
         JLabel qno = new JLabel("Thank you "+ name + " for playing Simple Minds");
        qno.setBounds(45, 30, 700, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        JLabel showscore = new JLabel("Your Score is - "+score);
        showscore.setBounds(350, 200, 300, 30);
        showscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(showscore);
        
            JButton submit = new JButton("Play Again");
            submit.setBounds(380, 270, 120, 30);
            submit.setBackground(new Color(30, 144, 255));
           // submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
            submit.setForeground(Color.WHITE);
            submit.addActionListener(this);
            add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String [] args){
        new Score("User",0);
    }
}
