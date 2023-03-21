package kotlin_20230321;

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

open class Person (var name: String, var age: Int){
    open fun sayName(){ //  사용하고 싶다면 open을 붙여라
        println("My name is ${name}")
    }
    fun sleep(hour: Int) : Int {
        println("${hour}시간동안 ${name}(이)가 잠을 잡니다")
        return hour //  일부러 리턴함
    }
}

class Employee(name: String, age: Int, var company: String)  //  이미 부모한테 선언 그래서 잠깐쓰고 버려서 var가 없음
    : Person(name, age)
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
}