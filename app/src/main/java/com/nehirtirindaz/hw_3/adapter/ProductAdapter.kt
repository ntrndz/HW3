package com.nehirtirindaz.hw_3.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.nehirtirindaz.hw_3.R
import com.nehirtirindaz.hw_3.databinding.ItemProductBinding
import com.nehirtirindaz.hw_3.model.Product
import com.nehirtirindaz.hw_3.util.downloadURL

    class ProductAdapter(private var productList: ArrayList<Product>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

        class ProductViewHolder(var view: ItemProductBinding): RecyclerView.ViewHolder(view.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = DataBindingUtil.inflate<ItemProductBinding>(inflater, R.layout.item_product,parent,false)

            return ProductViewHolder(view)
        }

        override fun getItemCount(): Int {
            return productList.size
        }

        override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
            holder.view.productTV.text = productList[position].title
            holder.view.priceTV.text = productList[position].price.toString()
            holder.view.productIV.downloadURL(productList[position].imageUrl)

        }

        @SuppressLint("NotifyDataSetChanged")
        fun  updateList(newList: List<Product>){
            productList = newList as ArrayList<Product>
            notifyDataSetChanged()
        }





}