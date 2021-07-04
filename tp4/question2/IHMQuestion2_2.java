package question2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IHMQuestion2_2 extends JFrame {

    private JButton boutonA = new JButton("A");
    private JButton boutonB = new JButton("B");
    private JButton boutonC = new JButton("C");

    private TextArea contenu = new TextArea(30, 80);

 
    public IHMQuestion2_2() {
        super("IHM Question2_2");
        JPanel enHaut = new JPanel();
        enHaut.add(boutonA);
        enHaut.add(boutonB);
        enHaut.add(boutonC);
        setLayout(new BorderLayout(5, 5));
        add("North", enHaut);
        add("Center", contenu); // contenu sera transmis aux observateurs, voir
                                // la description des constructeurs
        setLocation(150,150);pack();show();
        enHaut.setBackground(Color.magenta);
        

        // Ã  compléter Ã  l'identique de la question 2_1, (du copier/coller)...
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
        // le bouton A a 3 observateurs jbo1, jbo2 et jbo3
        boutonA.addActionListener(jbo1);
        boutonA.addActionListener(jbo2);
        boutonA.addActionListener(jbo3);
        // le bouton B a 2 observateurs jbo1 et jbo2
        boutonB.addActionListener(jbo1);
        boutonB.addActionListener(jbo2);
        // le bouton C a 1 observateur jbo1
        boutonC.addActionListener(jbo1);
        
        
        MouseListener jmo1 = new MouseListener() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
            	contenu.append("observateur jmo1: clic sur button " + ((JButton) e.getSource()).getLabel() + 
            			" en " + "(" +(int)MouseInfo.getPointerInfo().getLocation().getX()+", " +(int)MouseInfo.getPointerInfo().getLocation().getY() +
            			")" +"\n" );
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        };
        
        MouseListener jmo2 = new MouseListener() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				contenu.append("observateur jmo2: clic sur button " + ((JButton) e.getSource()).getLabel() + 
            			" en " + "(" +(int)MouseInfo.getPointerInfo().getLocation().getX()+", " +(int)MouseInfo.getPointerInfo().getLocation().getY() +
            			")" +"\n" );
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        };
        
        MouseListener jmo3 = new MouseListener() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				contenu.append("observateur jmo3: clic sur button " + ((JButton) e.getSource()).getLabel() + 
            			" en " + "(" +(int)MouseInfo.getPointerInfo().getLocation().getX()+", " +(int)MouseInfo.getPointerInfo().getLocation().getY() +
            			")" +"\n" );
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        };
        // Ã  compléter pour la question 2_2 (JMouseObserver)
            // le bouton A a 1 observateur jmo1
        boutonA.addMouseListener(jmo1);
            // le bouton B a 1 observateur jmo2
        boutonB.addMouseListener(jmo2);
            // le bouton C a 1 observateur jmo3
        boutonC.addMouseListener(jmo3);
    }
    
     public static void main(String[] args){
        new IHMQuestion2_1();
        new IHMQuestion2_2();
    }


}
