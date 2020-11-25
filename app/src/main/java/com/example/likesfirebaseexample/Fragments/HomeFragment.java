package com.example.likesfirebaseexample.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.likesfirebaseexample.Adapters.ProductAdapter;
import com.example.likesfirebaseexample.Helpers.ProductItem;
import com.example.likesfirebaseexample.R;

public class HomeFragment extends Fragment {

    private final ArrayList<ProductItem> productItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ProductAdapter(productItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        productItems.add(new ProductItem(R.drawable.premium_komfortmatratze_smood, "Premium komfortmatratze smood","0","0"));
        productItems.add(new ProductItem(R.drawable.premium_komfortmatratze_smood2, "Premium komfortmatratze smood","1","0"));
        productItems.add(new ProductItem(R.drawable.premium_komfortmatratze2_smood, "Premium komfortmatratze smood","2","0"));
        productItems.add(new ProductItem(R.drawable.premium_komfortmatratze_smood3, "Premium komfortmatratze smood","3","0"));
        productItems.add(new ProductItem(R.drawable.smoodspring_bett_i_webstoff_eiche_massiv, "Smoodspring bett i webstoff eiche massiv","4","0"));
        productItems.add(new ProductItem(R.drawable.smoodspring_bett_i_webstoff_eiche_massiv2, "Smoodspring bett i webstoff eiche massiv","5","0"));
        productItems.add(new ProductItem(R.drawable.smoodspring_bett_i_webstoff_eiche_massiv3, "Smoodspring bett i webstoff eiche massiv","6","0"));
        productItems.add(new ProductItem(R.drawable.smoodspring_bett_i_webstoff_eiche_massiv4, "Smoodspring bett i webstoff eiche massiv","7","0"));

        return root;
    }
}