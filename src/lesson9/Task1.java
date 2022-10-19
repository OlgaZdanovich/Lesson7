package lesson9;

public class Task1 {

    public static void main(String arg[]) {
        String resultStr;
        String Str = "1 февраля 2022";
        String[] words = Str.split(" ");
        String Number = words[0];
        String Month = words[1];
        String Year = words[2];

        if (Integer.parseInt(Number) > 31) {
            System.out.println("");
        } else if (Month.equalsIgnoreCase("февраля") & (Integer.parseInt(Number) > 29)) {
            System.out.println("");
        } else {
            String NumberStr = CheckNumberOfChar(Number);
            String MonthStr = ReturnNumberOfMonth(Month);
            resultStr = NumberStr + "." + MonthStr + "." + Year;
            System.out.println(resultStr);
        }

    }

    public static String CheckNumberOfChar(String str) {
        if (str.length() == 1) {
            String str1 = String.join("", "0", str);
            return str1;
        } else {

            return str;
        }


    }

    public static String ReturnNumberOfMonth(String MonthStr) {
        String numberStr = "00";
        String[] namesOfMonth = {"января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        for (int i = 0; i < namesOfMonth.length; i++){
            if (MonthStr.equalsIgnoreCase(namesOfMonth[i])){
                if ((i+1) < 10) {
                    numberStr = String.join("", "0", Integer.toString(i + 1));
                }else{
                    numberStr = Integer.toString(i + 1) ;
                }
            }
        }

        return numberStr;
    }
}
