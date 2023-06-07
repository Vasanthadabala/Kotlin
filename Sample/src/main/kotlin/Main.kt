import java.util.Calendar

object Company
    {
        var Name:String="Little Lemon"
        var Year:Int=2019
        fun TotalYearsOpened():Int
        {
            return Calendar.getInstance().get(Calendar.YEAR)-Year;
        }
    }
fun main()
{
    println(Company.TotalYearsOpened());
}
