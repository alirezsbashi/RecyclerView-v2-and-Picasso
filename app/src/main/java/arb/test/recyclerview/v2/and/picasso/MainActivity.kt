package arb.test.recyclerview.v2.and.picasso

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val data = listOf(
            "https://wallpaperplay.com/walls/full/c/5/3/34778.jpg" ,
            "https://wallpaperplay.com/walls/full/a/e/4/34784.jpg" ,
            "https://wallpaperplay.com/walls/full/6/8/8/294.jpg" ,
            "https://wallpaperplay.com/walls/full/9/c/8/291.jpg" ,
            "https://wallpaperplay.com/board/mandalorian-hd-wallpapers" ,
            "https://wallpaperplay.com/walls/full/c/5/3/34778.jpg" ,
            "https://wallpaperplay.com/walls/full/a/e/4/34784.jpg" ,
            "https://wallpaperplay.com/walls/full/6/8/8/294.jpg" ,
            "https://wallpaperplay.com/walls/full/9/c/8/291.jpg" ,
            "https://wallpaperplay.com/board/mandalorian-hd-wallpapers" ,
            "https://wallpaperplay.com/walls/full/c/5/3/34778.jpg" ,
            "https://wallpaperplay.com/walls/full/a/e/4/34784.jpg" ,
            "https://wallpaperplay.com/walls/full/6/8/8/294.jpg" ,
            "https://wallpaperplay.com/walls/full/9/c/8/291.jpg" ,
            "https://wallpaperplay.com/board/mandalorian-hd-wallpapers" ,
            "https://wallpaperplay.com/walls/full/c/5/3/34778.jpg" ,
            "https://wallpaperplay.com/walls/full/a/e/4/34784.jpg" ,
            "https://wallpaperplay.com/walls/full/6/8/8/294.jpg" ,
            "https://wallpaperplay.com/walls/full/9/c/8/291.jpg" ,
            "https://wallpaperplay.com/board/mandalorian-hd-wallpapers"
    )

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = GridLayoutManager(this,2,LinearLayout.VERTICAL,false)
        recyclerView.adapter = RecyclerAdapter(data,this)
    }
}
