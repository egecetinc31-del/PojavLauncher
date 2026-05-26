package net.kdt.aesirlaunch.fragments;

import net.kdt.aesirlaunch.modloaders.FabriclikeUtils;
import net.kdt.aesirlaunch.modloaders.ModloaderListenerProxy;

public class FabricInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "FabricInstallFragment";

    public FabricInstallFragment() {
        super(FabriclikeUtils.FABRIC_UTILS, TAG);
    }
}
