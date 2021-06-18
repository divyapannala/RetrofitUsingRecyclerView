package com.example.retrofitgetusingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailsAdaptery extends RecyclerView.Adapter<DetailsAdaptery.ViewHolder> {


    List<Details> details;
    Context mcontext;

    public DetailsAdaptery(Context mcontext, List<Details> details) {
        this.mcontext = mcontext;
        this.details = details;
    }

    public void setDetailsList(List<Details> details){
        this.details=details;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DetailsAdaptery.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.details_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsAdaptery.ViewHolder holder, int position) {
          holder.personname.setText(details.get(position).getName());
          holder.emailid.setText(details.get(position).getEmail());
          holder.mobileno.setText(details.get(position).getPhone());
          holder.city.setText(details.get(position).getAddress().getCity());
          holder.pincode.setText(details.get(position).getAddress().getZipcode());

    }

    @Override
    public int getItemCount() {
        if(details!=null) {
            return details.size();
        }
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView personname,emailid,mobileno,city,pincode;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            personname=itemView.findViewById(R.id.personname);
            emailid=itemView.findViewById(R.id.Emailid);
            mobileno=itemView.findViewById(R.id.phoneno);
            city=itemView.findViewById(R.id.city);
            pincode=itemView.findViewById(R.id.zipcode);


        }
    }
}
