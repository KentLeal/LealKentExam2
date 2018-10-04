package e.cisco2018.lealkentexam2;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class customService extends IntentService {
    public customService() {
        super("customService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("customService", "Custom Service");
    }
}