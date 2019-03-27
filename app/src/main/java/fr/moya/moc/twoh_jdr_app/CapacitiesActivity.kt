package fr.moya.moc.twoh_jdr_app

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class CapacitiesActivity : MainActivity(R.layout.activity_capacities) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nav_view.menu.getItem(3).isChecked = true
    }
}
