package ventanas;
import java.awt.Frame;

import javax.swing.*;
import java.awt.BorderLayout;

public class CreandoMarcos {

	public static void main(String[] args) {
		miMarco marco1= new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		JList lista = new JList();
		DefaultListModel modelo = new DefaultListModel();
		for(int i = 1; i<=10; i++){
		        modelo.addElement(i);
		}
		lista.setModel(modelo);
		
		marco1.getContentPane().add(lista, BorderLayout.CENTER);
	
		

	}

}

class miMarco extends JFrame {
	
	public miMarco(){
		
		//setSize(500,300);
		//setLocation(400,200);
		
		setBounds(400,200,550,250);
		//setResizable(false);
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		
		setTitle("Mi Ventana");
		

		
		
	}
	
}
