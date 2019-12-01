package com.example.android.marsrealestate.overview

import com.example.android.marsrealestate.network.MarsProperty

sealed class DataItem {
    data class MarsPropertyItem (val marsProperty: MarsProperty): DataItem() {
        override val id: String
            get() = marsProperty.id
    }
    object Header: DataItem() {
        override val id: String
            get() = Long.MIN_VALUE.toString()
    }

    abstract val id: String
}