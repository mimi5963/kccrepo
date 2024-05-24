package kosa.realSoft;

import java.time.Month;
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
	
}
