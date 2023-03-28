package Kotlin_20230328
// 내부 클래스, 내부 인터페이스
class Outer(var x: Int){
    fun outerMethod(){}

    class Inner(var y: Int){
        fun innerMethod(){
            println("${y}")
        }
    }
    interface MyInterface{
        fun abstractMethod()
    }
}
interface Hello{
    interface World{

    }
}

// 내부 클래스인데 바깥이랑 연관이 있는 내부 클래스
class Outer2(var x: Int){
    fun outerMethod(){}
    inner class Inner2(var y: Int) {
        fun innerMethod() {
            println(x)
            println(y)
            outerMethod()
        }
    }
}

// companion object를 이용한 클래스 변수, 상수, 메서드 정의
class MyClass(var x: Int){
    fun myMethod(){}

    companion object{
        var classVar = 100
        val CONSTANT = 200
        fun classMethod(){}
    }

}

// 생성자가 없는, class 키워드를 쓰지 않고 object 키워드를 써서 클래스 정의
object SingletonClass{
    // 생성자를 아예 못 쓰니까 자바 처럼 중괄호 안에다가 필드를 만듦
    var x = 100
    fun increaseX(){
        x++
    }
    fun printX(){
        println(x)
    }



}

fun main(args: Array<String>){
    var inner = Outer.Inner(100)

    var outer2 = Outer2(100)
    var inner21 = outer2.Inner2(200)
    var inner22 = outer2.Inner2(300)

    println(MyClass.classVar)
    println(MyClass.CONSTANT)
    MyClass.classMethod()

    println(SingletonClass.x)
    SingletonClass.increaseX()
    SingletonClass.printX()

}
