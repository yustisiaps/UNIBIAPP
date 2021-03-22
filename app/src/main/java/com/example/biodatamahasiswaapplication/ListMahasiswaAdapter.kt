package com.example.biodatamahasiswaapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import kotlinx.android.synthetic.main.item_row_mahasiswa.view.*

class ListMahasiswaAdapter(var items : ArrayList<Mahasiswa>, var clickListener: onMahasiswaItemClickListener) : Adapter<ListMahasiswaAdapter.MahasiswaViewHolder>() {
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        lateinit var mahasiswaViewHolder: MahasiswaViewHolder
        mahasiswaViewHolder = MahasiswaViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row_mahasiswa,
                parent,
                false
            )
        )
        return mahasiswaViewHolder
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        holder.initialize(items.get(position), clickListener)
    }


    class MahasiswaViewHolder(itemView: View) : ViewHolder(itemView) {
        var namaMahasiswa = itemView.tv_nama
        var emailMahasiswa = itemView.tv_detail
        var notlplMahasiswa = itemView.tv_detail
        var detailMahasiswa = itemView.tv_detail
        var photoMahasiswa = itemView.foto_mahasiswa


        fun initialize(item: Mahasiswa, action: onMahasiswaItemClickListener) {
            namaMahasiswa.text = item.nama
            emailMahasiswa.text = item.email
            notlplMahasiswa.text = item.notlp
            detailMahasiswa.text = item.detail
            photoMahasiswa.setImageResource(item.photo)


            itemView.setOnClickListener {
                action.onItemClick(item, adapterPosition)
            }
        }
    }

    interface onMahasiswaItemClickListener {
        fun onItemClick(item: Mahasiswa, position: Int)
    }
}
