package in.dhuma1981.wearabledemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.support.wearable.view.WatchViewStub.OnLayoutInflatedListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class WearableActivity extends Activity {

	private TextView mTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wearable);
		
		 final WatchViewStub stub = (WatchViewStub)findViewById(R.id.watch_view_stub);
	        stub.setOnLayoutInflatedListener(new OnLayoutInflatedListener() {
				
				@Override
				public void onLayoutInflated(WatchViewStub arg0) {
					// TODO Auto-generated method stub
					mTextView=(TextView)stub.findViewById(R.id.text);
					mTextView.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Toast.makeText(getApplicationContext(), "CLicked", Toast.LENGTH_LONG).show();
						}
					});
				}
			});
	}

	
}
