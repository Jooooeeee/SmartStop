package tool;

import android.app.Application;
import android.content.Context;

/**
 * Created by joe on 2017/12/8.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
