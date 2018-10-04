package e.cisco2018.lealkentexam2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.prevButton) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

}


}
