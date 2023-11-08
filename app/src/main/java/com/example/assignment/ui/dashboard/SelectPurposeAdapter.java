package com.example.assignment.ui.dashboard;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.example.assignment.R;
import java.util.ArrayList;
import java.util.List;

public class SelectPurposeAdapter extends RecyclerView.Adapter<SelectPurposeViewHolder> {

    private Context context;
    private List<String> data;

    public SelectPurposeAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;

    }


    @NonNull
    @Override
    public SelectPurposeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.select_purpose_rycview_item, parent, false);
        return new SelectPurposeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectPurposeViewHolder holder, int position) {
        holder.purpose.setText(data.get(position));
        holder.purpose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.purpose.setTextColor(Color.WHITE);
                holder.purpose.setBackground(AppCompatResources.getDrawable(context, R.drawable.spn_rounded_fill));
            }
        });
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
}

class SelectPurposeViewHolder extends RecyclerView.ViewHolder {
    TextView purpose;


    public SelectPurposeViewHolder(@NonNull View itemView) {
        super(itemView);

        purpose = itemView.findViewById(R.id.text_sp_sprycview);

    }
}
