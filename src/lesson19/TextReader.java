package lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {

    public void readFileWithTryCatch(String filePath) {
        File file = new File(filePath);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }// или любая другая логика в catch
    }

    public void readFileWithThrow(String filePath) throws FileNotFoundException { // <- тем самым мы говорим что да есть ошибка, но мы ни как с этим исключением не работаем, пробрасываем его.
        File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

        }
    }
}