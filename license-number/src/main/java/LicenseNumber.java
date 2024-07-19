import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenseNumber {
    // Регулярное выражение для проверки формата номера автомобиля
    private static final String CAR_NUMBER_REGEX = "^[АВЕКМНОРСТУХABEKMHOPCTYX]{1}\\s*\\d{3}\\s*[АВЕКМНОРСТУХABEKMHOPCTYX]{2}\\s*([A-Z]{3})?\\s*\\d{2,3}$";
    private static final String REGION_REGEX = "^[АВЕКМНОРСТУХABEKMHOPCTYX]{1}\\s*\\d{3}\\s*[АВЕКМНОРСТУХABEKMHOPCTYX]{2}\\s*";
    private int region;

    private LicenseNumber(int region) {
        this.region = region;
    }

    // проверка регистрационного номера автомобиля на валидность
    public static boolean isValid(String licenseNumber) {
        Pattern pattern = Pattern.compile(CAR_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(licenseNumber);

        return matcher.matches();
    }

    public static LicenseNumber parse(String licenseNumber) {
        if (!isValid(licenseNumber)) {
            throw new IllegalArgumentException("Не корректный гос. номер");
        } else {
            Pattern pattern = Pattern.compile(CAR_NUMBER_REGEX);
            Matcher matcher = pattern.matcher(licenseNumber);

            if (matcher.find()) {
                String region = matcher.group().replaceAll(REGION_REGEX, "");
                return new LicenseNumber(Integer.parseInt(region));
            } else {
                throw new IllegalArgumentException("Ключ не найден");
            }

        }
    }

    public String getRegion() {
        String regString = "";
        switch (region) {
            case 30:
                regString = "Астраханская область";
                break;
            case 50:
            case 90:
            case 150:
            case 190:
            case 750:
            case 790:
                regString = "Московская область";
                break;
            case 78:
            case 98:
            case 178:
            case 198:
                regString = "Санкт-Петербург";
                break;
                // и т. д. все регионы я писать конечно же не буду
        }
        return regString;
    }
}
