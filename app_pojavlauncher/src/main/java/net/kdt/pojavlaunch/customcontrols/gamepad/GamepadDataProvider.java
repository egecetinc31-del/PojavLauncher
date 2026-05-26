package net.kdt.aesirlaunch.customcontrols.gamepad;

import net.kdt.aesirlaunch.GrabListener;

public interface GamepadDataProvider {
    GamepadMap getMenuMap();
    GamepadMap getGameMap();
    boolean isGrabbing();
    void attachGrabListener(GrabListener grabListener);
    void detachGrabListener(GrabListener grabListener);
}
