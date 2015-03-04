/**
 * @author Dan Kestell
 * Based on libgdx tutorial from ForeignGuyMike 
 * https://www.youtube.com/watch?v=85A1w1iD2oA&index=1&list=PL-2t7SM0vDfdYJ5Pq9vxeivblbZuFvGJK
 */
package com.ivy.game.states;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.ivy.game.handlers.GameStateManager;
import com.ivy.game.main.Game;

public class LevelsMap extends GameState
{
  private TextureRegion region;
  private GameButton[][] buttons; //Custom button class
  
  public LevelsMap(GameStateManager gsm)
  {
    super (gsm);
    
    region = new TextureRegion(Game.res.getTexture("bkgrndimg.jpg"), 0, 0, 320, 240);
    
    TextureRegion buttonReg = new TextureRegion(Game.res.getTexture())
  }
  
  
}
