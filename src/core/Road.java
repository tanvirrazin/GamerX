package core;


import java.awt.Toolkit;

public class Road extends CarObject{
	
public Road(int yPos){
		
		this.image = Toolkit.getDefaultToolkit().getImage("src/Image/road.png");
		this.xPos = 0;
		this.yPos = yPos;
		X = xPos;
		Y = yPos;
		this.width = 200;
		this.height = 350;
	}

	public void update(){
		if(yPos == 350){
			yPos = -350;
		}else {
			Y += .05;
			yPos = (int)Y;
		}
	}
}
