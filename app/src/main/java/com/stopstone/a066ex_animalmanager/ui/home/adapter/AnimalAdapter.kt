package com.stopstone.a066ex_animalmanager.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.stopstone.a066ex_animalmanager.data.local.entity.Animal
import com.stopstone.a066ex_animalmanager.databinding.ItemAnimalListBinding

class AnimalAdapter: RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    private val items = mutableListOf<Animal>()
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(
            ItemAnimalListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
    
    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun submitList(newItems: MutableList<Animal>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    class AnimalViewHolder(
        private val binding: ItemAnimalListBinding,
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: Animal) {
            binding.tvAnimalName.text = animal.name
        }

    }
}