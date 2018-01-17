package com.kiran.codehack.scala

/**
  * Created by lf50 on 17/01/18.
  */
object ArrayLeftShift {

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var d = n - 1
    var i = 0
    var a = new Array[Int](n);
    var b = new Array[Int](n);
    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt();
    }

    for (a_j <- k to d) {
      b(i) = a(a_j)
      i = i+1
      if (a_j == d){
        for(a_k <- 0 to (d - i)){
          b(i) = a(a_k)
          i = i + 1
        }
      }
    }
    println(b.mkString(" "))
  }

}
