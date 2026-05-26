package net.kdt.aesirlaunch.fragments;

import net.kdt.aesirlaunch.modloaders.FabriclikeUtils;
import net.kdt.aesirlaunch.modloaders.ModloaderListenerProxy;

public class QuiltInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "QuiltInstallFragment";
    private static ModloaderListenerProxy sTaskProxy;

    public QuiltInstallFragment() {
        super(FabriclikeUtils.QUILT_UTILS, TAG);
    }
}
