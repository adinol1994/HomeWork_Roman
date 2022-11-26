fun main(args: Array<String>) {

    println("это программа считает обьем параллелепипеда")

    println("длина параллелепипеда")
    val length = readln()


    println("ширина параллелепипеда")
    val width = readln()

    println("высота параллелепипеда")
    val height =readln()


    println("volume of the parallelepiped")
    var result = length.toInt() * width.toInt() * height.toInt()
    print("Обьем параллелепипеда равен $result куб.метров")


}