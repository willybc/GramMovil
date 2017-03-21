package io.github.httpswillybc.appmovil.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.github.httpswillybc.appmovil.R;
import io.github.httpswillybc.appmovil.adapter.PictureAdapterRecyclerView;
import io.github.httpswillybc.appmovil.model.Picture;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.tab_home), false, view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

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
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e35/16908062_1867802106799689_5700031379773849600_n.jpg", "Danette Bardales", "2 semanas", "9 Me gusta"));
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e35/16229237_1924365044453814_7498607071651168256_n.jpg", "Cristy Bardales", "7 semanas", "24 Me gusta"));
        pictures.add(new Picture("https://instagram.fsst1-2.fna.fbcdn.net/t51.2885-15/e15/11356649_877030755705789_573658507_n.jpg", "Willy Bardales", "7 semanas", "9 Me gusta"));
        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
