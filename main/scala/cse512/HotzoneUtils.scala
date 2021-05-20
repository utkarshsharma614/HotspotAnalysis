package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    // YOU NEED TO CHANGE THIS PART
    //    parse rectangle and get coordinates
    val rectangle = queryRectangle.split(",");
    val rectX1 = rectangle(0).trim().toDouble
    val rectX2 = rectangle(2).trim().toDouble
    val rectY1 = rectangle(1).trim().toDouble
    val rectY2 = rectangle(3).trim().toDouble

    //    parse point
    val point = pointString.split(",")
    val ptX = point(0).trim().toDouble
    val ptY = point(1).trim().toDouble

    //    get the min and max of x-y coordinates of the rectangle. Point should be between those.
    val minX : Double = Math.min(rectX1, rectX2)
    val minY : Double = Math.min(rectY1, rectY2)
    val maxX : Double = Math.max(rectX1, rectX2)
    val maxY : Double = Math.max(rectY1, rectY2)

    if(ptX >= minX && ptX <= maxX && ptY >= minY && ptY <= maxY) {
      return true
    }
    return false
  }

  def ST_Within(pointString1:String, pointString2:String, distance:Double): Boolean ={
    val point1 = pointString1.split(",").map(_.toDouble)
    val point2 = pointString2.split(",").map(_.toDouble)
    val calculated_distance = math.sqrt(math.pow((point1(0) - point2(0)),2) + math.pow((point1(1) - point2(1)), 2))
    if (calculated_distance <= distance) {
      return true
    }else {
      return false
    }
  }

}
