// question 1
import java.util.ArrayList;
import java.util.Iterator;
public class Club
{
    //question 1
    private ArrayList<Membership> members;
    public Club()
    {
        members = new ArrayList<>();
    }
    //question 3
    /**
    * Add a new member to the club's collection of members.
    * @param member The member object to be added.
    */  
    public void join(Membership member)
    {
        members.add(member);
    }
    //question 2
    public int numberOfMembers()
    {
        return members.size();
    }
    //question 4
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members who joined in that month.
    */
    public int joinedInMonth(int month){
        if (month<=0 || month>12){
            System.out.println("Invalid Month: " + month);
            return 0;
        } else{
            int count = 0;
            for (Membership m : members){
                if (m.getMonth()==month){
                    count++;
                }
            }
            return count;
        }
    }
    // question 5
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored
    * in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
    public ArrayList<Membership> purge(int month, int year){
        if (month<=0 || month>12){
            System.out.println("Invalid Month: }" + month);
            return null;
        } else if (year<=1990 || year>2026){
            System.out.println("Invalid Year: " + year);
            return null;
        } else {
            ArrayList<Membership> removals = new ArrayList();
            Iterator<Membership> it = members.iterator();
            while (it.hasNext()){
                Membership m = it.next();
                if (m.getMonth()==month && m.getYear()==year){
                    System.out.println("Membership found in " + month + "/" + year);
                    removals.add(m);
                    it.remove();
                }
            }
            return removals;
        }
    }
}
