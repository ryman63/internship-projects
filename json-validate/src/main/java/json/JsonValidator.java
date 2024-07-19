package json;
public class JsonValidator {

    // со вложенностью мозгов не хватает сделать, и про то что массив может быть с разными типами знаю.
    static String regexValidJson = "^\\s*" +
            "(\\{\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null|\\[\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\]|\\{\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\})" +
            "(,\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null|\\[\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\]|\\{\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\}))*" +
            "\\s*\\}|\\" +
            "[\\s*(\"[^\"]*\"|\\d+|true|false|null|\\[\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\]|\\{\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\})" +
            "(,\\s*(\"[^\"]*\"|\\d+|true|false|null|\\[\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\]|\\{\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null)(,\\s*\"[^\"]+\"\\s*:\\s*(\"[^\"]*\"|\\d+|true|false|null))*\\}))*" +
            "\\s*\\])\\s*$";
    public static boolean check(String jsonString) {
        return jsonString.matches(regexValidJson);
    }

//    static String regexString = ".*\".*\"\\s*:\\s*\".*\"\\s*.*"; // "key": "string",
//    static String regexInt = ".*\".*\"\\s*:\\s*\\d+\\s*.*"; // "key": "int",
//    static String regexFloat = ".*\".*\"\\s*:\\s*\\d+.\\d+\\s*.*"; // "key": "float or double",
//    static String regexBoolean = ".*\".*\"\\s*:\\s*((true)|(false))?\\s*.*"; // "key": "float or double",
//    static String regexObject = ".*\".*\"\\s*:\\s*\\{\\s*(" + regexString + ")*(" + regexInt + ")*(" + regexFloat + ")*\\s*\\}\\s*.*"; // "key": "object",
//    static String regexArray = ".*\".*\"\\s*:\\s*[\\s*(\\d+,)*(\\d+.\\d+,)*(\".*\",)*\\s*]\\s*.*"; // "key": "array",
//
//    private static boolean hasExtraCommas(String json) {
//        // Паттерн для поиска лишних запятых в JSON
//        Pattern pattern = Pattern.compile("(\\{[^\\{\\}]*,\\s*\\})|(\\[[^\\[\\]]*,\\s*\\])");
//
//        // Поиск совпадений
//        Matcher matcher = pattern.matcher(json);
//        return matcher.find();
//    }

//    public static boolean check(String json) {
//        if (json == null || json.isEmpty()) {
//            return false;
//        }
//
//        if(hasExtraCommas(json))
//            return false;
//
//
//        boolean result = false;
//        if (json.startsWith("{") && json.endsWith("}")) {
//            int beginIndex = 1;
//            int indexComma = 1;
//            while (true) {
//                String str = json.substring(beginIndex, json.length());
//                indexComma = str.indexOf(",");
//                result = checkJSONElement(str.substring(0, indexComma));
//                beginIndex += indexComma + 1;
//                if(isLastElement(str))
//                    break;
//            }
//
//        }
//
//        return result;
//    }


//    private static boolean checkJSONElement(String jsonString) {
//        if (jsonString.matches(regexString)
//                || jsonString.matches(regexInt)
//                || jsonString.matches(regexFloat)
//                || jsonString.matches(regexBoolean)) {
//            return true;
//        }
//        return false;
//    }
//
//    private static boolean isLastElement(String jsonSubStr) {
//        String strWithoutSpaces = "";
//        for (Character symbol : jsonSubStr.toCharArray()) {
//            if (symbol != ' ')
//                strWithoutSpaces += symbol;
//        }
//        if(strWithoutSpaces.charAt(0) == '}' || strWithoutSpaces.charAt(0) == ']')
//            return false;
//        return true;
//    }

//    public static boolean check(String json) {
//        json = json.replaceAll("\\s+", ""); // Удаляем все пробелы
//
//        // Паттерн для поиска объектов и массивов
//        String pattern = "\\{[^\\{\\]]*\\}|\\[[^\\[\\]]*\\]";
//
//        // Паттерн для поиска значений внутри объектов и массивов
//        String valuePattern = "\"(?:\\\\\"|[^\"])*\"|true|false|null|-?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?";
//
//        // используем регулярное выражение для поиска совпадений
//        Matcher matcher = Pattern.compile(pattern).matcher(json);
//        while (matcher.find()) {
//            String match = matcher.group();
//            Matcher valueMatcher = Pattern.compile(valuePattern).matcher(match);
//            int end = 0;
//            while (valueMatcher.find()) {
//                end = valueMatcher.end();
//            }
//            if (end < match.length() - 1) {
//                return true; // Найдено значение без запятой
//            }
//        }
//
//        return false; // Пропущенные запятые не найдены
//    }
}
