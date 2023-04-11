package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Blocos extends Rectangle{
	
	public Blocos (int x, int y) {
		super (x,y,32,32);
	}
	
	public void render(Graphics g) {
		
		g.drawImage(Spritesheet.parede_lateral, x,y,32,32,null);
	}
}
