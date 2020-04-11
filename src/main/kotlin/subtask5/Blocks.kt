package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if (blockA.isNotEmpty()&&blockB != Nothing::class) {
            when (blockB) {
                Int::class -> {
                    var blockC = 0
                    var count = 0
                    while (count < blockA.size) {
                        if (blockA[count] is Int) {
                            blockC += blockA[count] as Int
                        }
                        count++
                    }
                    return blockC
                }
                String::class -> {
                    var blockC = ""
                    var count = 0
                    while (count < blockA.size) {
                        if (blockA[count] is String) {
                            blockC += blockA[count] as String
                        }
                        count++
                    }
                    return blockC
                }
                LocalDate::class -> {
                    var blockC = LocalDate.of(1, 1, 1)
                    var listData: LocalDate
                    var count = 0
                    while (count < blockA.size) {
                        if (blockA[count] is LocalDate) {
                            listData = blockA[count] as LocalDate
                            if (blockC.toEpochDay() < listData.toEpochDay()) {
                                blockC = blockA[count] as LocalDate
                            }
                        }
                        count++
                    }
                    return blockC.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                }
                else -> return "missing class type"
            }
        } else return "empty array or missing type of class being removed"
    }
}

