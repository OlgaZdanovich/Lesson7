package lesson7


fun main() {
    ageDescription()
    minDivisor(15)
    println(brickPasses(2, 3, 4, 4, 1))

}

fun ageDescription() {
    println("Введите возраст:")
    var age: Int = Integer.valueOf(readLine())
    var hisAge: Int = age % 10
    if (age % 100 in 10..20) {
        println("$age лет")
    } else {
        when (hisAge) {
            1 -> {
                println("$age год")
            }

            in 2..4 -> {
                println("$age года")
            }

            else -> {
                println("$age лет")
            }
        }
    }
}
fun minDivisor(n: Int){
    var i: Int = 2
    while( n%i != 0){
        i++;
    }
    println("Наименьший делитель числа $n : $i")
}
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    var result: Boolean = false
    if (((a<=r) and (b<=s)) or ((b<=s) and (c<=r)) or ((c<=s) and (b<=r)) or ((a<=s) and (b<=r))
    or ((a<=r) and (c<=s)) or ((a<=s) and (c<= r)))
    {
        result = true

    }
    return result
}

