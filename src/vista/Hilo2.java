package vista;

public class Hilo2 extends Thread{
	
	public void run() {

		Chat chat = new Chat();
		chat.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		chat.dispose();
	}

}
