package fr.moya.moc.twoh_jdr_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import fr.moya.moc.twoh_jdr_app.models.Capacity
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_capacity_form.*

class CapacityFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capacity_form)
    }

    fun saveCapacity(view: View) {
        val capacity = Capacity(
            capacityNameInput.text.toString(),
            capacityRankInput.text.toInt(),
            capacityBonusInput.text.toString(),
            capacityHandicapInput.text.toString(),
            capacityTotalInput.text.toString())
        var capacities = Paper.book().read<MutableList<Capacity>>("capacities")
        if (capacities == null) {
            capacities = mutableListOf(capacity)
        } else {
            Log.e("CapacityFormActivity", capacities.toString())
            capacities.add(capacity)
        }
        Paper.book().write("capacities", capacities)
        finish()
    }
}
