
public class CapitalStrategyTermLoan extends CapitalStrategy {
	

    public double capital(Loan loan){

        return ((CapitalStrategy) loan).getCommitment();
         
    }

}
