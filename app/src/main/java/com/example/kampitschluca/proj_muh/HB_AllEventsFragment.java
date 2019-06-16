package com.example.kampitschluca.proj_muh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;


public class HB_AllEventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments

        return inflater.inflate(R.layout.hb_fragment_item_listallevents, container, false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles


        final ListView v= getView().findViewById(R.id.listView);
        ArrayAdapter<Veranstaltung> adapter;
        ArrayList<Veranstaltung> arrayList=new ArrayList<Veranstaltung>();
        arrayList.add(new Veranstaltung(1,"Schimmen",15,10,new Date(2019,10,01),new Date(2019,10,02),"Villach"));
        arrayList.add(new Veranstaltung(2,"Radeln",15,10,new Date(2019,10,06),new Date(2019,10,8),"Klagenfurt"));
        adapter = new ArrayAdapter<Veranstaltung>(view.getContext(),android.R.layout.simple_list_item_1, arrayList);

        v.setAdapter(adapter);
        getActivity().setTitle("Alle Events");

    }
}
