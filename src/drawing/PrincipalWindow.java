package drawing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PrincipalWindow extends JFrame {
	
	
	
	JPanel panelHaut = new JPanel();
    MyCanvas canvas = new MyCanvas();
    JPanel panelBas = new JPanel();
    JLabel drawWinow = new JLabel("");
    
    
   /* ButtonGroup Frame = new ButtonGroup();
    this.add(Line);
    
    JRadioButton Line = new JRadioButton("Line");
    JRadioButton Rectangle = new JRadioButton("Rectangle");
    JRadioButton Cycle = new JRadioButton("Cycle");
    */
    
    
     
    
    
    
    JButton boutonRejouer = new JButton("Delete");
    JLabel labelMessage = new JLabel("You are a good drawer, thanks");

	public static void main(String[] args) {
		
		PrincipalWindow thisApp = new PrincipalWindow();  
	}
	
	public PrincipalWindow () {
		
		this.setTitle("application of draw");
		this.setBounds(50,50,600,400);
		this.setVisible(true);
		
		
		this.panelBas.setBackground(Color.RED);
        this.panelHaut.setBackground(Color.RED);
        
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(this.panelHaut,BorderLayout.NORTH);
        this.getContentPane().add(this.canvas,BorderLayout.CENTER);
        this.getContentPane().add(this.panelBas,BorderLayout.SOUTH);
        
       
        /*this.panelHaut.add(this.Frame);*/
        this.panelHaut.add(this.boutonRejouer);
        
       
        this.panelBas.add(this.labelMessage); 
        
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
