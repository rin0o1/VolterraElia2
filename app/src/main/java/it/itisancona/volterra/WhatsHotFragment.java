package it.itisancona.volterra;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class WhatsHotFragment extends Fragment {
	
	public WhatsHotFragment(){}
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
         
        return rootView;
    }
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
    public void onActivityCreated (Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);


		/*Create a short cut for the play store application (museo) */

		String PathOfApplicationIntoPlayStore = "com.iisve.marco.museoapp";

		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + PathOfApplicationIntoPlayStore)));

		/*
            WebView webView;
            webView = (WebView)getView().findViewById(R.id.webView);
            webView.loadUrl("https://play.google.com/store");
            int scale = (int) (50 * webView.getScale());
            webView.setInitialScale( scale );
            webView.setVisibility(0);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setBuiltInZoomControls(true);
    		// force web view to open inside application
            webView.setWebViewClient(new MyWebViewClient());
    		webView.requestFocus(View.FOCUS_DOWN);
		    webView.setOnTouchListener(new View.OnTouchListener() {
		       	@Override
				public boolean onTouch(View v, MotionEvent event) {
		       		switch (event.getAction()) {
		            case MotionEvent.ACTION_DOWN:
		            case MotionEvent.ACTION_UP:
		                if (!v.hasFocus()) {
		                	v.requestFocus();
		                }
		                break;
		        }
		        return false;
				}
		    });
    		
        */
	}
}
