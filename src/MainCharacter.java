
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

public class MainCharacter extends Character {

    int timer=0;
    int vel,vel2,vel3;
    
    
    public MainCharacter(int h, int d, int l, int s, int x, int y,Animation i,Animation rr,Animation rl,Animation j,Animation f, Animation hit,Boolean g, Boolean jm,Boolean cm,Boolean cm2) {
        super(h, d, l, s, x, y,i,rr,rl,j,f,hit,g,jm,cm,cm2);
        vel=0;
        vel2=0;
        vel3=0;
        
    }

    public void CheckMove(GameContainer gc) {
        
        Hitbox.setX(XP);
        Hitbox.setY(YP);
        
        Input in = gc.getInput();
            
            if(jump==false&&ground==false){
                Ani = f;
                YP+=speed;
            }
        
             if (in.isKeyDown(Input.KEY_A)&&in.isKeyPressed(Input.KEY_SPACE)&&jump==false&&ground==true&&canmove==true&&canmove2==true){
                vel-=25;
                jump=true;
                XP -= speed;
                Ani = j;
            }
             
             else if (in.isKeyDown(Input.KEY_D)&&in.isKeyPressed(Input.KEY_SPACE)&&jump==false&&ground==true&&canmove==true&&canmove2==true){
                vel-=25;
                jump=true;
                XP += speed;
                Ani = j;
            }
            
           else if (in.isKeyDown(Input.KEY_D)&&ground==true&&canmove==true&&canmove2==true) {
                XP += speed;
                Ani = rr;
                
            }
            
          else  if (in.isKeyDown(Input.KEY_D)&&ground==false&&canmove==true&&canmove2==true) {
                XP += speed;
                Ani = f;
                
            }
        
          else  if (in.isKeyDown(Input.KEY_A)&&ground==true&&canmove==true&&canmove2==true) {
                XP -= speed;
                Ani = rl;
            }
          else  if (in.isKeyDown(Input.KEY_A)&&ground==false&&canmove==true&&canmove2==true) {
                XP -= speed;
                Ani = f;
            }
            
          else  if (in.isKeyPressed(Input.KEY_SPACE)&&jump==false&&ground==true&&canmove==true&&canmove2==true){
                vel-=25;
                jump=true;
                Ani = j;
            }
             
         else   if(jump==false&&ground==true&&canmove==true&&canmove2==true){
                Ani=i;
            }
             
            if(jump==true)
            {
                jump();
            }
            
            if(canmove==false){
               Hit();
            } 
            else if(canmove2==false){
               Hit2();
            } 
             
    }
    
    public void jump(){
        YP+=vel/2;
        vel++;
        Hitbox.setY(YP);
        if(vel==0){
            vel=0;
            jump=false;
        }
        
    }
    
    public void hit(){
        canmove=false;
        vel2+=10;
        Ani=Hit;
        
    }
    
    public void hit2(){
        canmove2=false;
        vel3+=10;
        Ani=Hit;
        
    }
    
    public void Hit(){
        XP+=vel2;
        vel2--;
        Hitbox.setX(XP);
        if(vel2==0){
            vel2=0;
            canmove=true;
        }
        
    }
    public void Hit2(){
        XP-=vel3;
        vel3--;
        Hitbox.setX(XP);
        if(vel3==0){
            vel3=0;
            canmove2=true;
        }
        
    }
    
    public void setVel(int n){
        vel = n;
    }

}
