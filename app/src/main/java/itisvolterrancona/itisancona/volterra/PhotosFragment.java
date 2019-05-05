package itisvolterrancona.itisancona.volterra;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class PhotosFragment extends Fragment {
	
	public PhotosFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_photos, container, false);
        return rootView;
    }
	
	@Override
    public void onActivityCreated (Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);

            WebView webView;
            webView = (WebView)getView().findViewById(R.id.webView);
            webView.loadUrl("http://moodle22.iisve.it/login/index.php"); //cambiato link
            webView.getSettings().setBuiltInZoomControls(false); 
            webView.getSettings().setSupportZoom(false);
            webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);   
            webView.getSettings().setAllowFileAccess(true);
            webView.getSettings().setBuiltInZoomControls(true);
            int scale = (int) (50 * webView.getScale());
            webView.setInitialScale( scale );
            webView.setVisibility(0);
            webView.getSettings().setJavaScriptEnabled(true);
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
    		
        }
}
