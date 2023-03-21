package kotlin_20230321
import javax.swing.JButton

fun printHello() {
    println("Hello")
}

fun add(a: Int, b: Int) : Int {
    return a + b
}

fun add2(a: Int, b: Int = 20) = a + b
fun add3(a: Int, b: String) = a.toString() + b
fun getBigger(a: Int, b: Int) = if(a > b) a else b
//fun getBigger(a: Int, b: Int): Int {
//    if(a > b) {
//        return a
//    } else {
//        return b
//    }
//}

fun interface MyInterface {
    fun method(i: Int): String
}


fun main(args: Array<String>) {
    printHello()
    add2(10)

    // var interfaceImpl = MyInterface { it.toString() }

    var myImpl = object : MyFunctionalInterface {
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

    /*
    JButton b = new JButton("push me");
    b.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //your actions
        }
    });
    */

    var btn : JButton = JButton("Click")
    btn.addActionListener {

    }

    var myImpl5 = MyAnotherInterface { i1, i2 ->  "Hello " }

    var myImpl6 = MyAnotherInterface2 { "Hello" }

    var myImpl7 = object : MyNonFunctionalInterface {
        override fun method1(i: Int?): String {
            return "a"
        }
        override fun method2(i: Int?): String {
            return "a"
        }
    }

//    var myImpl = MyFunctionalInterface {
//        it.toString()
//    }


}
