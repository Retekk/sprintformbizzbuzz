fun main() {

    (1..100).forEach { number ->
        when {
            number % 15 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println("$number")
        }
    }

}