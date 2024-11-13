package com.stopstone.a066ex_animalmanager.data

import com.stopstone.a066ex_animalmanager.data.local.entity.Animal

object Storage {
    val items = mutableListOf<Animal>().apply {
        repeat(10) {
            add(
                Animal("흰둥이", 4, "강아지", favorites = emptyList())
            )
        }
    }
}