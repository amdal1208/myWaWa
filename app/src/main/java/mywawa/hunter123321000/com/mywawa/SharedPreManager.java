package mywawa.hunter123321000.com.mywawa;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by rd on 2017/9/25.
 */

public class SharedPreManager {
    private static final String SHARED_PREF_NAME = "FCMSharedPref";
    private static final String TAG_EMAIL = "tagemail";

    private static SharedPreManager mInstance;
    private static Context mCtx;

    private SharedPreManager(Context context) {
        mCtx = context;
    }

    public static synchronized SharedPreManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPreManager(context);
        }
        return mInstance;
    }

    //this method will save the email to shared preferences
    public boolean saveDeviceEmail(String email) {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(TAG_EMAIL, email);
        editor.apply();
        return true;
    }

    //this method will fetch the device token from shared preferences
    public String getUserEmail() {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(TAG_EMAIL, null);
    }

}