package com.example.assignment.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.assignment.R;
import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileViewHolder> {

    private Context context;
    private ArrayList<ProfileViewModel> info;

    public ProfileAdapter(Context context, ArrayList<ProfileViewModel> info) {
        this.context = context;
        this.info = info;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_rycview_item, parent, false);
        return new ProfileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        holder.initials.setText(info.get(position).initials);
        holder.fullname.setText(info.get(position).fullname);
        holder.location.setText(info.get(position).location);
        holder.distance.setText(info.get(position).distance);
        holder.purpose.setText(info.get(position).purpose);
        holder.status.setText(info.get(position).status);
    }

    @Override
    public int getItemCount() {
        return info.size();
    }
}

class ProfileViewHolder extends RecyclerView.ViewHolder {
    TextView initials;
    TextView fullname;
    TextView location;
    TextView distance;
    TextView purpose;
    TextView status;


    public ProfileViewHolder(@NonNull View itemView) {
        super(itemView);
        initials = itemView.findViewById(R.id.initials_prycvitem);
        fullname = itemView.findViewById(R.id.name_prycvitem);
        location = itemView.findViewById(R.id.location_prycvitem);
        distance = itemView.findViewById(R.id.distance_prycvitem);
        purpose = itemView.findViewById(R.id.purpose_prycvitem);
        status = itemView.findViewById(R.id.status_prycvitem);

    }
}
