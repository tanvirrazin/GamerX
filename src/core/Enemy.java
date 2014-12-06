package core;

import java.awt.Rectangle;
import java.awt.Toolkit;

public class Enemy extends CarObject {
	
	double Y;

public Enemy(int xPos){
		
		this.image = Toolkit.getDefaultToolkit().getImage("src/Image/car_E.gif");
		this.xPos = xPos;
		this.yPos = -200;
		Y = 0;
		this.width = 40;
		this.height = 70;
		this.rect = new Rectangle(xPos,yPos,width,height);
	}
	
	public void update(){
		Y += .15;
		yPos = (int)Y;
		rect.y = yPos;
	}

}
