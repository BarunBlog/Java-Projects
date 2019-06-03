package pack1.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage flower, tulip, hydra, jellyfish, penguins,koala;
	public static void inti() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sprite sheet.png"));
		
	}
}
