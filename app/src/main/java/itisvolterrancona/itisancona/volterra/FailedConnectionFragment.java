package itisvolterrancona.itisancona.volterra;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FailedConnectionFragment extends Fragment
{

    private ImageView image;
    public FailedConnectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_failed_connection, container, false);
    }

  /*  @Override
    public  void onResume()
    {

        try {
            image.setImageResource(R.drawable.img_failed_connection);
            TimeUnit.SECONDS.sleep(1);
            image.setImageResource(R.drawable.img_failed_connection_destra);
            TimeUnit.SECONDS.sleep(1);
            image.setImageResource(R.drawable.img_failed_connection_sotto);
            TimeUnit.SECONDS.sleep(1);
            image.setImageResource(R.drawable.img_failed_connection_sinistra);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }*/

}
