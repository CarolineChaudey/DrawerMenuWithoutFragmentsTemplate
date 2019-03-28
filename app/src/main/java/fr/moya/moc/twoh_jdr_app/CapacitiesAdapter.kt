package fr.moya.moc.twoh_jdr_app

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fr.moya.moc.twoh_jdr_app.models.Capacity
import kotlinx.android.synthetic.main.capacity_item.view.*

class CapacitiesAdapter(private val capacities : MutableList<Capacity>, private val ctx: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val li = LayoutInflater.from(ctx).inflate(R.layout.capacity_item, p0, false)
        return ViewHolder(li)
    }

    override fun getItemCount(): Int {
        return capacities.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val capacity = capacities[p1]
        p0.capacityItemName.text = capacity.name
        p0.capacityItemRank.text = capacity.rank.toString()
        p0.capacityItemBonus.text = capacity.bonus
        p0.capacityItemHandicap.text = capacity.handicap
        p0.capacityItemTotal.text = capacity.total
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val capacityItemName : TextView = view.capacityItemName
    val capacityItemRank : TextView = view.capacityItemRank
    val capacityItemBonus : TextView = view.capacityItemBonus
    val capacityItemHandicap : TextView = view.capacityItemHandicap
    val capacityItemTotal : TextView = view.capacityItemTotal
}