package kosa.realSoft;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementProcessor {
	private final List<BankTransaction> bankList;
	
	public BankStatementProcessor(final List<BankTransaction> bankList) {
		this.bankList = bankList;
	}
	
	public double calculate() {
		double total =0;
		for(final BankTransaction bank : this.bankList) {
			total += bank.getAmount();
		}
		return total;
	}
	
	public double calcMonth(final Month month) {
		double total =0;
		for(final BankTransaction bank:this.bankList) {
			if(bank.getDate().getMonth() == month) {
				total += bank.getAmount();
			}
		}
		return total;
	}
	
	public double calculTotalForCategory(final String category) {
		double total=0;
		for(final BankTransaction bank : this.bankList) {
			if(bank.getDescription().equals(category)) {
				total += bank.getAmount();
			}
		}
		return total;
	}

	public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount){
		final List<BankTransaction> result = new ArrayList<>();
		for(final BankTransaction bank : bankList){
			if(bank.getAmount() >= amount){
				result.add(bank);
			}
		}
		return result;
	}

//	//硫붿꽌�뱶 �븯�굹濡� �뎮移섍린 媛��뒫
//	public List<BankTransaction> findTransactions(final  BankTransactionFilter bankTransactionFilter){
//		final List<BankTransaction> result = new ArrayList<>();
//		for(final BankTransaction bank : bankList){
//			if(bankTransactionFilter.test(bank)){
//				result.add(bank);
//			}
//		}
//		return result;
//	}
}


