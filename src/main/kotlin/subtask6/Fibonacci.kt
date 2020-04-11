package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        val fibonacci = mutableListOf(0, 1)
        var count = 1
        var prod = 0
        while (fibonacci[count - 1] * fibonacci[count] < n) {
            fibonacci.add(fibonacci[count - 1] + fibonacci[count])
            ++count
        }
        if (fibonacci[count - 1] * fibonacci[count] == n) {
            prod = 1
        }
        return intArrayOf(fibonacci[count - 1], fibonacci[count], prod)
    }
}
