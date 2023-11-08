package com.example.assignment.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView recyclerView;
    ProfileAdapter profileAdapter;
    ArrayList<ProfileViewModel> info;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        recyclerView = binding.rycviewProfilesExplore;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        info = new ArrayList<ProfileViewModel>();
        info.add(0, new ProfileViewModel("TS",
                "Tony Stark",
                "New York | Billionare",
                "2 KM",
                "Coffee | Business | Friendship",
                "Hi"));
        info.add(1, new ProfileViewModel("RN",
                "Robert De Niro",
                "New York | Actor",
                "5 KM",
                "Coffee | Business | Friendship",
                "Howdy"));

        profileAdapter = new ProfileAdapter(getContext(), info);
        recyclerView.setAdapter(profileAdapter);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}