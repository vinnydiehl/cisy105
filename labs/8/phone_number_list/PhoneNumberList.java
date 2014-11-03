/**
 * Searches a dictionary of phone numbers when given a last name.
 * Lab 8 - 03 November 2014
 *
 * @author Vinny Diehl
 */

import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class PhoneNumberList
{
    public static Scanner s = new Scanner(System.in);

    public static final Map<String, String> LIST = new HashMap<String, String>()
    {{
        put("Harrison, Rose", "555-2234");
        put("James, Jean"   , "555-9098");
        put("Smith, William", "555-1785");
        put("Smith, Brad"   , "555-9224");
    }};

    public static void main(String[] args)
    {
        System.out.print("Enter a last name or the first few characters of one: ");
        String search = s.nextLine().trim();

        System.out.println();

        for (Entry<String, String> e : LIST.entrySet())
        {
            String name = e.getKey(), number = e.getValue();
            if (name.toLowerCase().startsWith(search.toLowerCase()))
                System.out.println(name + ": " + number);
        }
    }
}
