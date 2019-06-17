package com.example.kampitschluca.proj_muh;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class HB_MyEvntsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.hb_fragment_myevents, container, false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //        //you can set the title for your toolbar here for different fragments different titles

        final ListView v= getView().findViewById(R.id.listView);
        ArrayAdapter<Veranstaltung> adapter;
        ArrayList<Veranstaltung> arrayList=new ArrayList<Veranstaltung>();
        arrayList.add(new Veranstaltung(1,"Schwimmen",15,10,new Date(2019,10,01),new Date(2019,10,02),"Villach"));
        adapter = new ArrayAdapter<Veranstaltung>(view.getContext(),android.R.layout.simple_list_item_1, arrayList);



        v.setAdapter(adapter);

        /*v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Veranstaltung s=(Veranstaltung) v.getItemAtPosition(position);
                Intent intent = new Intent( HB_MyEvntsFragment.this, ShowDetails.class);
                intent.putExtra("object", s);
                startActivity(intent);
            }
        });*/
        getActivity().setTitle("Meine Events");
    }
}
