package Basic

/**
 * 2. Calcula la suma de dos números.
 *
 * */

fun main() {
    print("Enter the first number: ")
    val number1 = readln().toDoubleOrNull() ?: 0.0

    print("Enter the second number: ")
    val number2 = readln().toDoubleOrNull() ?: 0.0

    val sum = number1 + number2

    println("sum: $number1 + $number2 = $sum")
}