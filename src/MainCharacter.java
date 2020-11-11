
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

public class MainCharacter extends Character {

    int timer=0;
    
    
    public MainCharacter(int h, int d, int l, int s, int x, int y,Animation i,Animation rr,Animation rl,Animation j,Animation f,Boolean g, Boolean jm,Boolean cm) {
        super(h, d, l, s, x, y,i,rr,rl,j,f,g,jm,cm);
        
    }

    public void CheckMove(GameContainer gc) {
        
        Hitbox.setX(XP);
        Hitbox.setY(YP);
        Input in = gc.getInput();
            
            if(jump==false&&ground==false){
                Ani = f;
                YP+=speed/2;
            }
        
             if (in.isKeyDown(Input.KEY_A)&&in.isKeyDown(Input.KEY_W)){
                YP-=speed*2;
                XP -= speed;
                Ani = j;
            }
             
            else if (in.isKeyDown(Input.KEY_D)&&in.isKeyDown(Input.KEY_W)){
                YP-=speed*2;
                XP += speed;
                Ani = j;
            }
            
            else if (in.isKeyDown(Input.KEY_D)&&jump==false&&ground==true) {
                XP += speed;
                Ani = rr;
                
            }
            
            else if (in.isKeyDown(Input.KEY_D)&&jump==false&&ground==false) {
                XP += speed;
                Ani = f;
                
            }
        
            else if (in.isKeyDown(Input.KEY_A)&&jump==false&&ground==true) {
                XP -= speed;
                Ani = rl;
            }
            else if (in.isKeyDown(Input.KEY_A)&&jump==false&&ground==false) {
                XP -= speed;
                Ani = f;
            }
            
            else if (in.isKeyDown(Input.KEY_W)&&jump==false&&ground==true){
                YP-=speed*2;
                Ani = j;
            }
            
            else if (in.isKeyDown(Input.KEY_W)&&jump==false&&ground==false){
                YP-=speed*2;
                Ani = f;
            }
             
            else if(jump==false&&ground==true){
                Ani=i;
            
            }
    }

}
