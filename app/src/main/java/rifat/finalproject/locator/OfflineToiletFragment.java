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

    String[] toilets = {"Dhanmondi 1", "Dhanmondi 2", "Rayer bazar","Mohammadpur 1", "Mohammadpur 2",
    "Kalyanpur","Farmget 1", "Farmget 2","Tejgaon", "Panthapath","Science lab","New market ",
    "Hatirjheel","Mirpur-1 1","Mirpur-1 2","Mirpur-1 3", "Mirpur-10","Gabtoli","Bijoy Sarani","Badda","Chandrima Udyan Rd",
    "Paikpara","Indira Road","Mohakhali"};

    String[] location = {"12 Dhanmondi Lake Rd, Dhaka 1205", "7Dhanmondi Lake Rd, Dhaka 1205",
    "Rayer bazaar circle","Mohammadpur Basilla Road","Mohammadpur Khilji Rd",
    "Kalyanpur Foot Over Bridge","Farmget Park","Farmgate Foot Over Bridge, Dhaka 1215",
    "Tejgaon  Truck Stand Road","Panthapath Bir Uttam CR Dutta Rd",
    "Science lab Noor Mansion (Gausia), 2nd floor",
    "New market 18 Garden Road","Hatirjheel Bridge","Mirpur 1 Zoo Road",
    "Sha Ali Market Mirpur 1","Mirpur Buddijibi Graveyard","Mirpur 10 Stadium","Gabtoli Bus Terminal Internal Rd",
    "Bijoy Sarani Begum Rokeya Sarani Link Road","Badda Rd No 13, Dhaka 1212","Chandrima Udyan Rd",
    "81 Panir Pumper Goli, Dhaka 1216","Indira Road, Dhaka 1215","Mohakhali Rail Gate"};

    String [] time = {"6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM",
            "6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM"};

    String [] cost = {"Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
            "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
            "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
            "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka"};

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
            map.put("Cost",cost[i]);
            map.put("Time",time[i]);
            data.add(map);
        }

        String[] from = {"Toilets", "Locations","Cost","Time"};
        int[] to = {R.id.toilet, R.id.location,R.id.cost,R.id.time};

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

                Toast.makeText(getActivity(), data.get(pos).get("Toilets"), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
