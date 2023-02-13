package hw.seminar1;

import java.util.ArrayList;

// Учитывая входную строку s, измените порядок слов в обратном порядке.
// Слово определяется как последовательность символов, не содержащих пробелов.
// Слова в s будут разделены по крайней мере одним пробелом.
// Возвращает строку слов в обратном порядке, объединенную одним пробелом.
// Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами. 
// Возвращаемая строка должна содержать только один пробел, разделяющий слова. 
// Не включайте никаких дополнительных пробелов.

public class InvertText {
    public static void main(String[] args) {
        String myText = "   the sky  is  blue ";
        System.out.println(myText);
        String newText = invertNewText(myText);
        System.out.println(newText);
    }

    public static String invertNewText(String myText){
        String[] arrayText = myText.split(" ");
        ArrayList<String> newArrayText = new ArrayList<String>();
        for (int i = arrayText.length -1; i >= 0; i--) {
            if (arrayText[i] != ""){
                newArrayText.add(arrayText[i]);
            }
        }
        String newText = String.join(" ", newArrayText);
        return newText;
    }
}
