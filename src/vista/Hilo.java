package vista;

public class Hilo extends Thread {

	public void run() {

		Portada presentacion = new Portada();
		presentacion.setVisible(true);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		presentacion.dispose();
	}
}
