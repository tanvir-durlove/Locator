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
    String[] dustbin = {"G", "H", "I"};
    String[] location = {"J", "K", "L"};

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
            data.add(map);
        }

        String[] from = {"Dustbin", "Locations"};
        int[] to = {R.id.dustbin, R.id.location};

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
