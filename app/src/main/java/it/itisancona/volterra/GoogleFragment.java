package it.itisancona.volterra;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class GoogleFragment extends Fragment {
	
	public GoogleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_nuovo, container, false);
        
        
        
        
        
        return rootView;
    }
	
	@Override
    public void onActivityCreated (Bundle savedInstanceState){
            super.onActivityCreated(savedInstanceState);
            

            
            
            
            
            WebView webView;
            webView = (WebView)getView().findViewById(R.id.webView);
            webView.loadUrl("https://plus.google.com/u/0/communities/116830549828318534299");
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
    		
        }

}
