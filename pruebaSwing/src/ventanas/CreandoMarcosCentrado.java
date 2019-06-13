package ventanas;
import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreandoMarcosCentrado {
	JPanel contentPane;
	
		public static void main(String[] args) {
			
			MarcoCentrado mimarco = new MarcoCentrado();
			
			mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
			
			
		}

}


class MarcoCentrado extends JFrame{
	public MarcoCentrado(){
		Toolkit mipantalla= Toolkit.getDefaultToolkit();
		
		Dimension tamanioPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalla.height;
		int anchoPantalla = tamanioPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("MarcoCentrado");
		Image miIcono = mipantalla.getImage("src/ventanas/logo.png");
		setIconImage(miIcono);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Lamina milamina = new Lamina();
		add(milamina);
		
		
		JButton boton1 = new JButton();
		boton1.setText("Click");
		boton1.setBounds(100, 100, 100, 40);
		boton1.setEnabled(true);
		boton1.setMnemonic(1);
		boton1.setForeground(Color.BLUE);
		boton1.setFont(new Font("cooper black",3,20));
		boton1.setBackground(Color.BLACK);
		add(boton1);
		
		
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Estamos Aprendiendo Swing", 100, 100);
		
	}
	
}