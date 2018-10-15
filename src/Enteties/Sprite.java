package Enteties;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Main.Game;
import Main.Variables;

public class Sprite {

	private int x, y, width, height;
	private BufferedImage image;
	private Game game;
	
	
	public Sprite(int pX, int pY, BufferedImage pImage, Game pGame)
	{
		Variables.px = pX;
		Variables.py = pY;
		Variables.pwidth = pImage; //.getWidth();
		Variables.pheight = pImage; //.getHeight();
		this.image = pImage;
		this.game = pGame;
	}
	
	public void logic(float tpf){
		
	}
	
	public void render(Graphics g)
	{
		g.drawImage(this.image, x, y, null);
	}

	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHight() {
		return height;
	}

	public void setHight(int hight) {
		this.height = hight;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
}
