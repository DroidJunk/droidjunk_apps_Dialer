/*
 * Copyright (C) 2007-2008 Esmertec AG.
 * Copyright (C) 2007-2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer;

import android.app.ActionBar;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.util.Log;
import android.view.MenuItem;

import com.android.dialer.R;
import com.android.dialer.dialpad.DialpadFragment;

/**
 * With this activity, users can set preferences for MMS and SMS and
 * can access and manipulate SMS messages stored on the SIM.
 */
public class DailerColorPreferenceActivity extends Activity {
    
	// Symbolic names for the keys used for preference lookup
	public static final String DIALER_BUTTON_BG_COLOR	= "dialer_button_bg_color";
	public static final String DIALER_DIGIT_COLOR 		= "dialer_digit_color";
    public static final String DIALER_TEXT_COLOR		= "dialer_text_color";	
    public static final String DIALER_ACTIONBAR_ICON	= "dialer_actionbar_icon_color";	
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Display the fragment as the main content.
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new PrefsFragment()).commit();
    }
    
	
    public static class PrefsFragment extends PreferenceFragment 
    		implements OnPreferenceChangeListener{
    	
    	private Preference mDialerButtonBG;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Load the preferences from an XML resource
            addPreferencesFromResource(R.xml.color_preferences);
            DialtactsActivity.redrawDialpad = true;
        }

		@Override
		public boolean onPreferenceChange(Preference preference, Object newValue) {
			// TODO Auto-generated method stub
			return false;
		}
    }	

 


}
