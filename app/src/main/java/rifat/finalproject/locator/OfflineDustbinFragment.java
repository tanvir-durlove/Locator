package rifat.finalproject.locator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class OfflineDustbinFragment extends ListFragment {
    String[] dustbin = {"kalabagan","Khamar Bari","Mohammadpur town hall","Begum Rokeya Avenue","Tejgaon",
    "Mirpur1","Mirpur 14","New Market","Hatirjheel","Mohakhali",
    "Kalyanpur","Badda","Gabtoli Bus Terminal","Gulistan","Jatrabari","Shahabag","Shankar"};

    String[] location = {"kalabagan Lazz Pharma","Khamar Bari Circle","Mohammadpur Town hall","Begum Rokeya Avenue",
            "Tejgaon Bus Stand","Mirpur1 Bazar","Mirpur 14 Circle","New Market Footover Bridge","Hatirjheel Circle",
            "Mohakhali Bus Stand","Kalyanpur Bus Stand","Badda Circle",
            "Gabtoli Bus Terminal","Gulistan DCC Market","Jatrabari Near Flyover","Shahabag Circle",
            "Shankar Bus Stand"};

    String [] time = {"6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM",
            "6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM"};


    ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
    SimpleAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < dustbin.length; i++) {
            map = new HashMap<String, String>();
            map.put("Dustbin", dustbin[i]);
            map.put("Locations", location[i]);
            map.put("Time", time[i]);

            data.add(map);
        }

        String[] from = {"Dustbin", "Locations","Time"};
        int[] to = {R.id.toilet, R.id.location,R.id.time};

        adapter = new SimpleAdapter(getActivity(), data, R.layout.tab_fragment_1, from, to);
        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos, long id) {

                Toast.makeText(getActivity(), data.get(pos).get("Dustbin"), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
