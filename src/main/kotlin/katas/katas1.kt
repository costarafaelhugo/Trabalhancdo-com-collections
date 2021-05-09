/*Katas 01
Retornar os quadrados perfeitos contando de trás para frente a partir de 100. (100, 81, 64, …, 4, 1)*/


fun main() {
    return1to20()
    returnEven()
    perfectSquare()
    backNumbers()
    backEvenNumbers()
    backOddNumbers()
    backStepFive()
    backPerfectSquare()
}


//Retornar os números de 1 a 20. (1, 2, 3,…, 19, 20)
fun return1to20() {
    println("Retornar os números de 1 a 20. (1, 2, 3,…, 19, 20)")
    for (i in 1..20) {
        print("$i, ")
    }
    println("")
}

//Retornar os números pares de 1 a 20. (2, 4, 6,…, 18, 20)
fun returnEven() {
    println("Retornar os números pares de 1 a 20. (2, 4, 6,…, 18, 20)")
    for (i in 1..20)
        if (i % 2 == 0) {
            print("$i, ")
        }
    println("")
}

//Retornar todos os números até 100 que forem quadrados perfeitos. (1, 4, 9, …, 81, 100)
fun perfectSquare() {
    println("Retornar todos os números até 100 que forem quadrados perfeitos. (1, 4, 9, …, 81, 100)")
    for (i in 1..10) {
        print(" ${i * i}, ")
    }
    println("")
}

//Retornar os números contando de trás para frente de 20 até 1. (20, 19, 18, …, 2, 1)
fun backNumbers() {
    println("Retornar os números contando de trás para frente de 20 até 1. (20, 19, 18, …, 2, 1)")
    for (i in 20 downTo 1) {
        print("$i, ")
    }
    println("")
}

//Retornar os números pares de 20 até 1. (20, 18, 16, …, 4, 2)
fun backEvenNumbers() {

    println("Retornar os números pares de 20 até 1. (20, 18, 16, …, 4, 2)")
    for (i in 20 downTo 1) {
        if (i % 2 == 0) {
            print("$i, ")
        }
    }
}

//Retornar os números ímpares de 20 até 1. (19, 17, 15, …, 3, 1)

fun backOddNumbers() {
    println("")
    println("Retornar os números ímpares de 20 até 1. (19, 17, 15, …, 3, 1)")
    for (i in 20 downTo 1) {
        if (i % 2 != 0) {
            print("$i, ")
        }
    }
}

//Retornar os múltiplos de 5 contando de trás para frente a partir de 100. (100, 95, 90, …, 10, 5)
fun backStepFive() {
    println("")
    println("Retornar os múltiplos de 5 contando de trás para frente a partir de 100. (100, 95, 90, …, 10, 5)")
    for (i in 100 downTo 1 step 5) {
        print("$i, ")
    }
}

//Retornar os quadrados perfeitos contando de trás para frente a partir de 100. (100, 81, 64, …, 4, 1)*/
fun backPerfectSquare() {
    println("")
    println("Retornar os quadrados perfeitos contando de trás para frente a partir de 100. (100, 81, 64, …, 4, 1)")
    for (i in 10 downTo 1) {
        print("${i*i}, ")
    }
}