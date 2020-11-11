
import org.newdawn.slick.Animation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ethan
 */
public class Enemy extends Character{
    
    public Enemy(int h, int d, int l, int s, int x, int y, Animation ii, Animation irr, Animation irl, Animation ij, Animation ifa, Boolean g, Boolean jm,Boolean cm) {
        super(h, d, l, s, x, y, ii, irr, irl, ij, ifa, g, jm,cm);
    }
    
    public boolean seePlayer(MainCharacter f){
        if(f.getXP()-XP >= -150 && f.getXP()-XP <= 150 && f.getYP()-YP >= -150 &&f.getYP()-YP <= 150) return true;
        else return false;
    }
    
    public void MoveToPlayer(MainCharacter f){
        if(f.getXP()>XP)
            XP+=speed;
        else if(f.getXP()<XP)
            XP-=speed;
        
        
    }
    
    public void CheckMove(){
        if(ground==false){
        Ani = f;
        YP+=speed;
}
    }
    
}
