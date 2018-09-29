package HW3;

public class VotingMachineTester
{

   public static void main(String[] args)
   {
      VotingMachine machine = new VotingMachine();
      machine.voteYes();
      machine.voteYes();
      machine.voteYes();
      machine.voteNo();
      machine.voteYes();
      machine.voteNo();
      machine.voteNo();
      
      System.out.println("Yes: " + machine.getYesVotes());
      System.out.println("Expected: 4" );
      System.out.println("No: " + machine.getNoVotes());
      System.out.println("Expected: 3" );
   }
}
