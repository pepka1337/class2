import kotlin.math.sqrt

data class Point(val x: Double, val y: Double) {
    fun distanceTo(other: Point): Double {
        val dx = x - other.x
        val dy = y - other.y
        return sqrt(dx * dx + dy * dy)
    }
}

fun main() {
    println("Введите координаты первой точки (x, y):")
    val x1 = readLine()?.toDouble() ?: 0.0
    val y1 = readLine()?.toDouble() ?: 0.0

    println("Введите координаты второй точки (x, y):")
    val x2 = readLine()?.toDouble() ?: 0.0
    val y2 = readLine()?.toDouble() ?: 0.0

    val point1 = Point(x1, y1)
    val point2 = Point(x2, y2)

    val distance = point1.distanceTo(point2)
    println("Расстояние между точками: $distance")
}