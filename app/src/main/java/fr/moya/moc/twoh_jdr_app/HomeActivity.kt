package fr.moya.moc.twoh_jdr_app

import android.os.Bundle
import android.text.Editable
import android.view.View
import fr.moya.moc.twoh_jdr_app.models.BasicInfo
import io.paperdb.Paper
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class HomeActivity : MainActivity(R.layout.activity_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nav_view.menu.getItem(0).isChecked = true
        Paper.init(this)
        val basicInfo = Paper.book().read<BasicInfo>("basic_info")
        fillBasicInfo(basicInfo)
    }

    private fun fillBasicInfo(basicInfo: BasicInfo?) {
        characterNameInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.name)
        rpgClassInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.rpgClass)
        raceInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.race)
        lvlInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.lvl.toString())
        xpInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.xp.toString())
        hpInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.hp.toString())
        maxHpInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.hpMax.toString())
        destinyForceInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.forceDestinyPoints.toString())
        destinyWisdomInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.wisdomDestinyPoints.toString())
        destinyCourageInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.courageDestinyPoints.toString())
        forceStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.forceStat.toString())
        constitutionStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.constitutionStat.toString())
        wisdomStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.wisdomStat.toString())
        charismaStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.charismaStat.toString())
        intelligenceStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.intelligenceStat.toString())
        dexterityStatInput.text = Editable.Factory.getInstance().newEditable(basicInfo?.dexterityStat.toString())
    }

    fun saveData(view: View) {
        val basicInfo = BasicInfo(characterNameInput.text.toString(),
            rpgClassInput.text.toString(),
            raceInput.text.toString(),
            lvlInput.text.toInt(),
            xpInput.text.toInt(),
            hpInput.text.toInt(),
            maxHpInput.text.toInt(),
            destinyForceInput.text.toInt(),
            destinyWisdomInput.text.toInt(),
            destinyCourageInput.text.toInt(),
            forceStatInput.text.toInt(),
            constitutionStatInput.text.toInt(),
            wisdomStatInput.text.toInt(),
            charismaStatInput.text.toInt(),
            intelligenceStatInput.text.toInt(),
            dexterityStatInput.text.toInt())
        Paper.book().write("basic_info", basicInfo)
    }
}

fun Editable.toInt(): Int {
    return try {
        this.toString().toInt()
    } catch (e: NumberFormatException) {
        0
    }
}
