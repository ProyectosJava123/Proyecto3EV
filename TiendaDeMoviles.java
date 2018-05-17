package Proyecto3EV;

import java.awt.EventQueue;


public class TiendaDeMoviles {

	public static void main(String[] args) {
	
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						EntornoGrafico window = new EntornoGrafico();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}

}
