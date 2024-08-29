val a = listOf(1, 2, 3, 4, 5, 6, 7)

fun main() {
    binarySearch(a, 6)
    resultTest(
        list = a,
        testValue = 5
    )
}

fun resultTest(list: List<Int>, item: Int = 6, testValue: Int = 6) {
    if (binarySearch(list, item) == testValue) println("passed")
    else println("false")
}

fun binarySearch(list: List<Int>, item: Int): Int? {
    var low = 0
    //возвращаем индекс последнего элемента
    var high = list.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        val guess = list[mid]

        if (guess == item) {
            return mid
        }
        if (guess > item) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return null
}
