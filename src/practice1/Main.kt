package practice1

import java.io.BufferedReader
import java.io.File

fun solve(file: File){
    val br = file.bufferedReader()
    println("${br.readLine().toInt() + br.readLine().split(" ").map{it.toInt()}.sum()} ${br.readLine()}")
}

enum class TESTFILE(val path: String){
    TEST1("src/practice1/TestCase1.txt"),
    TEST2("src/practice1/TestCase2.txt");
}

fun main(args: Array<String>){
    solve(File(TESTFILE.TEST1.path))
    solve(File(TESTFILE.TEST2.path))
}