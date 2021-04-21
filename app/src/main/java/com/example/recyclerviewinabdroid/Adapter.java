package com.example.recyclerviewinabdroid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{

    private List<Modelclass> userlist;
    public  Adapter(List<Modelclass>userlist){this.userlist=userlist;
    }


    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return  new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder holder, int position) {
int resources =userlist.get(position).getImageview1();
String name =userlist.get(position).getTextview1();
String msg=userlist.get(position).getTetview3();
String time=userlist.get(position).getTextView2();
String divider=userlist.get(position).getDivider();
holder.setData (resources,name,msg,time,divider);
    }

    @Override
    public int getItemCount() {
        return userlist.size();


    }

    public class viewHolder extends RecyclerView.ViewHolder {

private ImageView  imageView;
private TextView textView;
private TextView textview1;
private TextView textview2;
private TextView textview3;
private TextView divider;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
             imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview);
    textview2= itemView.findViewById(R.id.textview2);
            textview3=itemView.findViewById(R.id.textview3);

            divider=itemView.findViewById(R.id.divider);

        }

        public void setData(int resources, String name, String msg, String time, String divider) {
            imageView.setImageResource(resources);
            textView.setText(name);
            textview3.setText(msg);
            textview2.setText(divider);
        }
    }
}
