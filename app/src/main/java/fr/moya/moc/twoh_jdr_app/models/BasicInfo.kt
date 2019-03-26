package fr.moya.moc.twoh_jdr_app.models

data class BasicInfo(
                val name: String = "",
                val rpgClass: String = "",
                val race: String = "",
                val lvl: Int = 1,
                val xp: Int = 0,
                val hp: Int?,
                val hpMax: Int?,
                val forceDestinyPoints: Int = 0,
                val wisdomDestinyPoints: Int = 0,
                val courageDestinyPoints: Int = 0,
                val forceStat: Int = 0,
                val constitutionStat: Int = 0,
                val wisdomStat: Int = 0,
                val charismaStat: Int = 0,
                val intelligenceStat: Int = 0,
                val dexterityStat: Int = 0) {
    companion object {
        val TABLE_NAME = "basic_info"
        val COL_NAME = "name"
        val COL_CLASS = "rpgClass"
        val COL_RACE = "race"
        val COL_LVL = "level"
        val COL_XP = "xp"
        val COL_HP = "hp"
        val COL_MAX_HP = "max_hp"
        val COL_DEST_FORCE = "dest_force"
        val COL_DEST_WISDOM = "dest_wisdom"
        val COL_DEST_COURAGE = "dest_courage"
        val COL_STAT_FORCE = "stat_force"
        val COL_STAT_CONST = "stat_constitution"
        val COL_STAT_WISDOM = "stat_wisdom"
        val COL_STAT_CHARISMA = "stat_charisma"
        val COL_STAT_INTELL = "stat_intelligence"
        val COL_STAT_DEXT = "stat_dexterity"
    }
}