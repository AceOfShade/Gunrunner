package Engin;

public class Player {
int jh; //max Sprungh�he von Variables kopiert
	
	public void move(){
		if(Variables.moveright==true)
		{	if(Variables.px<730){					
				Variables.px+=Variables.speedright;
		}
<<<<<<< HEAD
		}
		if(Variables.moveleft==true){
		if(Variables.px>0)
		{
		Variables.px-=Variables.speedleft;
				}
		}
		//Jump
		if(Variables.py >= 400) {jh = Variables.jumpheight; } // jump max h�he;
		
		if(Variables.moveup && jh != 0){
			if(Variables.py>0 ){Variables.velY-=Variables.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Variables.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w h�lt)
		}
		if(Variables.velY == 0 && Variables.py < 400) { //sinken
			Variables.py+= Variables.speeddown; //sinken
		}
		 
		if(Variables.velY < 0 && jh > 0) { //steigen
			Variables.py-= Variables.speedjump;
			Variables.velY++;
			jh--;
		}
		
		if(Variables.py > 400){	//wenn man in den boden buggt
				Variables.py = 400; 
			}
		//Jump-Ende
		if(Variables.debug) {System.out.println("Vel: " + Variables.velY + Variables.moveup);}//debug mode
=======
	}

	public void jump(){
		this.velY -=500;
	} 
	public void moveRight() {
		velX += Variables.speedright;
	}
	
	public void moveLeft() {
		velX += Variables.speedleft;
>>>>>>> 1b9759f88fa44a424baa56948b988ea6c637ae5b
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int jh; //max Sprungh�he von Variables kopiert
	
	public void move(){
		if(Variables.moveright==true)
		{	if(Variables.px<730){					
				Variables.px+=Variables.speedright;
		}
		}
		if(Variables.moveleft==true){
		if(Variables.px>0)
		{
		Variables.px-=Variables.speedleft;
				}
		}
		//Jump
		if(Variables.py >= 400) {jh = Variables.jumpheight; } // jump max h�he;
		
		if(Variables.moveup && jh != 0){
			if(Variables.py>0 ){Variables.velY-=Variables.speedjump; } //Sprung ges. hinzugeben (voller Sprung)
		}else {
			Variables.velY = 0; //Sprung ges. hinzugeben (nicht voller Sprung, solang man w h�lt)
		}
		if(Variables.velY == 0 && Variables.py < 400) { //sinken
			Variables.py+= Variables.speeddown; //sinken
		}
		 
		if(Variables.velY < 0 && jh > 0) { //steigen
			Variables.py-= Variables.speedjump;
			Variables.velY++;
			jh--;
		}
		
		
		//Jump-Ende*/
		
	
}
