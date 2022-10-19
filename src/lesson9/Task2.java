package lesson9;

/**
 * Сложная (6 баллов)
 * <p>
 * Строка содержит названия товаров и цены на них в формате вида
 * "Хлеб 39.9; Молоко 62; Курица 184.0; Конфеты 89.9".
 * То есть, название товара отделено от цены пробелом,
 * а цена отделена от названия следующего товара точкой с запятой и пробелом.
 * Вернуть название самого дорогого товара в списке (в примере это Курица),
 * или пустую строку при нарушении формата строки.
 * Все цены должны быть больше нуля либо равны нулю.
 */
public class Task2 {
    public static void main(String arg[]) {
        String Str = "Хлеб 39.9; Молоко 620000; Курица 184.0; Конфеты 89.9";
        boolean IsRunFun = true;
        String[] names = Str.split("; ");
        double prices[];
        prices = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] pricesStr = names[i].split(" ");
            String curStr = pricesStr[1];
            curStr = curStr.replace(';', ' ');
            double value = Double.parseDouble(curStr);
            if (value >= 0) {
                prices[i] = value;
            } else {
                System.out.println("");
                IsRunFun = false;
                break;
            }
        }
        if (IsRunFun) {
            int numMaxEl = returnMaxEl(prices);
            String NameAll = names[numMaxEl];
            String[] NameMaxCoast = NameAll.split(" ");
            System.out.print(NameMaxCoast[0]);
        }
    }
    public static int returnMaxEl(double[] Array) {
        int j = 0;
        double maxNum = Array[0];

        for ( int i = 0; i < Array.length; i++) {
            if (Array[i] > maxNum){
                maxNum = Array[i];
                j = i;
            }
        }
        return j;
    }
}
