package subtask4

import java.lang.StringBuilder
import java.util.regex.Matcher
import java.util.regex.Pattern

class Pangram {

    fun isPanagramma(input: List<String>): List<String> {
        val outList: MutableList<String> = mutableListOf()
        val inputList: MutableList<StringBuilder> = mutableListOf()
        input.forEach { inputList.add(StringBuilder(it)) }
        var count = 0
        val pattern = Pattern.compile("(?iu)[aeiouy]")
        while (inputList.size != outList.size) {
            for (it in inputList) {
                val matcher: Matcher = pattern.matcher(it)
                var presentValue = 0
                while (matcher.find()) {
                    presentValue++
                    it[matcher.start()] = it[matcher.start()].toUpperCase()
                }
                if (count == presentValue) {
                    outList.add("$presentValue$it")
                }
            }
            count++
        }
        return outList
    }

    fun isNotPanagramma(input: List<String>): List<String> {
        val outList: MutableList<String> = mutableListOf()
        val inputList: MutableList<StringBuilder> = mutableListOf()
        input.forEach { inputList.add(StringBuilder(it)) }
        var count = 0
        val pattern = Pattern.compile("(?iu)[bcdfghjklmnpqrstvwxz]")
        while (inputList.size != outList.size) {
            for (it in inputList) {
                val matcher: Matcher = pattern.matcher(it)
                var presentValue = 0
                while (matcher.find()) {
                    presentValue++
                    it[matcher.start()] = it[matcher.start()].toUpperCase()
                }
                if (count == presentValue) {
                    outList.add("$presentValue$it")
                }
            }
            count++
        }
        return outList
    }

    fun getResult(inputString: String): String {
        val list = inputString.split(" ").filter { it.isNotEmpty() && it[0] !='\n' }
        var set = sortedSetOf<Char>()
        inputString.forEach { if (it.toLowerCase() in 'a'..'z') set.add(it.toLowerCase()) }
        return if (set.size == 26){
            isPanagramma(list).joinToString (" ")
        }else isNotPanagramma(list).joinToString (" ")
    }
}
