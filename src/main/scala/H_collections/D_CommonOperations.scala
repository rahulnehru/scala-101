package H_collections

object D_CommonOperations {

  def main(args: Array[String]): Unit = {

    val listOfNumbers: List[Int] = List(1, 45, 3, 499, 453)

    // max of a list - easy to do with ints, otherwise you need to create your own comparison algorithm
    println(listOfNumbers.max)
    // min of a list - easy to do with ints, otherwise you need to create your own comparison algorithm
    println(listOfNumbers.min)

    // sort
    println(listOfNumbers.sorted)

    // first value of list
    println(listOfNumbers.head)
    // get the tail (all but first)
    println(listOfNumbers.tail)
    // last value of list
    println(listOfNumbers.last)

    // filter some values
    println(listOfNumbers.filter(_ > 30))
    println(listOfNumbers.filterNot(_ > 30))

    // map all the values
    println(listOfNumbers.map(_ + 1))

    // take the first x items
    println(listOfNumbers.take(3))

    // does any item exist matching a criteria?
    println(listOfNumbers.exists(_ < 0))
    // do all items in list match condition?
    println(listOfNumbers.forall(_ > 30))

    // fold is a curried function which takes a seed value and an operator, if the coll is empty, returns the seed
    println(Nil.fold(0) (_ + _))
    val simpleList = List(1, 2, 3, 4, 5)
    println(simpleList.fold(0)((accumulator, nextValue) => 2 * (accumulator + nextValue)))

    // fold left is the default case of fold
    val listOfChars = List("a", "b", "c")
    val abc1 = listOfChars.foldLeft("")((accumulator, nextValue) => {print(s"now $accumulator; "); accumulator ++ nextValue})
    println(abc1)

    // fold right goes the other way
    val abc2 = listOfChars.foldRight("")((accumulator, nextValue) => {print(s"now $accumulator; "); accumulator ++ nextValue})
    println(abc2)

    // reduce is a special case of fold where there is no "seed" value, but the first element of the list is treated as the seed
    // no accumulator
    println(simpleList.reduce((thisValue, nextValue) => (thisValue + 1) + nextValue))

    // reduceLeft is the default case of reduce
    val abc3 = listOfChars.reduceLeft((thisValue, nextValue) => {print(s"evaluating $thisValue and $nextValue; "); thisValue + nextValue})
    println(abc3)

    // reduceRight goes the other way
    val abc4 = listOfChars.reduceRight((thisValue, nextValue) => {print(s"evaluating $thisValue and $nextValue; "); thisValue + nextValue})
    println(abc4)


    // So what does this mean? You can use reduce and fold to write your implementation of sum
    listOfNumbers.fold(0)(_ + _) // returns 0 if coll is empty
    listOfNumbers.reduce(_ + _) // throws exception if empty

    // you can write your implementation of max
    println(listOfNumbers.fold(0)((acc, next) => if(next > acc) next else acc))
    println(listOfNumbers.reduce((a,b) => if(a > b) a else b))

    // you can write your implementation of min
    println(listOfNumbers.fold(0)((acc, next) => if(next < acc) next else acc))
    println(listOfNumbers.reduce((a,b) => if(a < b) a else b))

    // you can write your implementation of filter
    println(listOfNumbers.foldLeft(List.empty[Int])((acc, next) => if(next > 30) acc :+ next else acc))
    // equivalent to listOfNumbers.filter(_ > 30)

    // you can even write your implementation of map
    println(listOfNumbers.foldLeft(List.empty[Int])((acc, next) => acc :+ (next + 1)))
    // equivalent to listOfNumbers.map(_ + 1)


  }

}
