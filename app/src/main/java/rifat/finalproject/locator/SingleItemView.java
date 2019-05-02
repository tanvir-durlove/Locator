package rifat.finalproject.locator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtrank;
    TextView txtcountry;
    TextView txtpopulation,txttime,txtcost;
    ImageView imgflag;
    String rank,time,cost;
    String country;
    String population;
    int flag;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
        // Get the intent from ListViewAdapter
        Intent i = getIntent();
        // Get the results of rank
        rank = i.getStringExtra("rank");
        // Get the results of country
        country = i.getStringExtra("country");
        // Get the results of population
        population = i.getStringExtra("population");
        time = i.getStringExtra("time");
        cost = i.getStringExtra("cost");
        // Get the results of flag
        flag = i.getIntExtra("flag", flag);

        // Locate the TextViews in singleitemview.xml
        txtrank = (TextView) findViewById(R.id.rank);
        txtcountry = (TextView) findViewById(R.id.country);
        txtpopulation = (TextView) findViewById(R.id.population);
        txttime = (TextView) findViewById(R.id.time);
        txtcost= (TextView) findViewById(R.id.cost);


        // Locate the ImageView in singleitemview.xml
        imgflag = (ImageView) findViewById(R.id.flag);

        // Load the results into the TextViews
        txtrank.setText(rank);
        txtcountry.setText(country);
        txtpopulation.setText(population);
        txtcost.setText(cost);
        txttime.setText(time);

        // Load the image into the ImageView
        imgflag.setImageResource(flag);
    }
}
