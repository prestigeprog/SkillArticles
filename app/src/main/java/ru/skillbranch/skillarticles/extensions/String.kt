package ru.skillbranch.skillarticles.extensions

fun String?.indexesOf(
    substr: String,
    ignoreCase: Boolean = true
): List<Int> {
    val list: MutableList<Int> = mutableListOf()
    if (this == null || substr.isBlank()) return list

    var i = -1
    while(true) {
        i = indexOf(substr, i + 1, ignoreCase)
        when (i) {
            -1 -> return list
            else -> list.add(i)
        }
    }
}

