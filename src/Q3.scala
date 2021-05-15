object Q3 extends App{
  //Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount.
    //Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy.
      //What is the total wholesale cost for 60 copies?
  println("\nCalculate total wholesale cost for 60 copies\n")

  val cover_price :Double = 24.95;
  val discount : Double = cover_price*0.4;
  val totalcost : Double = (cover_price-discount);
  val wholesale : Double = ((totalcost+3)*50)+((totalcost+0.75)*10);
  println("The total wholesale cost for 60 copies: " + (wholesale))
}
