package fr.moya.moc.twoh_jdr_app

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import fr.moya.moc.twoh_jdr_app.models.Capacity
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_capacities.*
import kotlinx.android.synthetic.main.activity_main.*

class CapacitiesActivity : MainActivity(R.layout.activity_capacities) {

    private var capacities: MutableList<Capacity>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nav_view.menu.getItem(3).isChecked = true

        addCapacityButton.setOnClickListener { view ->
            val intent = Intent(this, CapacityFormActivity::class.java)
            startActivity(intent)
        }

        this.capacities = Paper.book().read<MutableList<Capacity>>("capacities")
        if (this.capacities != null) {
            capacitiesRecyclerView.adapter = CapacitiesAdapter(this.capacities!!, this)
        }
        capacitiesRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        Log.e("CapacitiesActivity", "onResume")
        this.capacities = Paper.book().read<MutableList<Capacity>>("capacities")
        // capacitiesRecyclerView.adapter?.da
        capacitiesRecyclerView.adapter?.notifyDataSetChanged()
    }
}
