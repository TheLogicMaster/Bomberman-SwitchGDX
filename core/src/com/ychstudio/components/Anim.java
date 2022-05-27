package com.ychstudio.components;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import java.util.HashMap;

public class Anim extends Component {
    private HashMap<String, Animation<TextureRegion>> anims;

    public Anim() {
        anims = new HashMap<>();
    }
    
    public Anim(HashMap<String, Animation<TextureRegion>> anims) {
        this.anims = anims;
    } 
    
    public void putAnimation(String state, Animation<TextureRegion> anim) {
        anims.put(state, anim);
    }
    
    public Animation<TextureRegion> getAnimation(String state) {
        return anims.get(state);
    }
    
    public TextureRegion getTextureRegion(String state, float stateTime) {
        return anims.get(state).getKeyFrame(stateTime);
    }
    
    public TextureRegion getTextureRegion(String state, float stateTime, boolean looping) {
        return anims.get(state).getKeyFrame(stateTime, looping);
    }

}
