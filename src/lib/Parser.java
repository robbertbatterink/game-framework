package lib;

import java.util.HashMap;
import java.util.Stack;

public class Parser {

    public static HashMap parse(Stack stack) {

        HashMap info = new HashMap();
        String query = stack.pop().toString();
        query = query.substring(1, query.length() - 1);
        query = query.replace("\"", "");
        query = query.replace(",", "");
        query = query.replace(":", "");
        System.out.println(query);
        String[] values = query.split(" ");

        for (int x = 0; x < values.length - 1; x++) {
            String value = values[x + 1];
            info.put(values[x], value);
            x++;
        }

        return info;

    }

}
