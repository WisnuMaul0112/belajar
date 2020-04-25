package com.wisnu.covid_19.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wisnu.covid_19.R;
import com.wisnu.covid_19.adapter.HistoryListAdapter;
import com.wisnu.covid_19.model.RiwayatModel;
import com.wisnu.covid_19.viewmodel.RiwayatViewModel;

import java.util.ArrayList;



public class RiwayatFragment extends Fragment {

    private HistoryListAdapter adapter;
    private ProgressDialog mProgressApp;

    public RiwayatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_pencegahan, container, false);
    }
}
