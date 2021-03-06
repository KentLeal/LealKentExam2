package e.cisco2018.lealkentexam2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, customService.class);
        startService(i);
    }

    public void process(View v){
        Intent i=null, chooser=null;
        if(v.getId() == R.id. nextButton){
            i = new Intent(this,MainActivity2.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.mapButton){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.6097° N, 120.9896° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}
