package co.example.sahibindenclone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.sahibindenclone.Horizontal.HorizontalAdapter;
import co.example.sahibindenclone.Horizontal.HorizontalData;
import co.example.sahibindenclone.Vertical.VerticalAdapter;
import co.example.sahibindenclone.Vertical.MListener;
import co.example.sahibindenclone.Vertical.VerticalData;

import static co.example.sahibindenclone.Horizontal.HorizontalData.getDataHorizontal;
import static co.example.sahibindenclone.Vertical.VerticalData.getData;

public class MainAdapter extends RecyclerView.Adapter <RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList <Object> items;
    private final int VERTICAL = 1;
    private final int HORIZONTAL = 2;
    MListener mListener;

    public MainAdapter(Context context, ArrayList<Object> items, MListener mListener) {
        this.context = context;
        this.items = items;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        RecyclerView.ViewHolder holder;
        switch (viewType) {
            case VERTICAL:
                view = inflater.inflate(R.layout.vertical, parent, false);
                holder = new VerticalViewHolder(view);
                break;
            case HORIZONTAL:
                view = inflater.inflate(R.layout.horizontal, parent, false);
                holder = new HorizontalViewHolder(view);
                break;
            default:
                view = inflater.inflate(R.layout.horizontal, parent, false);
                holder = new HorizontalViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == VERTICAL)
            verticalView((VerticalViewHolder) holder);
        else if (holder.getItemViewType() == HORIZONTAL)
            horizontalView((HorizontalViewHolder) holder);
    }

    private void verticalView(VerticalViewHolder holder) {

        VerticalAdapter adapter1 = new VerticalAdapter(context.getApplicationContext(), getData(), mListener);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        holder.recyclerView.setAdapter(adapter1);
    }

    private void horizontalView(HorizontalViewHolder holder) {
        HorizontalAdapter adapter = new HorizontalAdapter(context.getApplicationContext(), getDataHorizontal(), mListener);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof VerticalData)
            return VERTICAL;
        if (items.get(position) instanceof HorizontalData)
            return HORIZONTAL;
        return -1;
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        HorizontalViewHolder(View itemView) {
            super(itemView);
            //horizontal xml inin içindeki recylerview
            recyclerView = itemView.findViewById(R.id.horizontalRcy);
        }
    }

    public class VerticalViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        VerticalViewHolder(View itemView) {
            super(itemView);
            //vertical xml inin icindeki recyclerview
            recyclerView = itemView.findViewById(R.id.verticalRcy);
        }
    }
}
