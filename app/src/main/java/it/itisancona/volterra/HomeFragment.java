package it.itisancona.volterra;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;


public class HomeFragment extends Fragment
{

    public  HomeFragment(){}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        return rootView;
    }
	
	@Override
    public void onActivityCreated (Bundle savedInstanceState)
	{
            super.onActivityCreated(savedInstanceState);
    }
	
}
