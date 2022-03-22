import java.util.*;

public class Level1{

	public static boolean proverca(StringBuilder stringBuilder) {
        boolean vosrastanie = false;
        array = new int[stringBuilder.length()];

        for (int j = 0; j < array.length; j++) {
            array[j] = Integer.parseInt(String.valueOf(stringBuilder.charAt(j)));
        }
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                vosrastanie = array[i - 1] < array[i];
                if (!vosrastanie) {
                    break;
                }
            }
        }
        return vosrastanie;
    }

    public static boolean Football(int F[], int N) {
        int numb;

        //перестановка
        for (int j = 0; j < F.length; j++) {
            array = F.clone();
            for (int r = 0; r < array.length - 1; r++) {
                strBuilder = new StringBuilder();
                numb = array[r];
                array[r] = array[r + 1];
                array[r + 1] = numb;
                strBuilder = stringBuilder(array);
                if (proverca(strBuilder)) {
                    return true;
                }
            }
        }

        int minus = 0, plus = 0;
        strBuilder = new StringBuilder();
        strBuilder = stringBuilder(F);
        //запускаем числа из диапазона
        for (int i = 0; i < strBuilder.length(); i++) {
            minus = i;
            plus = i + 1;

            for (int j = 0; j < strBuilder.length() - 1; j++) {
                result = new StringBuilder(strBuilder);
                if (minus > 0) {
                    minus--;
                }

                if (plus < strBuilder.length()) {
                    plus++;
                }

                stringBuilderCopy.append(strBuilder.substring(minus, plus));
                stringBuilderCopy.reverse();
                result.replace(minus, plus, String.valueOf(stringBuilderCopy));
                if (proverca(result)) {
                    return true;
                }
                stringBuilderCopy = new StringBuilder();
            }
        }
        return false;
    }

    public static StringBuilder stringBuilder(int[] ints){
        for (int i : ints) {
            strBuilder.append(i);
        }
        return strBuilder;
    }
}
}