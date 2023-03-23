package kotlin_20230323;

import kotlin_20230321.MyFunctionalInterface
import kotlin.math.E

class Car (var speed: Int, var isMoving:Boolean = false){   // 생성자 164p - 필드 (var가 없으면 필드를 만들지 않음)
    fun accelerate() {
        speed += 10
    }
    fun decelerate() {
        speed -= 10
        if (speed < 0) speed = 0
    }
    fun move() {
        isMoving = true
    }
}

open class Person (var name: String, var age: Int){ //  클래스 open
    open fun sayName(){ //  사용하고 싶다면 open을 붙여라 - 오버라이드 open
        println("My name is ${name}")
    }
    fun sleep(hour: Int) : Int {
        println("${hour}시간동안 ${name}(이)가 잠을 잡니다")
        return hour //  일부러 리턴함
    }
}

class Employee(name: String, age: Int, var company: String)  //  이미 부모한테 선언 그래서 잠깐쓰고 버려서 var가 없음 / 필드 x
    : Person(name, age) // 부모
{
    fun work(){
        println("일 합시다")
        super.sleep(0)
    }

    override fun sayName() {
        println("일꾼의 이름을 말합니다")
    }
}
fun main(args: Array<String>){
    var c = Car(10, true)   // new를 안쓴다
    c.accelerate()
    c.decelerate()
    c.move()

    var e = Employee("John", 20, "Samsung")
    e.work()
    e.sayName()

    //책 22쪽
    println("오늘은 3월 23일")
    println (e is Employee) //  true
    //println(e is Car)     //  false
    println(e is Person)    //  true
    println(e is Any)       //  true - is : 어떤 타입인지 확인

    //업 캐스팅
    var p : Person = e as Person //  에러 - Employee / 회색 굳이 필요없음

    //다운 캐스팅
    var ee : Employee = p as Employee   //  as : 자바의 ()느낌을 줌 ex)  = p (Employee);

    fun method (any: Any){  //  로컬함수 함수안에 함수
        var dd = any as? Car
    }
    method (p)
    //스마트 캐스팅
    var str : Any = "Hello"
    if (str is String){
        str.trim()  //    공백제외
    }

    var p1 = PointData(1,2);
    var p2 = PointData(1,2);

    // p1 == p2의 결과는?
    // == => equals - 내용을 비교, === => == -
    println(p1 == p2)
    println(p1 === p2)
    println(p1);

    var c1: Color =  Color.RED
    if(c1 == Color.RED){
        println("빨간색!")
    }

    //Quiz <+ 봉인 클래스
    /*
    주관식
    객관식 (n지선다)
    TRUE / FALSE
     */
}

//열거형 클래스
enum class Color{
    RED, GREEN, BLUE
}

// 확장 함수
fun String.removeAllSpace(): String{
    return this.replace("","")
}

// 순서별로 줄여짐
var myImpl1 = object : MyFunctionalInterface {
    override fun method(i: Int?): String {
        TODO("Not yet implemented")
    }
}

var myImpl2 = MyFunctionalInterface { i: Int ->
    println("say something")
    "Hello " + i
}

var myImpl3 = MyFunctionalInterface { i ->
    "Hello " + i
}

var myImpl4 = MyFunctionalInterface { "Hello " + it }

//데이터 클래스 
data class PointData (var x: Int, var y: Int)    //  person과 같이 정보를 가지는 - data를 붙임
class NoVarPoint (x: Int, y: Int)       //  var을 안써서 필드가 안생김 / 중괄호는 안써도됨
class PointNoData(var x: Int, var y: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PointNoData

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    override fun toString(): String {
        return "PointNoData(x=$x, y=$y)"
    }
}


