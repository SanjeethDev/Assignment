package com.example.assignment.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.MainActivity;
import com.example.assignment.R;
import com.example.assignment.databinding.FragmentDashboardBinding;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardFragment extends Fragment {

    RecyclerView recyclerView;
    List<String> purposeData;
    String[] arrayPurpose;
    SelectPurposeAdapter PurposeAdapter;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter.createFromResource(
                binding.getRoot().getContext(),
                R.array.select_your_availability,
                android.R.layout.simple_spinner_item);
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerSyaDashboard.setAdapter(staticAdapter);

        recyclerView = binding.rycviewSpDashboard;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getParentFragment().getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        purposeData = new ArrayList<String>();
        arrayPurpose = getResources().getStringArray(R.array.purpose);
        purposeData.addAll(Arrays.asList(arrayPurpose));
        PurposeAdapter = new SelectPurposeAdapter(getParentFragment().getContext(), purposeData);
        recyclerView.setAdapter(PurposeAdapter);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}