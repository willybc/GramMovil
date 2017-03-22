package io.github.httpswillybc.appmovil.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.httpswillybc.appmovil.R;
import io.github.httpswillybc.appmovil.adapter.PictureAdapterRecyclerView;
import io.github.httpswillybc.appmovil.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchFragment);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/564x/ed/e7/38/ede73801a8524253ee67fae14c0c9235.jpg", "Gabriel Mederos", "4 días", "3 Me gusta"));
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/564x/b0/50/99/b05099d4c118dd0bff1b4aa8f1baded0.jpg", "Gabriel Caballero", "2 días", "5 Me gusta"));
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/564x/d8/44/18/d84418cc3ee82dee2338cff38f4a6408.jpg", "Pablo Dina", "1 días", "4 Me gusta"));


        return pictures;
    }

}