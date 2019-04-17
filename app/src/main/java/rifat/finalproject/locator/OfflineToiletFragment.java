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

public class OfflineToiletFragment extends ListFragment {

    String[] toilets = {"A", "B", "C"};
    String[] location = {"D", "E", "F"};

    ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
    SimpleAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < toilets.length; i++) {
            map = new HashMap<String, String>();
            map.put("Toilets", toilets[i]);
            map.put("Locations", location[i]);
            data.add(map);
        }

        String[] from = {"Toilets", "Locations"};
        int[] to = {R.id.toilet, R.id.location};

        adapter = new SimpleAdapter(getActivity(), data, R.layout.tab_fragment_2, from, to);
        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos, long id) {

                Toast.makeText(getActivity(), data.get(pos).get("Toilet"), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
