package by.marcel.tugas_rcv


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class Osmarcel (
    var judul: String = "",
    var detail : String="",
    var foto : Int = 0
)
class MarcelAdapter (val listMarcelAdapter: ArrayList<Osmarcel>) : RecyclerView.Adapter<MarcelAdapter.ListViewHolder>(){

    inner class ListViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        var judul: TextView = itemview.findViewById(R.id.judul)
        var detail: TextView = itemview.findViewById(R.id.detail)
        var img: ImageView = itemview.findViewById(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item2, parent, false)
        return ListViewHolder(view)
    }


    override fun getItemCount(): Int {
        return listMarcelAdapter.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val listOS = listMarcelAdapter[position]
        Glide.with(holder.itemView.context)
            .load(listOS.foto)
            .apply(RequestOptions().override(55,55))
            .into(holder.img)

        holder.judul.text = listOS.judul
        holder.detail.text = listOS.detail
    }

}
