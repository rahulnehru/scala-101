package object I_implicits {

  implicit def booleanToLong(b: Boolean): Long = {
    if(b) 200L
    else 500L
  }

}
