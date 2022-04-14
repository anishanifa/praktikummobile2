import java.util.Scanner

val scan = Scanner(System.`in`)

fun fungsi(x: Int){
    val hasil = 2*(x*x)+((5*x)-8)
}
fun main(){
    print ("Nilai x = ")
    val x: Int = scan.nextInt()

    fungsi(x)
}
