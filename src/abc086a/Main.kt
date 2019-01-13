package abc086a

import java.io.File

fun solve(fl: File){
    val br = fl.bufferedReader()
    println(br.readLine()!!.split(" ").let{
        if(it[0].toInt() * it[1].toInt() % 2 == 0) "Even" else "Odd"
    })
}

enum class TESTFILE(val path: String){
    TEST1("src/abc086a/TestCase1.txt"),
    TEST2("src/abc086a/TestCase2.txt");
}

fun main(args:Array<String>){
    enumValues<TESTFILE>().map{solve(File(it.path))}
}