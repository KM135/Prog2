package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.TitledBorder;

public class PanelInferior extends JPanel {
	
	private JTextArea area;
	private JScrollPane barra;
	
	public PanelInferior(){
		TitledBorder borde = BorderFactory.createTitledBorder("Zona de reportes");
		setBorder(borde);
		setLayout(new BorderLayout());
		
		area = new JTextArea();
		area.setEditable(false);
		barra = new JScrollPane(area);
		
		add(barra,BorderLayout.CENTER);
	}
	
	public void recibirReporte(String reporte){
		area.setText(reporte);
	}

}
