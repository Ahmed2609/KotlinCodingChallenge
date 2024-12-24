package Basic

/** Practice 04
 *  Convierte grados Celsius a Fahrenheit.
 *      (0 °C × 9 / 5) + 32 = 32°F
 * */

fun main() {
    print("Enter degrees Celsius: ")
    val celsius = readln().toDoubleOrNull() ?: 0.0

    val fahrenheit = (celsius * 9/5) + 32

    println("$celsius°C is equivalent to $fahrenheit°F")
}