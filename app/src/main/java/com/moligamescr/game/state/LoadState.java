package com.moligamescr.game.state;

import android.view.MotionEvent;
import com.moligamescr.framework.util.Painter;
import com.moligamescr.simpleandroidgdf.Assets;

public class LoadState extends State {

    @Override
    public void init() {
        Assets.load();
    }

    @Override
    public void update(float delta) {
        setCurrentState(new MenuState());
    }

    @Override
    public void render(Painter g) {
        //No implementado.
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
