package net.kdt.aesirlaunch.prefs.screens;

import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.preference.Preference;

import net.kdt.aesirlaunch.R;
import net.kdt.aesirlaunch.Tools;
import net.kdt.aesirlaunch.utils.GLInfoUtils;

public class LauncherPreferenceMiscellaneousFragment extends LauncherPreferenceFragment {
    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_misc);
        Preference driverPreference = requirePreference("zinkPreferSystemDriver");
        PackageManager packageManager = driverPreference.getContext().getPackageManager();
        boolean supportsTurnip = Tools.checkVulkanSupport(packageManager) && GLInfoUtils.getGlInfo().isAdreno();
        driverPreference.setVisible(supportsTurnip);
    }
}
