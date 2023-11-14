package by.marcel.tugas_rcv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rcv_marcel:RecyclerView
    private var list : ArrayList<Osmarcel> =  arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcv_marcel = findViewById(R.id.gamabr)
        rcv_marcel.setHasFixedSize(true)

        list.addAll(Dataimage.listData)
        showRecyler()
    }

    private fun showRecyler() {
        rcv_marcel.layoutManager = LinearLayoutManager(this)
        val MarcelAdapter = MarcelAdapter(list)
        rcv_marcel.adapter =MarcelAdapter
    }
}