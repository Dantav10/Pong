package ca.dantav.game;

public class GameThread implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			
			try {
				
				Thread.sleep(50);
				Panel.PANEL.repaint();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
