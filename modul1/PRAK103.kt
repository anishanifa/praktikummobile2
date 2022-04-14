import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    print("Input bilangan = ")
    var bil: Int = scan.nextInt()
    var jumlah = 1
    var kali = 0

    while (jumlah <= 5 ) {

        kali += bil

        if (kali % 2 == 0 || kali % 3 == 0) {
            print("$kali ")
            jumlah++
        }
    }
}