object Euler2 {

  def main(args: Array[String]): Unit = {

    def getEuler(prev:Int,current:Int,lim:Int) : List[Int] ={
        val tmp = prev + current
        if(tmp > lim) Nil else tmp :: getEuler(current,tmp,lim)
    }

    def firstEuler(lim:Int) : List[Int] = {
        1::2::getEuler(1,2,lim)
    }

    println(firstEuler(4000000).filter(_ % 2 == 0).sum)

  }
}