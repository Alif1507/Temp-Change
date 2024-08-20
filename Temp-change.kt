fun main () {
    println("ketik 1 suhu reamur: ")
    println("ketik 2 suhu fahrenhite: ")
    println("ketik 3 suhu Celcius: ")
    println("ketik 4 suhu kelvin: ")


    var pilihan = readln()!!.toInt()

    when (pilihan) {

        1 ->{
            println("Masukan suhu reamur: ")
            var a = readln()!!.toDouble()
            println("Masukan suhu reamur:$a ")

            var b = (a - 32) * 4/9// Fahrenhite
            var c =  a * 5/4 //celcius
            var d =  a * 5/4 + 273.15 //kelvin

            println("Fahrenhite: $b")
            println("Celcius: $c")
            println("Kelvin: $d")

        }

        2 -> {
            println("Masukan suhu Fahrenhite: ")
            var a = readln()!!.toDouble()
            println("Masukan suhu Fahrenhite:$a ")

            var b = (a - 32) * 4/9//remur
            var c =  (a - 32) * 5/9//celsius
            var d =  (a + 459.67) * 5/9//kelvin

            println("reamur: $b")
            println("Celcius: $c")
            println("Kelvin: $d")
    }
        3 -> {
            println("Masukan suhu Celsius: ")
            var a = readln()!!.toDouble()
            println("Masukan suhu Celsius:$a ")

            var b = (a * 9/5) + 32//fahrenhite
            var c =  a * 4/5//remur
            var d =  a + 273.15//kelvin

            println("Fahrenhite: $b")
            println("reamur: $c")
            println("Kelvin: $d")

        }

        4 -> {
            println("Masukan suhu kelvin: ")
            var a = readln()!!.toDouble()
            println("Masukan suhu kelvin:$a ")

            var b = (a - 273.15) * 9/5 + 32//fahrenhite
            var c =  (a - 273.15) * 4/5//remur
            var d =  a - 273.15//celsius

            println("Fahrenhite: $b")
            println("remur: $c")
            println("celcius: $d")

        }


    }


}