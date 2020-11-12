
import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ethan
 */
public class Enemy extends Character {

    Boolean see = false, dead = false;

    int x, y;

    Animation die;

    int Dtimer;

    public Enemy(int h, int d, int l, int s, int x, int y, Animation ii, Animation irr, Animation irl, Animation ij, Animation ifa, Animation hit, Animation de, Boolean g, Boolean jm, Boolean cm, Boolean cm2) {
        super(h, d, l, s, x, y, ii, irr, irl, ij, ifa, hit, g, jm, cm, cm2);
        die = de;
        Dtimer = 0;
    }

    public boolean seePlayer(MainCharacter f) {
        if (f.getXP() - XP >= -150 && f.getXP() - XP <= 150 && f.getYP() - YP >= -150 && f.getYP() - YP <= 150) {
            see = true;
            return true;
        } else {
            see = false;
            return false;
        }
    }

    public void MoveToPlayer(MainCharacter f) {
        if (f.getXP() > XP && canmove == true) {
            XP += speed;
            Ani = rr;
        } else if (f.getXP() < XP && canmove == true) {
            XP -= speed;
            Ani = rl;
        }

    }

    public void CheckMove() {
        Hitbox.setX(XP);
        Hitbox.setY(YP);
        if (ground == false && canmove == true) {
            Ani = f;
            YP += speed;
        }

        if (see == false && ground == true && canmove == true) {
            Ani = i;
        }

        if (Health <= 0) {

            x = XP;
            y = YP;
            die();
            Hitbox.setX(50000);
            Hitbox.setY(50000);
            XP = 50000;
            YP = 50000;
            canmove = false;
            Health = 1;
        }

    }

    public void die() {
        Dtimer = 100;
        Dtimer--;
        if (Dtimer > 50) {
            Ani = Hit;
            Ani.draw(x, y);
        }
        else if(Dtimer>0){
            Ani=die;
            Ani.draw(x,y);
                }
        if (Dtimer == 0) {
            XP = 50000;
            YP = 50000;
            dead = false;
            Health = 1;
        }
        if(Dtimer<0)
            die();
    }

}
