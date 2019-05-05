package itisvolterrancona.itisancona.volterra;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;


class MyWebViewClient extends WebViewClient {
	
	ProgressDialog mProgress;
    boolean loadingFinished = true;
    boolean redirect = false;
    static boolean menuOut = false;
	@Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
     // TODO Auto-generated method stub
     super.onPageStarted(view, url, favicon);
     loadingFinished = false;
     menuOut = false;
     //mProgress.show();
    }

	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		 if (!loadingFinished) {
	          redirect = true;
	       }

	    loadingFinished = false;
		view.loadUrl(url);
		return true;
	}
	
	// when finish loading page
	public void onPageFinished(WebView view, String url) {
		if(!redirect){
	          loadingFinished = true;
	       }

	       if(loadingFinished && !redirect){
	    	   if(null !=mProgress) {
	    		   if(mProgress.isShowing()) {
		    			mProgress.dismiss();
		    			menuOut = false;
		    		}
	    		}
	    	   
	       } else{
	          redirect = false; 
	       }
	}
}
