package com.alvindev.clientalvin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BarangAdapter extends RecyclerView.Adapter<BarangViewHolder>{
    Context context;
    List barangList;
    public BarangAdapter(Context context, List<Barang> barangList){
        this.context = context;
        this.barangList = barangList;
    }

    @NonNull
    @Override
    public BarangViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View view = inflater.inflate(R.layout.card_item_data, null);
        return new BarangViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BarangViewHolder holder, int position) {
        Barang barang = (Barang) barangList.get(position);
        Glide.with(context).load(barang.getGambar()).into(holder.gambar);
        holder.nama.setText(barang.getNamaBarang());
        holder.harga.setText(barang.getHarga());
        holder.ket.setText(barang.getKeterangan());
        holder.promo.setText(barang.getPromo());
    }

    @Override
    public int getItemCount() {
        return barangList.size();
    }
}

class BarangViewHolder extends RecyclerView.ViewHolder {
    ImageView gambar;
    TextView nama, harga, ket, promo;
    public BarangViewHolder(@NonNull View itemView) {
        super(itemView);
        gambar = itemView.findViewById(R.id.gambarBarang);
        nama = itemView.findViewById(R.id.txtTitleBarang);
        harga = itemView.findViewById(R.id.txtHargaBarang);
        ket = itemView.findViewById(R.id.txtTitleKeterangan);
        promo = itemView.findViewById(R.id.txtPromo);
    }
}
