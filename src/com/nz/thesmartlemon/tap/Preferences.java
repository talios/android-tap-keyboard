package nz.thesmartlemon.tap;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;

public class Preferences extends Activity implements View.OnClickListener, OnLongClickListener {
	
	@Override
	public void onCreate(Bundle b){
		super.onCreate(b);
		setContentView(R.layout.pref);
		populate();
	}
	
	@Override
	public boolean onLongClick(View arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
	
	String[] symStrings = new String[]{
		"A", 	
		"B",
		"C",
		"D",
		"E",
		"F",
		"G",
		"H",
		"I",
		"J",
		"K",
		"L",
		"M",
		"N",
		"O",
		"P",
		"Q",
		"R",
		"S",
		"T",
		"U",
		"V",
		"W",
		"X",
		"Y",
		"Z",
		"0",
		"1",
		"2",
		"3",
		"4",
		"5",
		"6",
		"7",
		"8",
		"9",
		".",
		",",
		"?"
	};
	
	int[] views = new int[]{
			R.id.inc1,
			R.id.inc2,
			R.id.inc3,
			R.id.inc4,
			R.id.inc5,
			R.id.inc6,
			R.id.inc7,
			R.id.inc8,
			R.id.inc9,
			R.id.inc10
	};
	
	int[] views2 = new int[]{
			R.id.textView1,
			R.id.textView2,
			R.id.textView3,
			R.id.textView4
	};
	String[] sym;
	private void populate(){
		final SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(this);
			
		int counter = 0;
		int counter2 = 0;
		for(int i = 0; i < symStrings.length; i++){
			View inc = findViewById(views[counter]);
			TextView view = (TextView) inc.findViewById(views2[0]);
			view.setText(symStrings[i]);
			counter2++;
			if(counter2 == 3){
				counter2 = 0;
				Log.i("TAG - c2", String.valueOf(counter2));
				counter++;
				Log.i("TAG - c", String.valueOf(counter));
			}
			Log.i("TAG - i", String.valueOf(i));
		}
	}
}
