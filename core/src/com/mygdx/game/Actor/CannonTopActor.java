package com.mygdx.game.Actor;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.GlobalClasses.Assets;
import com.mygdx.game.MyBaseClasses.Scene2D.OneSpriteStaticActor;

/**
 * Created by tanulo on 2017. 12. 07..
 */

public class CannonTopActor extends OneSpriteStaticActor {

    CannonActor cannonActor;

    public CannonTopActor(CannonActor cannonActor) {
        super(Assets.manager.get(Assets.CANNON_TOP_TEXTURE));
        this.cannonActor = cannonActor;
        setSize(getWidth()/300,getHeight()/300);
        setRotation(80);
        setPosition(cannonActor.getX()-0.45f,cannonActor.getY()+0.57f);
    }

    public void shot(float f){
        setRotation(f);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        if(getStage()!=null){
            if(cannonActor.isRobbanas()){
                getStage().getActors().removeValue(this, true);
            }
        }
    }
}
