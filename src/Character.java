
import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Rectangle;

public abstract class Character {
    
    int Health,Damage,level,speed,XP,YP;
    
    Animation Ani,i,rr,rl,j,f,Hit;
    
    Boolean ground,jump,canmove,canmove2;
    
    Rectangle Hitbox;

    
    public Character(int h, int d, int l, int s, int x, int y,Animation ii,Animation irr,Animation irl,Animation ij,Animation ifa, Animation hit,Boolean g,Boolean jm,Boolean cm,Boolean cm2){
        Health = h;
        Damage = d;
        level = l;
        speed = s;
        XP=x;
        YP=y;
        i=ii;
        rr=irr;
        rl=irl;
        j=ij;
        f=ifa;
        Hit=hit;
        Ani=ii;
        ground = g;
        jump = jm;
        canmove=cm;
        canmove2=cm2;
        
        Hitbox = new Rectangle(XP,YP,Ani.getWidth(),Ani.getHeight());
    }
    
    final public int getHealth() {
        return Health;
    }
    
    final public int getDamage() {
        return Damage;
    }
    
    final public int getLevel() {
        return level;
    }
    
    final public int getSpeed() {
        return speed;
    }
    
    final public int getXP(){
        return XP;
    }
    final public int getYP(){
        return YP;
    }
    
    final public boolean getGround(){
        return ground;
    }
    
    final public boolean getJump(){
        return jump;
    }
    final public boolean getCanMove(){
        return canmove;
    }
    
    public Animation getAnimation(){
        return Ani;
    }
    
    public Rectangle getHitBox(){
        return Hitbox;
    }
    
    public void setHealth(int i){
        Health = i;
    }
    public void setDamage(int i){
        Damage = i;
    }
    public void setLevel(int i){
        level = i;
    }
    public void setSpeed(int i){
        speed = i;
    }
    public void setXP(int X){
        XP=X;
    }
    public void setYP(int Y){
        YP=Y;
    }
    public void setGround(Boolean g){
        ground = g;
    }
    
    
}
