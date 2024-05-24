package kosa.realSoft;

import java.util.List;

public interface BankStatementParser {
	BankTransaction parseFrom(final String line);
	List<BankTransaction> parseLinesFrom(final List<String>lines);
}
