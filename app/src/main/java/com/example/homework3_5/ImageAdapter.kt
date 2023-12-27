package com.example.homework3_5

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.ImageModel
import com.example.PixaModel
import com.example.homework3_5.databinding.ItemImageBinding

class ImageAdapter (private val list : ArrayList<ImageModel>) :
    Adapter<ImageAdapter.ImageViewHolder>() {
    inner class ImageViewHolder (val binding: ItemImageBinding) : ViewHolder (binding.root){
        fun onBind(image: ImageModel) {
            binding.pixaImage.load(image.largeImageURL)
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    fun addNewImages(list: ArrayList<ImageModel>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ImageAdapter.ImageViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size



}