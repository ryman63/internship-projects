import json.JsonParser;
import json.JsonValidator;

public class Main
{
    public static void main(String[] args)
    {
        String json = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\", \"isChecked\": true, \"code\": [11, 22], \"object\": {\"id\": 11, \"name\": \"string\"}}";

        if(JsonValidator.check(json))
            System.out.println("Json корректен");
        else
            System.out.println("Json не корректен");

        try
        {
            String name = JsonParser.getValue(json, "name");
            System.out.println("Name: " + name);

            String age = JsonParser.getValue(json, "age");
            System.out.println("Age: " + age);

            String code = JsonParser.getValue(json, "code ");
            System.out.println("code: " + code);

            String object = JsonParser.getValue(json, " object");
            System.out.println("object: " + object);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
