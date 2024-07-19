package JSON;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class JsonParser
{
    public static String getValue(String jsonString, String key)
    {
        if(!JsonValidator.check(jsonString))
            throw new IllegalArgumentException("Json не валиден");

        // Создаем регулярное выражение для поиска ключа и его значения
        String regex = String.format("\"%s\":\\s\"(.+?)\"", key);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(jsonString);

        if (matcher.find()) {
            // извлекаем значение из группы 1
            return matcher.group(1);
        }
        else
        {
            throw new IllegalArgumentException("Ключ не найден");
        }
    }
}
