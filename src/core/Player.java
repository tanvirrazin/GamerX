package core;

import java.awt.Rectangle;
import java.awt.Toolkit;

public class Player extends CarObject{
	
	Integer life;
	Integer point;
	
public Player(){
		
		this.image = Toolkit.getDefaultToolkit().getImage("src/Image/car_P.gif");
		this.xPos = 50;
		this.yPos = 280;
		X = xPos;
		Y = yPos;
		this.width = 40;
		this.height = 70;
		this.rect = new Rectangle(xPos+2,yPos+2,width-4,height-4);
		this.life = 2;
		this.point = 0;
	}
//PL_up=PL_down=PL_left=PL_right

	public void update(gamerX P){
		if((P.PL_up == true)&&(yPos>26)){
			yPos = (int)(Y -= .1);
			rect.y = yPos;
		}else if((P.PL_down == true)&&(yPos<280)){
			yPos = (int)(Y += .1);
			rect.y = yPos;
		}else if((P.PL_left == true)&&(xPos>-1)){
			xPos = (int)(X -= .1);
			rect.x = xPos;
		}else if((P.PL_right == true)&&(xPos<161)){
			xPos = (int)(X += .1);
			rect.x = xPos;
		}
	}

}
