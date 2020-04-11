package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val calendar: LocalDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            Locale.setDefault(Locale("ru"))
            val dayOfWeek = calendar.dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault())
            val monthOfYear = calendar.month.getDisplayName(TextStyle.FULL, Locale.getDefault())
            "$day $monthOfYear, $dayOfWeek"
        } catch (e: DateTimeException) {
            "Такого дня не существует"
        }
    }
}
