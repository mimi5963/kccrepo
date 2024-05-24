package kosa.realSoft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzerSimple {
	private static final String RESOURCES = "src/main/resources/";
	private static final BankStatementCSVParser baCsvParser = new BankStatementCSVParser();

	
	public static void main(final String... args) throws IOException {

		

		final String fileName = args[0];
		final Path path = Paths.get(RESOURCES + fileName);
		final List<String> lines = Files.readAllLines(path);

		final List<BankTransaction> bankTransactions = baCsvParser.parseLinesFrom(lines);

		
		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
		
		
		collectSummary(bankStatementProcessor);
//		System.out.println(calculateTotalAmount(bankTransactions));
//		System.out.println(selectInMonth(bankTransactions, Month.JANUARY));
//		;

		//final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	}

	
	private static void collectSummary(final BankStatementProcessor bankprocess) {
		System.out.println(bankprocess.calculate());
		System.out.println(bankprocess.calcMonth(Month.JANUARY));
		System.out.println(bankprocess.calcMonth(Month.FEBRUARY));
		System.out.println(bankprocess.calculTotalForCategory("Salary"));
	}
	
	public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
		
		final Path path = Paths.get(RESOURCES+fileName);
		final List<String> lines = Files.readAllLines(path);
		
		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
		
		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
		collectSummary(bankStatementProcessor);
		
	}
	
	
}
