fun main(args: Array<String>) {
    var a = 100
    var b = "hello"
    var c : Int = 200
    var d = 30
    //d = 31    <===    상수이기에 불가능
    var f = 2.3746F
    var g = f.toDouble()    //이런식으로 형변환
    var h = """
        스페이스, tab, enter 
        문자 전부 사용 가능
        """

    var num1 = 100
    var num2 = 200
    var str = "num1 : ${num1}, num2 : ${num2 * 2}"
    println(str)
    
    var anyValue : Any = 100    // Any 모든 타입을 가짐
    anyValue = "Hello"

    var n1 = 100 // Int 타입에 저장 할수 있는 것은 오직 "정수"만
    var n2 : Int? = 100
    n2 = null
    var sss : String? = "Hello"
    sss = null

    var s1 = "Hello"
    println(s1.length)
    println(s1.startsWith( "He"))

    var s2 : String? = "Hello"
    println(s2?.length)
    println(s2?.startsWith( "He"))

    var s3 : String? = null
    println(s3?.length)
    println(s3?.substring(0, 1) ?. lowercase())
    var i : Int? = 100
    var ii : Int = 101

    var s4 : String? = null
    if(s4 != null) {
        println(s4?.length)
    }

    var one = null ?: 1
    var cc: String? = null
    var len = cc?.length ?: 0

    var s5 = "Hello"
    //var i4 = s5.length()

    fun add(a:Int, b:Int) = a + b   //  표현식이라 생각 (하나의 값)
    fun getBigger(a:Int, b:Int) = if(a > b) a else b




}