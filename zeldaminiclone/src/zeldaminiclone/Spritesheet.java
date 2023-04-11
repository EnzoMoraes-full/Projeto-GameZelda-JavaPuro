package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	
	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage player_right;
	
	public static BufferedImage player_left;
	
	public static BufferedImage parede_lateral;
	
	public static BufferedImage[] inimigo_front;
	public static BufferedImage inimigo_right;
	public static BufferedImage inimigo_left;
	
	public Spritesheet() {
		try {
		spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	player_front= new BufferedImage[2];
	inimigo_front= new BufferedImage[2];
	
	inimigo_front[0] = Spritesheet.getSprite(160, 258, 16, 16);
	inimigo_front[1] = Spritesheet.getSprite(143, 258, 16, 16);
	
	player_front[0] = Spritesheet.getSprite(0,11,16,16);
	player_front[1] = Spritesheet.getSprite(16,11,16,16);
	
	player_right= Spritesheet.getSprite(52, 12, 16, 16);
	
	player_left= Spritesheet.getSprite(163, 11, 16, 16);
	
	parede_lateral= Spritesheet.getSprite(257, 286, 16, 16);
	
	
}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
	

