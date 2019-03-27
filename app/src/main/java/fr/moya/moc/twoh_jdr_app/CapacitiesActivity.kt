package fr.moya.moc.twoh_jdr_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import fr.moya.moc.twoh_jdr_app.models.Capacity
import kotlinx.android.synthetic.main.activity_capacities.*
import kotlinx.android.synthetic.main.activity_main.*

class CapacitiesActivity : MainActivity(R.layout.activity_capacities) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nav_view.menu.getItem(3).isChecked = true
        addCapacityButton.setOnClickListener { view ->
            val intent = Intent(this, CapacityFormActivity::class.java)
            val callback = { data: Capacity -> Log.e("CapacitiesActivity", data.toString()) }
            startActivity(intent)
        }
    }
}
