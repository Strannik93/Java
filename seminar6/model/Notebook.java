package hw.seminar6.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    private String name;
    private Integer ram;
    private Integer hardDriveSize;
    private String os;
    private String color;
    private Integer price;

    public static String fieldReturn(String num) {
        if (num.equals("0")) return "name";
        if (num.equals("1")) return "ram";
        if (num.equals("2")) return "hardDriveSize";
        if (num.equals("3")) return "os";
        if (num.equals("4")) return "color";
        if (num.equals("5")) return "price";
        else return "-1";
    }

    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }

    public static void printList(List<Notebook> nList, Map<String,String> filter) {
        for (int i = 0; i < nList.size(); i++) {
            if (checkMatch(nList.get(i), filter)) System.out.println(nList.get(i));
            else {
                nList.remove(i);
                i -= 1;
            }
        }
        if (nList.size() == 0) System.out.println("Результатов не найдено");
    }

    public static boolean checkMatch(Notebook current, Map<String,String> filter) {
        if (filter.get("name") != null) if (!current.name.toLowerCase().contains(filter.get("name").toLowerCase())) return false;
        if (filter.get("ram") != null) if (current.ram != Integer.parseInt(filter.get("ram").trim())) return false;
        if (filter.get("hardDriveSize") != null) if (current.hardDriveSize != Integer.parseInt(filter.get("hardDriveSize").trim())) return false;
        if (filter.get("os") != null) if (!current.os.toLowerCase().contains(filter.get("os").toLowerCase())) return false;
        if (filter.get("color") != null) if (!current.color.toLowerCase().contains(filter.get("color").toLowerCase())) return false;
        if (filter.get("price") != null) if (current.price > Integer.parseInt(filter.get("price").trim())) return false;
        return true;
    }

    public static Map<String, String> createFilter() {
        Map<String, String> filter = new HashMap<>();
        filter.put("name", null);
        filter.put("ram", null);
        filter.put("hardDriveSize", null);
        filter.put("os", null);
        filter.put("color", null);
        filter.put("price", null);
        return filter;
    }
}
