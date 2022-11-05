//We want to add a button to the tally counter in Section 3.1 that allows an operator to undo an accidental button
// click. Provide a method public void undo() that simulates such a button. As an added precaution, make sure that
// clicking the undo button more often than the click button has no effect. (Hint: The call Math.max(n, 0) returns
// n if n is greater than zero, zero otherwise.)
public class TallyCounter {
   private int counter;
   public TallyCounter()
   {
       counter=0;
   }
   public void set_click()
   {
       counter=counter+1;
   }
   public void get_value()
   {
       System.out.println(counter);
   }
   public void undo()
   {
       if(Math.max(counter,0)==counter&&counter!=0)
       {
           counter=counter-1;
           System.out.println(counter);
       }
       else System.out.println(0);
   }
}
