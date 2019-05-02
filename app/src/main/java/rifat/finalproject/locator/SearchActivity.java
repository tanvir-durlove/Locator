package rifat.finalproject.locator;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Locale;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;


public class SearchActivity extends Activity {

    // Declare Variables
    ListView list;
    ListViewAdapter adapter;
    EditText editsearch;
    String[] zone;
    String[] place;
    String[] category;
    String[] time;
    String[] cost;
    int[] flag;
    ArrayList<SearchModel> arraylist = new ArrayList<SearchModel>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Generate sample data
        zone = new String[] {"kalabagan","Khamar Bari","Mohammadpur town hall","Begum Rokeya Avenue","Tejgaon",
                "Mirpur1","Mirpur 14","New Market","Hatirjheel","Mohakhali",
                "Kalyanpur","Badda","Gabtoli Bus Terminal","Gulistan","Jatrabari","Shahabag","Shankar","Dhanmondi 1", "Dhanmondi 2", "Rayer bazar","Mohammadpur 1", "Mohammadpur 2",
                "Kalyanpur","Farmget 1", "Farmget 2","Tejgaon", "Panthapath","Science lab","New market ",
                "Hatirjheel","Mirpur-1 1","Mirpur-1 2","Mirpur-1 3", "Mirpur-10","Gabtoli","Bijoy Sarani","Badda","Chandrima Udyan Rd",
                "Paikpara","Indira Road","Mohakhali"};

        place = new String[] {"kalabagan Lazz Pharma","Khamar Bari Circle","Mohammadpur Town hall","Begum Rokeya Avenue",
                "Tejgaon Bus Stand","Mirpur1 Bazar","Mirpur 14 Circle","New Market Footover Bridge","Hatirjheel Circle",
                "Mohakhali Bus Stand","Kalyanpur Bus Stand","Badda Circle",
                "Gabtoli Bus Terminal","Gulistan DCC Market","Jatrabari Near Flyover","Shahabag Circle",
                "Shankar Bus Stand","12 Dhanmondi Lake Rd, Dhaka 1205", "7Dhanmondi Lake Rd, Dhaka 1205",
                "Rayer bazaar circle","Mohammadpur Basilla Road","Mohammadpur Khilji Rd",
                "Kalyanpur Foot Over Bridge","Farmget Park","Farmgate Foot Over Bridge, Dhaka 1215",
                "Tejgaon  Truck Stand Road","Panthapath Bir Uttam CR Dutta Rd",
                "Science lab Noor Mansion (Gausia), 2nd floor",
                "New market 18 Garden Road","Hatirjheel Bridge","Mirpur 1 Zoo Road",
                "Sha Ali Market Mirpur 1","Mirpur Buddijibi Graveyard","Mirpur 10 Stadium","Gabtoli Bus Terminal Internal Rd",
                "Bijoy Sarani Begum Rokeya Sarani Link Road","Badda Rd No 13, Dhaka 1212","Chandrima Udyan Rd",
                "81 Panir Pumper Goli, Dhaka 1216","Indira Road, Dhaka 1215","Mohakhali Rail Gate"};

        category = new String[] {"Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin",
                "Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Dustbin","Toilet","Toilet","Toilet","Toilet","Toilet",
                "Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet","Toilet",
                "Toilet","Toilet","Toilet","Toilet","Toilet","Toilet"};

        time = new String[]{"6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM",
                "6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM",
                "6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM",
                "6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM","6 AM - 12 AM"};

        cost = new String[]{"Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free","Free",
        "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
                "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
                "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka",
                "Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka","Pee : 05 Taka\nCloset:10Taka"};

        flag = new int[] { R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,
                R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,
                R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,
                R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,R.drawable.ic_delete_black_24dp,
                R.drawable.ic_delete_black_24dp,
                R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,
                R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,
                R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,R.drawable.toilet,
                R.drawable.toilet,R.drawable.toilet,R.drawable.toilet};

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview);

        for (int i = 0; i < zone.length -1; i++)
        {
            SearchModel wp = new SearchModel(zone[i], place[i],
                    category[i],time [i],cost[i], flag[i]);
            // Binds all strings into an array
            arraylist.add(wp);
        }

        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
        list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (EditText) findViewById(R.id.search);

        // Capture Text in EditText
        editsearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
                // TODO Auto-generated method stub
            }
        });
    }
}