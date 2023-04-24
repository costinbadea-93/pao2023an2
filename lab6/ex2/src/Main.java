import model.BankAccount;
import service.BankAccountService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccountService bankAccountService = new BankAccountService();
        List<BankAccount> bankAccountList =
                List.of(
                       new BankAccount("00000501c5", "200000", "$"),
                       new BankAccount("00000502c5", "3000", "$"),
                       new BankAccount("00000503c5", "4000", "$")
                );

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("ACCOUNT_NUMBER");
        stringBuilder.append(",");
        stringBuilder.append("AMOUNT");
        stringBuilder.append(",");
        stringBuilder.append("CURRENCY");
        stringBuilder.append("\n");

        bankAccountList.forEach(bankAccount -> {
            stringBuilder.append(bankAccount.getAccountNumber());
            stringBuilder.append(",");
            stringBuilder.append(bankAccount.getAmount());
            stringBuilder.append(",");
            stringBuilder.append(bankAccount.getCurrency());
            stringBuilder.append("\n");
        });

      bankAccountService.generateReport(stringBuilder);


        /**
         *  Student ( nume, prenume, grupa, medie generala);
         *  Service(adauga student,
         *          listeaza studenti ordonati dupa nume
         *          generare raport student(nume, prenume, grupa, medie...)
         *          cauta un student dupa nume)
         */
    }
}
