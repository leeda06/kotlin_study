package Kotlin_20230328

import java.io.File
import java.lang.Exception

class Day28_Study2 {

}

fun main(args: Array<String>){
    //var toInt = "Hello".toInt()
    var count = 0
    while(true) {
        try {
            println("(잘못한 횟수 ${count}) 숫자입력 : ")
            var input = readLine()
            var toNum = input?.toInt()
            println(toNum)
            break
        } catch (e: Exception) {
            println("오류가 났습니다");
            count ++
        }
    }

    print("숫자 입력 : ")
    var input = readLine()
    var toNum = input?.toInt()
    println(toNum)

    // var inputStream = File("nonono.txt").inputStream()

    val a = Animal("Sam", 5)
    // 게터를 호출
    println(a.age)
    println(a.name)
    // 세터를 호출
    a.age = 10
    a.name = "Jack"
    println(a.age)
    println(a.name)
   // a.helloWorld

//    var inputStream = File("nonono.txt").inputStream()
}

