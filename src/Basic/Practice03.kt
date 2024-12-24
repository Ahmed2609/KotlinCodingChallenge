package Basic

/** Practice 03
 *  Calcula el área de un triángulo
 * */

fun main() {
    print("Enter the base: ")
    val base = readln().toDoubleOrNull() ?: 0.0

    print("Enter the height: ")
    val height = readln().toDoubleOrNull() ?: 0.0

    val area = (base * height) / 2

    println("\nThe area of the triangle is: $area")
}