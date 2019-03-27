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
}