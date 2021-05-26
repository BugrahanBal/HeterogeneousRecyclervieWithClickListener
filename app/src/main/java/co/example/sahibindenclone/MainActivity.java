package co.example.sahibindenclone;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.sahibindenclone.Horizontal.HorizontalData;
import co.example.sahibindenclone.Vertical.MListener;
import co.example.sahibindenclone.Vertical.VerticalData;

public class MainActivity extends AppCompatActivity implements MListener {

    private ArrayList<Object> objects = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recy);

        MainAdapter adapter = new MainAdapter(this, getObject(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList <Object> getObject() {
        objects.add(VerticalData.getData().get(0));
        objects.add(HorizontalData.getDataHorizontal().get(0));
        objects.add(HorizontalData.getDataHorizontal().get(2));
        return objects;
    }

    @Override
    public void onClick(int position, Object object) {
        if (object instanceof VerticalData) {

        }else if (object instanceof HorizontalData) {
        }
    }
}