package bulletgame;

import java.util.LinkedList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;



public class BulletGame extends BasicGame{
	
	private LinkedList<Entity> entities;
	
	public BulletGame(String title) {
		super(title);
		entities = new LinkedList<Entity>();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		entities.add(new Bullet(200,0));
	}
	
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		for (Entity entity : entities) {
		      entity.render(g);
		    }
	}
	
	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		 for (Entity entity : entities) {
		      entity.update(delta);
		    }
	}
	
	public static void main(String[] args) {
		 try {
		     BulletGame game = new BulletGame("Super Bullet Game");
		      AppGameContainer appgc = new AppGameContainer(game);
		      appgc.setDisplayMode(640, 480, false);
		      appgc.start();
		 } catch (SlickException e) {
		      e.printStackTrace();
		 	}
	}
}
