package co.example.sahibindenclone.Horizontal;

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
import co.example.sahibindenclone.Vertical.MListener;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalHolder> {

    ArrayList<HorizontalData> mData;
    LayoutInflater inflater;
    MListener MListener;



    public HorizontalAdapter(Context context, ArrayList<HorizontalData> data, MListener MListener){
        this.mData=data;
        this.MListener = MListener;
        inflater= LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public HorizontalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.horizontal_row,parent,false);
        HorizontalAdapter.HorizontalHolder holder = new HorizontalAdapter.HorizontalHolder ((view));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalHolder holder, int position) {

        HorizontalData selectedHorizontalData = mData.get(position);
        holder.imageId.setImageResource(selectedHorizontalData.getImageID());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MListener.onClick(position, selectedHorizontalData);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class HorizontalHolder extends RecyclerView.ViewHolder{

        ImageView imageId;

        public HorizontalHolder(@NonNull View itemView) {
            super(itemView);

            imageId=itemView.findViewById(R.id.productImage);
        }
    }
}
