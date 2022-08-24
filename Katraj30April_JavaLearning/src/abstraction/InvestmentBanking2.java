package abstraction;

abstract class InvestmentBanking2 extends InvestmentBankingProject1 {

	@Override
	void buyingShares() {
		System.out.println("Logic of buying shares");
	}

	@Override
	abstract void sellingShare();
	

}
