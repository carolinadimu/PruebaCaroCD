fun main (parametro: Array<String>) {
    var suma = 0.0
    do {
        print("Ingrese cuenta:")
        val cuenta = readLine()!!.toInt()
        if (cuenta >= 0) {
            print(" saldo:")
            val saldo = readLine()!!.toDouble()
            if (saldo > 0) {
                println("Saldo Acreedor.")
                suma += saldo
            } else
                if (saldo < 0)
                    println("Saldo Deudor.")
                else
                    println("Nulo.")
        }
    } while(cuenta>=0)
    println("Total de saldos: $suma")
}


    fun (parametro: Array<String>) {
    var valor1 = 0
    var valor2 = 0
    var valor3 = 0
    var valor4 = 0
    print("Cantidad de puntos a ingresar:")
    val cantidad = readLine()!!.toInt()
    for(i in 1..cantidad) {
        print("Ingrese coordenada x:")
        val x = readLine()!!.toInt()
        print("Ingrese coordenada y:")
        val y = readLine()!!.toInt()
        if (x > 0 && y > 0)
            valor1++
        else
            if (x < 0 && y > 0)
                valor2++;
            else
                if (x < 0 && y < 0)
                    valor3++
                else
                    if (x > 0 && y < 0)
                        valor4++
    }
    println("Cantidad de puntos en el primer cuadrante: $valor1")
    println("Cantidad de puntos en el segundo cuadrante:$valor2")
    println("Cantidad de puntos en el tercer cuadrante: $valor3")
    println("Cantidad de puntos en el cuarto cuadrante: $valor4")
}


    fun (parametro: Array<String>) {
    var negativo = 0
    var positivo = 0
    var mult15 = 0
    var sumapares = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if (valor < 0)
            negativo++
        else
            if (valor > 0)
                positivo++
        if ( valor % 15 == 0)
            mult15++
        if (valor % 2 == 0)
            sumapares+=valor
    }
    println("Cantidad de valores negativos: $negativo")
    println("Cantidad de valores positivos: $positivo")
    println("Cantidad de valores múltiplos de 15: $mult15")
    println("Suma de los valores pares: $sumapares")
}


    fun (argumento: Array<String>) {
    var valor1 = 0
    var valor2= 0
    var valor3 = 0
    print("Ingrese la cantidad de triángulos:")
    val n = readLine()!!.toInt()
    for(i in 1..n) {
        print("Ingrese lado 1:")
        val lado1 = readLine()!!.toInt()
        print("Ingrese lado 2:")
        val lado2 = readLine()!!.toInt()
        print("Ingrese lado 3:")
        val lado3 = readLine()!!.toInt()
        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("Equilatero.")
                valor1++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("Isósceles.")
                valor2++
            }
            else -> {
                println("Escaleno.")
                valor3++
            }
        }
    }
    println("Cantidad Equilateros:$valor1")
    println("Cantidad Isósceles: $valor2")
    println("Cantidad Escalenos: $valor3")



        fun calculaCuadrado() {
            print("Ingrese numero entero:")
            val valor = readLine()!!.toInt()
            val cuadrado = valor * valor
            println("El cuadrado es $cuadrado") }

        fun calcularProducto() {
            print("Ingrese primer valor:")
            val valor1 = readLine()!!.toInt()
            print("Ingrese segundo valor:")
            val valor2 = readLine()!!.toInt()
            val producto = valor1 * valor2
            println("El producto de los valores es: $producto")
        }


        fun menorValor() {
            print("Ingrese primer valor:")
            val valor1 = readLine()!!.toInt()
            print("Ingrese segundo valor:")
            val valor2 = readLine()!!.toInt()
            print("Ingrese tercer valor:")
            val valor3 = readLine()!!.toInt()
            print("Menor de los tres:")
            when {
                valor1 < valor2 && valor1 < valor3 -> println(valor1)
                valor2 < valor3 -> println(valor2)
                else -> println(valor3)     }
        }



}

