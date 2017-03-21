package io.github.httpswillybc.appmovil.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.httpswillybc.appmovil.R;
import io.github.httpswillybc.appmovil.model.Picture;

import java.util.ArrayList;
import android.support.v7.widget.RecyclerView;
import io.github.httpswillybc.appmovil.adapter.PictureAdapterRecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("", false, view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.picturesProfileRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e35/16110595_454505524673367_4122055997176938496_n.jpg", "Willy Bardales", "1 dias", "8 Me gusta"));
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e35/14733280_203343590140783_1602351641284050944_n.jpg", "Willy Bardales", "3 dias", "4 Me gusta"));
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e15/11356649_877030755705789_573658507_n.jpg", "Willy Bardales", "79 semanas", "2 Me gusta"));
        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
