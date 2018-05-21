package vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class Reportes extends JTextArea{
	
	public Reportes(){	
		setBorder(new TitledBorder("Consulta de reportes"));
		//setLayout(new GridLayout(5, 1, 2, 2));
	}
}
