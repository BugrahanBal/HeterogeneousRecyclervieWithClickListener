package co.example.sahibindenclone.Vertical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import co.example.sahibindenclone.R;

public class VerticalAdapter extends RecyclerView.Adapter< VerticalAdapter.Holder > {

    ArrayList<VerticalData> mData;
    LayoutInflater inflater;
    MListener MListener;

    public VerticalAdapter(Context context, ArrayList<VerticalData> data, MListener MListener) {
        this.mData = data;
        inflater = LayoutInflater.from(context);
        this.MListener = MListener;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.vertical_row, parent, false);
        Holder holder = new Holder(( view ));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        VerticalData selectedVerticalData = mData.get(position);

        holder.kategori.setText(selectedVerticalData.getKategori());
        holder.altKategori.setText(selectedVerticalData.getAltKategori());
        holder.imageKategori.setImageResource(selectedVerticalData.getImageKategori());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MListener.onClick(position, selectedVerticalData);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView kategori;
        TextView altKategori;
        ImageView imageKategori;

        public Holder(@NonNull View itemView) {
            super(itemView);

            kategori = itemView.findViewById(R.id.kategori);
            altKategori = itemView.findViewById(R.id.altKategori);
            imageKategori = itemView.findViewById(R.id.imageKategori);
        }

        @Override
        public void onClick(View v) {

        }
    }
}