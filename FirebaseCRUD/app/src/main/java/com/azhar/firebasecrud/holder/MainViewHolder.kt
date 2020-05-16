package com.azhar.firebasecrud.holder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.azhar.firebasecrud.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @JvmField
    var namaBarang: TextView

    @JvmField
    var merkBarang: TextView

    @JvmField
    var hargaBarang: TextView

    @JvmField
    var view: CardView

    init {
        namaBarang = itemView.findViewById(R.id.nama_barang)
        merkBarang = itemView.findViewById(R.id.merk_barang)
        hargaBarang = itemView.findViewById(R.id.harga_barang)
        view = itemView.findViewById(R.id.cvMain)
    }
}