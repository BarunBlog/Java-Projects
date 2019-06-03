package pack1;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import pack1.gfx.ImageLoader;
import pack1.gfx.SpriteSheet;
import pack2.Display;

public class Game implements Runnable { // This will allow to run on a thread
	private Display display;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private boolean running = false;
	public int width, height;
	public String title;
	
	//private BufferedImage test;
	//private SpriteSheet sheet;

	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	private void init() {
		display = new Display(title, width, height);
		//test = ImageLoader.loadImage("/textures/sprite sheet.png");
		//sheet = new SpriteSheet(test);
	}

	private void tick() {
		
	}

	private void render() {
		bs = display.getCanvas().getBufferStrategy();// it tells how to draw things on computer
		if(bs==null) {
			display.getCanvas().createBufferStrategy(3);// create 3 buffers
			return;
		}
		g = bs.getDrawGraphics();// a magical paint-brush
		
		/*g.setColor(Color.red);
		g.fillRect(30, 50, 70, 100);
		g.setColor(Color.BLUE);
		g.fillRect(90, 140, 50, 70);
		g.clearRect(30, 50, 100, 140);
		g.drawRect(30, 50, 70, 80);*/
		
		//g.fillRect(0, 0, width, height);
		//g.drawImage(test, 5, 5, null);
		//g.drawImage(sheet.crop(0, 268, 534, 225), 50, 50, null);
		bs.show();
		g.dispose();
	}

	public void run() {
		init();
		while (running) { // Game loop
			tick();
			render();
		}
		stop();
	}

	// When we use thread instance, we use synchronized keyword
	public synchronized void start() { // Start the thread
		if(running)
			return;
		running = true;
		thread = new Thread(this);// What class you want run on thread: Game.
		thread.start(); // will call run method
	}

	public synchronized void stop() { // Stop the thread
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
