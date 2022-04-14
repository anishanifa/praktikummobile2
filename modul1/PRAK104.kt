class Job {
    var nama: String = ""
    var gaji: Double = 0.toDouble()

    fun Nilai(jobName: String, jobSalary: Double){
        nama = jobName
        gaji = jobSalary
        println("Nama pekerjaan : $nama")
        println("Gaji yang diberikan : $gaji")
    }
}

fun main (){
    var objA = Job()
    objA.Nilai("Auditor", 6000000.00)
    var objB = Job()
    objB.Nilai("Guru", 4500000.00)
}