package arb.test.recyclerview.v2.and.picasso

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RecyclerAdapter(private val data:List<String>, private val context:Context): RecyclerView.Adapter<arb.test.recyclerview.v2.and.picasso.RecyclerAdapter.CustomViewHolder>() {
    private val picasso = Picasso.get()

    inner class CustomViewHolder(parent:View):RecyclerView.ViewHolder(parent){
        val img = parent.findViewById<ImageView>(R.id.custom_img)
        val layout = parent.findViewById<LinearLayout>(R.id.custom_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.custom,parent,false))
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        picasso.load(data[position]).into(holder.img)

        holder.layout.setOnClickListener {
            val intent = Intent(context,FullScreen::class.java)
            intent.putExtra("imgID",data[position])
            context.startActivity(intent)
        }

    }
}