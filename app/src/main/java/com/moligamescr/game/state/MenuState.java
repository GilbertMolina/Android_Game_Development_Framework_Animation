package com.moligamescr.game.state;

import android.view.MotionEvent;
import com.moligamescr.framework.util.Painter;
import com.moligamescr.simpleandroidgdf.Assets;


public class MenuState extends State{

    @Override
    public void init() {
        //No implementado.
    }

    @Override
    public void update(float delta) {
        //No implementado.
    }

    @Override
    public void render(Painter g) {
        g.drawImage(Assets.welcome, 0, 0);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
