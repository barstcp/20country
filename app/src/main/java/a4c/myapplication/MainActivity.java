package a4c.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        List<Couotry> cities1 = generateCityList();

        recyclerView.setLayoutManager(layoutManager);

        final Adapter cityad = new cityAdapter(cities1);

        recyclerView.setAdapter(cityad);


    }

    private List<Couotry> generateCityList() {
        List<Couotry> cities = new ArrayList<>();
        cities.add(new Couotry("Абзазия", "Сухум", "8 600", R.mipmap.bkhazia));
        cities.add(new Couotry("Австралия" , "Канберра",	"7 686 850",R.mipmap.ustria));
        cities.add(new Couotry("Болгария" , "София", "110 910" , R.mipmap.ulgaria));
        cities.add(new Couotry("Россия", "Москва", "17 102 345",R.mipmap.ussia));

        cities.add(new Couotry("Абзазия", "Сухум", "8 600", R.mipmap.bkhazia));
        cities.add(new Couotry("Австралия" , "Канберра",	"7 686 850",R.mipmap.ustria));
        cities.add(new Couotry("Болгария" , "София", "110 910" , R.mipmap.ulgaria));
        cities.add(new Couotry("Россия", "Москва", "17 102 345",R.mipmap.ussia));

        cities.add(new Couotry("Абзазия", "Сухум", "8 600", R.mipmap.bkhazia));
        cities.add(new Couotry("Австралия" , "Канберра",	"7 686 850",R.mipmap.ustria));
        cities.add(new Couotry("Болгария" , "София", "110 910" , R.mipmap.ulgaria));
        cities.add(new Couotry("Россия", "Москва", "17 102 345",R.mipmap.ussia));

        cities.add(new Couotry("Абзазия", "Сухум", "8 600", R.mipmap.bkhazia));
        cities.add(new Couotry("Австралия" , "Канберра",	"7 686 850",R.mipmap.ustria));
        cities.add(new Couotry("Болгария" , "София", "110 910" , R.mipmap.ulgaria));
        cities.add(new Couotry("Россия", "Москва", "17 102 345",R.mipmap.ussia));

        cities.add(new Couotry("Абзазия", "Сухум", "8 600", R.mipmap.bkhazia));
        cities.add(new Couotry("Австралия" , "Канберра",	"7 686 850",R.mipmap.ustria));
        cities.add(new Couotry("Болгария" , "София", "110 910" , R.mipmap.ulgaria));
        cities.add(new Couotry("Россия", "Москва", "17 102 345",R.mipmap.ussia));

        return cities;
    }

    class cityAdapter extends RecyclerView.Adapter<citiesViewHolder> {


        private List<Couotry> cities;

        public cityAdapter(List<Couotry> cities1) {
            this.cities = cities1;
        }

        @Override
        public citiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View rowView = layoutInflater.inflate(R.layout.row_city,parent,false);
            return new citiesViewHolder(rowView);
        }

        @Override
        public void onBindViewHolder(citiesViewHolder holder, int position) {
            String cityName = cities.get(position).city;
            String countryName = cities.get(position).counytry;
            String st = cities.get(position).st;
            Integer img = cities.get(position).getImg();

            holder.cityName.setText(cityName);
            holder.conutyName.setText(countryName);
            holder.stName.setText(st);
            holder.img.setImageResource(img);


        }

    /*    public void add(){
            ImageView a= new ImageView(MainActivity.this);
            a.setImageResource(R.mipmap.Abkhazia);


            cities.add(new Couotry("fsfd","fsdfs", "sfdsfs", a));
            notifyDataSetChanged();
        }
*/
        @Override
        public int getItemCount() {
            return cities.size();
        }
    }


        public class citiesViewHolder extends RecyclerView.ViewHolder {

            public TextView cityName;
            public TextView conutyName;
            public TextView stName;
            public ImageView img;

            public citiesViewHolder(View itemView) {
                super(itemView);
                cityName = (TextView) itemView.findViewById(R.id.pl);
                conutyName = (TextView) itemView.findViewById(R.id.country);
                stName = (TextView) itemView.findViewById(R.id.st);
                img = (ImageView) itemView.findViewById(R.id.img);

            }
        }

    public class Couotry {

        String city;
        String counytry;
        String st;
        Integer img;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCounytry() {
            return counytry;
        }

        public void setCounytry(String counytry) {
            this.counytry = counytry;
        }

        public String getSt() {
            return st;
        }

        public void setSt(String st) {
            this.st = st;
        }

        public Integer getImg() {
            return img;
        }

        public void setImg(Integer img) {
            this.img = img;
        }

        public Couotry(String city, String counytry, String st, Integer img) {

            this.city = city;
            this.counytry = counytry;
            this.st = st;
            this.img = img;
        }
    }

}
