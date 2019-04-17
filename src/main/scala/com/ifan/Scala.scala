package com.ifan

object Scala {
  def main(args: Array[String]): Unit = {
    println("Hello,World")

    val x = 10
    val y = 20

    println(x+x)

    lazy val z = x * y

    println(z)

    var cc = 30
    cc = 40

    println(cc)

    val s = "chen"
    val name = s"my name is $s"

    println(name)

    println(    add(1,2))


    val l = List("Bob","Alice","Teddy")

    for (
      s <-l
    )println(s)


    val result = for (
      s <- l
    )yield s

    println(result)

    val result_try = try {
      Integer.parseInt("dog")
    }catch {
      case _ => 0
    }finally {
      println("always be printed")
    }

    println(result_try)

    val code = 1
    val result_match = code match {
      case 1 => "one"
      case 2 => "two"
      case _ => "others"
    }

    println(result_match)

    val e = 100
    equal(e)

    display(l)

    var count = 0


    while (count <= 10){
      println(count)
      count += 1
    }

    println(greeting(add(1,2)))//高阶函数 参数为函数

    apply(anonymous,10)
    apply(x => x + 10,10)



    var c = addOne(1)_//柯里化

    println(c(200))


    println(factorial(5,1))



    //连接基本数据类型和List
    var list = List(1,2,3,4,5)

    println(0::list)
    println(list.head)
    println(list.tail)
    println(list.isEmpty)


    //遍历List
    println(walkThrough(list))

    //filter
    println("===========Filter==========")
    println(list.filter(x => x % 2 == 1))
    println(list.filter(_ % 2 == 1))

    //map
    val mapList = List("a", "b", "c")
    println("===========Map==========")
    println(mapList.map(x => x.toUpperCase))
    //_通配任意元素 _.toUpperCase 等价于 x => x.toUpperCase
    println(mapList.map(_.toUpperCase))

    //flatmap 先映射（map），再扁平化处理（flatten ）
    val q = List(List(1,2,3),List(4,5,6))
    println("===========flatMap==========")
    println(q.flatMap(_.filter(_ % 2 == 0)))

    //reduce
    println("===========reduce==========")
    println(list.reduce(_ + _))


    //range
    println("===========range==========")
    println(1 to 10)

    //stream 惰性求值
    println("===========stream==========")
    println((1 to 100).toStream)

    //tuple 元组
    println("===========tuple==========")
    val t = (1,"Alice","Math",95.5)
    println(t._1)
    println(t._2)
    println(t._3)
    println(t._4)

    //Map
    println("===========Map==========")
    var m = Map(1 -> "David", 9 -> "Elwood")
    println(m(1))
    m += (10 -> "Teddy")
    m - 1

    //Hash
    println("===========Hash==========")
    var nums:Map[Int,Int] = Map()
    nums += (100 -> 100)
    println(nums)
    println(nums.get(100).get)

    //Array
    println("===========Array==========")
    val arr = new Array[Int](2)
    val aaa = Array(10,20)
    for( a <- 0 until aaa.length)
    {
        println(a)
    }

    for( a <- arr)
    {
      println(a)

    }






  }

  def add(x:Int,y:Int):Int={
    val z = x + y
    z * z
  }

  def equal(x:Int):Unit = {
    if (x == 10) {
      println("==10")
    } else if (x == 20){
      println("==20")
    } else {
      println("Other")
    }
  }

  def display(x:List[String]):Unit = {
    for(s <- x){
      println(s)
    }

  }

  def greeting(x:Int):Int = {
    x + 20

  }

  //匿名函数
  var anonymous = (x:Int) => {x + 10}

  //高阶函数传入匿名函数
  def apply(b:Int => Int,x:Int): Unit ={
    println(b(x))
  }

  def addOne(x:Int)(y:Int) = x + y

  //尾递归 annotation.tailrec
  def factorial(n: Int, m: Int):Int = {
    if(n <= 0){
      return m
    } else {
      factorial(n-1, m * n)
    }
  }

  //遍历List
  def walkThrough(x:List[Int]):String = {
    if(x.isEmpty){
      return ""
    } else {
      return x.head + " " + walkThrough(x.tail)
    }
  }









}
