package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_1 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_1() {
        super("IHM Question2_1");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        enHaut.setBackground(Color.blue);
        setLocation(100,100);
        pack();show();

        // à compléter
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
        ActionListener clearText = new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                contenu.setText("");
            }
        };
    
//        boutonA.addActionListener(clearText);
//        boutonB.addActionListener(clearText);
//        boutonC.addActionListener(clearText);
        ActionListener jbo1 = new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                contenu.append("observateur jbo1: clic sur button " + ((JButton) ea.getSource()).getLabel() + "\n");
            }
        };
        
        ActionListener jbo2 = new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                contenu.append("observateur jbo2: clic sur button " + ((JButton) ea.getSource()).getLabel() + "\n");
            }
        };
        
        ActionListener jbo3 = new ActionListener(){
            public void actionPerformed(ActionEvent ea){
                contenu.append("observateur jbo3: clic sur button " + ((JButton) ea.getSource()).getLabel() + "\n");
            }
        };
        boutonA.addActionListener(jbo1);
        boutonA.addActionListener(jbo2);
        boutonA.addActionListener(jbo3);
        
        // le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(jbo1);
        boutonB.addActionListener(jbo2);
        
        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(jbo1);
      
    }
    
    public static void main(String[] args){
        new IHMQuestion2_1();
    }

}
