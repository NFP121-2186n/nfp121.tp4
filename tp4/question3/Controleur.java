
package question3;
import question3.tp3.PileI;
import question3.tp3.PilePleineException;
import question3.tp3.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Controleur extends JPanel {

    private JButton push, add, sub, mul, div, clear;
    private PileModele<Integer> pile;
    private JTextField donnee;

    public Controleur(PileModele<Integer> pile) {
        super();
        this.pile = pile;
        this.donnee = new JTextField(8);
        this.push = new JButton("push");
        this.add = new JButton("+");
        this.sub = new JButton("-");
        this.mul = new JButton("*");
        this.div = new JButton("/");
        this.clear = new JButton("[]");
        setLayout(new GridLayout(2, 1));
        add(donnee);
        JPanel boutons = new JPanel();
        boutons.setLayout(new FlowLayout());
        boutons.add(push);  push.addActionListener(new ButtonListener());
        boutons.add(add);   add.addActionListener(new ButtonListener());
        boutons.add(sub);   sub.addActionListener(new ButtonListener());
        boutons.add(mul);   mul.addActionListener(new ButtonListener());
        boutons.add(div);   div.addActionListener(new ButtonListener());
        boutons.add(clear); clear.addActionListener(new ButtonListener());
        add(boutons);
        boutons.setBackground(Color.red);
    }

    private Integer operande() throws NumberFormatException {
        return Integer.parseInt(donnee.getText());
    }

    
    class ButtonListener implements ActionListener {
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
            if(source == push){
                try{
                    pile.empiler(operande());
                  }
                  catch(NumberFormatException exc){
                      donnee.setText("Donnee non acceptable");
                    }
                  catch(PilePleineException exc){
                    donnee.setText("La Pile est pleine");
                }   
            }
            else if(source == add){
                try{
                    pile.empiler(pile.depiler() + pile.depiler());
                }
                catch(PilePleineException exc){
                    donnee.setText("La Pile est pleine");
                }
                catch(PileVideException exc){
                    donnee.setText("La Pile est vide");
                }   
            } 
            else if(source == sub) {
                try{
                    pile.empiler(pile.depiler() - pile.depiler());
                }
                catch(PilePleineException exc){
                    donnee.setText("La Pile est pleine");
                }
                catch(PileVideException exc){
                    donnee.setText("La Pile est vide");
                }   
            }
            else if(source == mul) {
                try{
                    pile.empiler(pile.depiler() * pile.depiler());
                }
                catch(PilePleineException exc){
                    donnee.setText("La Pile est pleine");
   }
                catch(PileVideException exc){
                    donnee.setText("La Pile est vide");
                }   
            }
            else if(source == div) {
                try{
                    int temp1 = pile.depiler();
                    int temp2 = pile.depiler();
                    if(temp2 == 0){
                        pile.empiler(temp2);
                        pile.empiler(temp1);
                        donnee.setText("Ne peut pas diviser par 0");
                    }
                    else pile.empiler(temp1/ temp2);
                }
                catch(PilePleineException exc){
                    donnee.setText("La Pile est pleine");
                }
                catch(PileVideException exc){
                    donnee.setText("La Pile est vide");
                }   
            }
            else {
                while(!pile.estVide()){
                   try{
                       pile.depiler();
                    } catch(PileVideException exc){
                    }
                }
            }
        }
    }
}
