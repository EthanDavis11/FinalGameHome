
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

public class LevelSelect extends BasicGameState {
    final int LEVELS = 3;
    
    
    Rectangle[] levelbuttons = new Rectangle[LEVELS];
    Image[] picbuttons = new Image[LEVELS];

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        int x=50,y=150;
        for (int i = 0; i < levelbuttons.length; i++) {
                
            levelbuttons[i] = new Rectangle(x, y, 50,50);
            
            
            x+=200;
            if(x==600){
                x=50;
                y+=50;
            }
        }
        for (int i = 0; i < picbuttons.length; i++) {
            picbuttons[i] = new Image("Images.Free.Menu.Levels/0"+ (i + 1) +".png");
            
        }

    }

    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input in = gc.getInput();
        int mx = in.getMouseX(), my = in.getMouseY();

        if (in.isMousePressed(Input.MOUSE_LEFT_BUTTON)) {

            for (int j = 0; j < levelbuttons.length; j++) {
                
                if(levelbuttons[j].contains(mx,my))
                sbg.enterState(2, new FadeOutTransition(), new FadeInTransition());

            }
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor(Color.yellow);

        g.drawString("Level Select", 325, 50);
        
        g.setColor(Color.black);

        for (int i = 0; i < levelbuttons.length; i++) {
            g.setColor(Color.yellow);
            g.fill(levelbuttons[i]);
            g.setColor(Color.black);
            g.drawString((i+1) + "",levelbuttons[i].getX()+5,levelbuttons[i].getY()+5);
        }
        
        for (int i = 0; i < picbuttons.length; i++) {
           
            picbuttons[i].draw(levelbuttons[i].getX(),levelbuttons[i].getY());
            
        }
        
    }

    public int getID() {
        return 1;  //this id will be different for each screen
    }

}
