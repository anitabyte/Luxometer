/*
 * SpeedMeterPreferenceActivety.java
 *
 *  (c) 2013 mugcupsoup@gmail.com
 *
 *  Licensed under the MIT license.
 *  http://www.opensource.org/licenses/mit-license
 */

package xyz.anitabyte.luxometer.LightMeter;

import xyz.anitabyte.luxometer.R;
import android.os.Bundle;
import android.preference.PreferenceActivity;

public class LightMeterPreferenceActivety extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }
    
}
