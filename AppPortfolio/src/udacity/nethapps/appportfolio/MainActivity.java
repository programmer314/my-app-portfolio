package udacity.nethapps.appportfolio;

import java.util.HashMap;
import java.util.Map;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


@SuppressLint("UseSparseArrays")
public class MainActivity extends ActionBarActivity {
	// will be of type "Map<Integer, Class<?>>" for intent(Context, Class<?>)
	private static Map<Integer, String> activities = new HashMap<Integer, String>();
	
	static {
		activities.put(R.id.spotifyStreamer, "spotify streamer");
		activities.put(R.id.scoresApp, "scores app");
		activities.put(R.id.libraryApp, "library app");
		activities.put(R.id.buildItBigger, "build it bigger app");
		activities.put(R.id.XYZReader, "XYZ reader");
		activities.put(R.id.capstone, "capstone app");
	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    // will execute when a button is clicked
    public void clickButton(View v) {
    	Toast.makeText(
    			getApplicationContext(), 
    			"This button will launch my " + activities.get(v.getId()) + "!", 
    			Toast.LENGTH_LONG).show();
    	
    }
    
}
