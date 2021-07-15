import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    /**
     * hàm main để chạy chương trình
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhập vào chuỗi cần kiểm tra..... : ");

        String input        = scanner.nextLine();
        String[] strings    = new String[0];
        String[] string1s   = new String[0];


        for (var i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            String convertKey = String.valueOf(key);
            switch (convertKey){
                case "a":
                case "o":
                case "e":
                case "i":
                case "u":
                    strings = addKeyToArray(strings, convertKey);
                    break;
                default: string1s = addKeyToArray(string1s, convertKey);
            }

            // gọi funtion check nguyên âm return về true or false
            System.out.println(isVowel(input.charAt(i)));
        }
        System.out.println("👏 chữ cái nguyên âm: "  + Arrays.toString(strings));
        System.out.println("👏 chữ cái phụ âm: "     + Arrays.toString(string1s));
    }


    /**
     *  thực hiện push thêm phần từ nguyên âm hoặc phụ âm vào trong mảng
     * @param array
     * @param key
     * @return
     */
    public static String[] addKeyToArray(String[] array, String key) {

        List<String> arraylist = new ArrayList<>(Arrays.asList(array));
        arraylist.add(key);
        array = arraylist.toArray(array);
        return array;
    }


    /**
     * check nguyên âm và phụ âm
     * @param c
     * @return
     */
    public static boolean isVowel(char c) {
        String key = String.valueOf(c);
        switch (key) {
            case "a":
            case "o":
            case "e":
            case "i":
            case "u":
               return true;
            default: return false;
        }
    }
}