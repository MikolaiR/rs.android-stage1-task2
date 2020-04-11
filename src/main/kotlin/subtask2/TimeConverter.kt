package subtask2

class TimeConverter {

    fun convertNumToWord(number: Int): String {
        var result = ""
        if (number != 0) {
            result = when (number) {
                1 -> "one"
                2 -> "two"
                3 -> "three"
                4 -> "four"
                5 -> "five"
                6 -> "six"
                7 -> "seven"
                8 -> "eight"
                9 -> "nine"
                10 -> "ten"
                11 -> "eleven"
                12 -> "twelve"
                13 -> "thirteen"
                14 -> "fourteen"
                15 -> "fifteen"
                16 -> "sixteen"
                17 -> "seventeen"
                18 -> "eighteen"
                19 -> "nineteen"
                20 -> "twenty"
                21 -> "twenty one"
                22 -> "twenty two"
                23 -> "twenty three"
                24 -> "twenty four"
                25 -> "twenty five"
                26 -> "twenty six"
                27 -> "twenty seven"
                28 -> "twenty eight"
                29 -> "twenty nine"
                else -> ""
            }
        }
        return result
    }


    fun toTextFormat(hour: String, minute: String): String {
        val minuteInt = minute.toInt()
        val hourInt = hour.toInt()
        val result: String
        if (minuteInt < 31) {
            result = when (minuteInt) {
                0 -> "${convertNumToWord(hourInt)} o' clock"
                in 1..14 -> "${convertNumToWord(minuteInt)} minutes past ${convertNumToWord(hourInt)}"
                15 -> "quarter past ${convertNumToWord(hourInt)}"
                in 16..29 -> "${convertNumToWord(minuteInt)} minutes past ${convertNumToWord(hourInt)}"
                30 -> "half past ${convertNumToWord(hourInt)}"
                else -> ""
            }
        } else {
            val minuteToHour = 60 - minuteInt
            result = when (minuteInt) {
                in 31..44 -> "${convertNumToWord(minuteToHour)} minutes to ${convertNumToWord(hourInt + 1)}"
                45 -> "quarter to ${convertNumToWord(hourInt + 1)}"
                in 46..59 -> "${convertNumToWord(minuteToHour)} minutes to ${convertNumToWord(hourInt + 1)}"
                else -> ""
            }
        }
        return result
    }
}
