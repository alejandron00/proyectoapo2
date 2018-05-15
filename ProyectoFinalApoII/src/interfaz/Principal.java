package interfaz;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import javax.swing.UIManager;

public class Principal extends JFrame{

	public static final String STARTPANEL="panel_start_window";
	public static final String LEGALPANEL="panel_legal";																																
	public static final String LOGINPANEL="panel_login";
	public static final String MENUPANEL="panel_menu";
	
	private LegalWindow lw;
	private PanelMenu pMenu;
	
	public Principal() {
		setLayout(new BorderLayout());
		
		setSize(990,990);
		setTitle("Evaluador de compatibilidad");
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pMenu=new PanelMenu(this);
		lw=new LegalWindow(this);
		
		add(pMenu,BorderLayout.CENTER);;
	}



	public static void main(String[] args) {
//hola
	//si van a trabajar en una classe escriban en esta parte: ej, estoy trabajando en la clase Principal
	// esto sinifica que nadie puede trabajar sobre esa clase, saludos cuidense y me avisan si no saben o entienden el diagrama 
		
		/*No estaba seguro si escribir sobre esta clase, pues no sabía si alguien estaba trabajando en ella. Ṕero
		como no se editaba hace tiempo, decidí hacerlo.*/
		
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        	} catch (Exception ex) {
            		ex.printStackTrace();
        	}
		Principal p = new Principal();
	}
	
	public void cerrarLegalWindow() {
		lw.dispose();
	}

	public void cerrarVentanaPrincipal() {
		System.exit(0);
	}
}
