
public class CapitalStrategyAdvisedLine extends CapitalStrategy {


    public double capital(Loan loan){

        return ((CapitalStrategy) loan).getCommitment() *
               ((CapitalStrategy) loan).getUnusedPercentage();
     
    }
}
