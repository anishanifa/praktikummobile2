fun main() {
    print("Waktu Sekarang: ")
    val waktu = readLine()!!
    print("Nama Anda: ")
    val nama = readLine()!!
    print("Umur Anda: ")
    val umur = readLine()!!
    val suhu = (35..37).random()
    println("Suhu Tubuh Anda: $suhu")


    println("Selamat $waktu, $nama. Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius")
}