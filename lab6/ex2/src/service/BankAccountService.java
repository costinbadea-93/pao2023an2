package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import static java.nio.file.StandardOpenOption.APPEND;

public class BankAccountService {
    private final String reportsPath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao presentation 2023\\lab6\\ex2\\src\\reporting";


    public void generateReport(StringBuilder content) {
        Path path = Paths.get(reportsPath);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        String time = simpleDateFormat.format(new Date());
        Path reportPath = path.resolve("report" + time +".csv");
        try {
            Files.createFile(reportPath);
            Files.writeString(reportPath, content, APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
