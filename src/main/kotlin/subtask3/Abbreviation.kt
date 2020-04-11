package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var result =""
        val aUpCase = a.toUpperCase()
        for ((indexA, _) in aUpCase.withIndex()){
            for ((indexB, valueB) in b.withIndex()){
                if (aUpCase[indexA] == b[indexB]){
                    result += valueB
                }
            }
        }
        return if (result == b){
            "YES"
        }else "NO"
    }
}
