package by.epamtc.rumiantsau.task_02;

public class Task02 {
    public static void main(String[] args) {
        String enteredString = "  q qq qqaaaqq QQqqqqq  dfebbbbfeFEf fefefaaaaaaaefefefefef feefbbbbefefef fe aaa";
        String[] massiveWords = removeExtraSpaces(enteredString).split(" ");
        String firstBigNumber = "1111111111111111112222222222222222222999999999999996666666666666666333333333333";
        String secondBigNumber = "222222222999999999999996666666666666666333333333333";
        char charForTest = 'd';

        //Сложение очень длинных целых чисел
        System.out.println("Sum = " + addBigNumbersInString(firstBigNumber, secondBigNumber));

        //Частота встречаемости символа в строке
        System.out.println("Char Frequency of " + charForTest + " = " + calcCharFrequency(enteredString, charForTest));

        //Удаление последнего слова в строке
        System.out.println("Entered String Without Last Word" + "\n" + deleteLastWord(enteredString));

        //Является ли строка палиндром? + Переворот строки
        System.out.println("Does the Entered String a Palindrome?" + " Answer: " +
                checkStringPolindrome("А роза упала на лапу Азора"));

        //Удаление из строки слов заданной длины
        System.out.println("Result after deletion words with given length:" + "\n" +
                deleteWordWithLength(massiveWords, 8));

        //Замена подстроки в строке  "aaaqq qqqq" на "$$$$$$$$$$$$"

        System.out.println("String After Replacement SubString:" + "\n" +
                replaceSubString(enteredString, "aaaqq qqqq", "$$$$$$$$$$$$"));

        //Удаление одинаковых символов
        System.out.println("Unique String Characters: " + "\n" +  findUniqChars(enteredString));

        //Заменить в самом длинном слове строки буквы 'a' на 'b'
        System.out.println("Replace 'a' om 'b' In Word With Max Length" + "\n"
                +maxLengthWord(massiveWords).replace('a', 'b'));

        //Удаление лишних пробелов
        System.out.println("Entered String Without Extra Spaces: " + "\n" +  removeExtraSpaces(enteredString));

        //Определить длину самого длинного слова в строке
        System.out.println("Max Length Word" + maxLengthWord(massiveWords));

        //Определить длину самого короткого слова в строке
        System.out.println("Min Length Word" + minLengthWord(massiveWords));

        //Четные и нечетные символы разделить по разным строкам
        printEvenOddChar(enteredString);

        //Заменить пробел и группы пробелов символом "*"
        System.out.println(enteredString.replace(" ", "*"));

        //Определение длины строки
        System.out.println("String Length = " + enteredString.length());

        //Вывести слова строки в обратном порядке + Выделение слов из строки
        printWordsInReverseOrder(enteredString, massiveWords);

        //Вставка подстроки
        System.out.println("\n" + "Insert SubString In Entered String :" +
                "\n"+ new StringBuilder(enteredString).insert(5, "!QQQQQQQQQQQQQQQQ!") + "\n");

        //Удаление подстроки
        System.out.println("\n" + "Delete SubString In Entered String :" +
                "\n"+ new StringBuilder(enteredString).delete(0, 15) + "\n");

        //Добавление пробелов в строку
        System.out.println("Add Spaces In Entered String:" + enteredString.concat("     "));

        //Поменять слова местами, допустим слова с индексами 2 и 3
        System.out.println("String After Swap Words" + "\n" +
                swapWord(massiveWords, 2, 3));

        //Копирование части строки
        System.out.println("Copy Part Of Entered String" + "\n" +
                copyPartOfString(enteredString, 5, 10));

        //Процентное соотношение строчных и прописных букв
        printPercentUpperLowCaseChars(enteredString);

    }

    private static String addBigNumbersInString(String firstBigNumber, String secondBigNumber) {
        StringBuilder firstNumber = new StringBuilder();
        StringBuilder secondNumber = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int length = 0;
        int stringToLInt = 0;
        int dozen = 0; // перенос единицы на следующий разряд

        length = Math.abs(firstBigNumber.length() - secondBigNumber.length());

        //добавляем нули в строку на отсутсвующие разряды
        if (firstBigNumber.length() > secondBigNumber.length()) {
            for (int i = 0; i < length; i++) {
                secondNumber.append(0);
            }
        }
        else if (firstBigNumber.length() < secondBigNumber.length()){
            for (int i = 0; i < length; i++) {
                firstNumber.append(0);
            }
        }

        secondNumber.append(secondBigNumber);
        firstNumber.append(firstBigNumber);
        length = firstNumber.length()-1;

        while (length > 0){
            //преобразуем символы char в int и вычисляем результат сложения
            stringToLInt = Character.digit(firstNumber.charAt(length), 10) +
                    Character.digit(secondNumber.charAt(length), 10)
                    +dozen;
            //проверка, будет ли прибавляться единица при следующей итерации
            if (stringToLInt > 10) {
                dozen = 1;
                stringToLInt %= 10;
            }
            else dozen = 0;
            result.append(stringToLInt);
            length--;
        }
        //переворачиваем получившийся результат через реверс
        return result.reverse().toString();
    }

    private static void printPercentUpperLowCaseChars(String enteredString) {
        double upperCaseChars = 0;
        double lowCaseChars = 0;
		
        String stringWithoutSpaces = enteredString.replaceAll(" ", "");
        System.out.println(stringWithoutSpaces);
        for (int j = 0; j < stringWithoutSpaces.length(); j++) {
            if (Character.isUpperCase(stringWithoutSpaces.charAt(j))){
			upperCaseChars++;
			}
            else{
			lowCaseChars++;
			}
        }
        System.out.println("Percent Of Upper Case Chars: "
                + upperCaseChars/(upperCaseChars + lowCaseChars) * 100 +"%");
        System.out.println("Percent Of Low Case Chars: "
                + lowCaseChars/(upperCaseChars + lowCaseChars) * 100 +"%");
    }

    private static String findUniqChars(String enteredString) {
        StringBuilder uniqChars = new StringBuilder();
        // String stringWithoutSpaces
        StringBuilder stringWithoutSpaces = new StringBuilder
                (enteredString.replaceAll(" ", "").toLowerCase());
        int i = 0;
		
        do{
            uniqChars.append(stringWithoutSpaces.charAt(0));
            stringWithoutSpaces = new StringBuilder(stringWithoutSpaces.toString()
                    .replace(stringWithoutSpaces.charAt(0), ' ').replaceAll(" ", ""));
        }
        while (stringWithoutSpaces.length() != 0);
        return uniqChars.toString();

    }

    private static String copyPartOfString(String enteredString,  int startIndex, int endIndex) {
        StringBuilder partOfString = new StringBuilder();

               for (int i = startIndex; i < endIndex; i++) {
            partOfString.append(enteredString.charAt(i));
        }

        return partOfString.toString();
    }

    private static String swapWord(String[] massiveWords, int indexFirstWord, int indexSecondWord) {
        StringBuilder stringAfterSwap = new StringBuilder();

        for (int i = 0; i < massiveWords.length; i++) {
            if (i == indexFirstWord){
			stringAfterSwap.append(massiveWords[indexSecondWord]);
			}
            else if (i == indexSecondWord){
			stringAfterSwap.append(massiveWords[indexFirstWord]);
			}
            else{
			stringAfterSwap.append(massiveWords[i]);
			}
            if (i != massiveWords.length-1){
            stringAfterSwap.append(' ');
			}
        }

        return stringAfterSwap.toString();
    }

    private static String replaceSubString(String enteredString, String subStringForReplace, String replacementForSubString) {
        if (enteredString.contains(subStringForReplace)){
        return enteredString.replace(subStringForReplace, replacementForSubString);
		}
        else{
		return "Couldnt Found SubStringForReplace In EnteredString";
		}
    }

    private static String removeExtraSpaces(String enteredString) {
        StringBuilder stringNoExtraSpaces = new StringBuilder();
        String stringTrim = enteredString.trim();

        for (int i = 0; i < stringTrim.length()-1; i++) {
            if ((stringTrim.charAt(i) != ' ')){
                stringNoExtraSpaces.append(stringTrim.charAt(i));}
            else if ((stringTrim.charAt(i+1) != ' ')){
                stringNoExtraSpaces.append(stringTrim.charAt(i));}
        }
        stringNoExtraSpaces.append((stringTrim.charAt(stringTrim.length()-1)));

        return stringNoExtraSpaces.toString();
    }

    private static Boolean checkStringPolindrome(String enteredString) {
        String stringWithoutSpaces = enteredString.replaceAll(" ", "").toLowerCase();
        StringBuilder reverseString = new StringBuilder(stringWithoutSpaces).reverse();

        return stringWithoutSpaces.equals(reverseString.toString());

    }

    private static String minLengthWord(String[] massiveWords) {
        int minIndexCharsInWord = 0;
        for (int i = 0, min = Integer.MAX_VALUE; i < massiveWords.length; i++) {
            if (massiveWords[i].length() < min){
                min = massiveWords[i].length();
                minIndexCharsInWord = i;
            }
        }
      return massiveWords[minIndexCharsInWord];
    }

    private static String maxLengthWord(String[] massiveWords) {
        int maxIndexCharsInWord = 0;
		
        for (int i = 0, max = 0; i < massiveWords.length; i++) {
            if (massiveWords[i].length() > max){
                max = massiveWords[i].length();
                maxIndexCharsInWord = i;
            }
        }

       return massiveWords[maxIndexCharsInWord];
    }

    private static String deleteWordWithLength(String[] massiveWords, int givenLength) {
        StringBuilder resultString = new StringBuilder();

        for (String massiveWord : massiveWords) {
            if (massiveWord.length() != givenLength){
                resultString.append(massiveWord).append(" ");
            }
        }

        return resultString.toString();
    }

    private static String deleteLastWord(String enteredString) {
        StringBuilder stringWithoutLastWord = new StringBuilder(removeExtraSpaces(enteredString));
        int iLast = stringWithoutLastWord.length()-1;
        int iFirst = iLast;

        while (stringWithoutLastWord.charAt(iFirst) != ' ') {
            iFirst--;
        }

        return stringWithoutLastWord.delete(iFirst, iLast).toString();
    }

    private static int calcCharFrequency(String enteredString, char inputChar) {
        int charFrequencyInString = 0;
		
        for (int i = 0; i < enteredString.length(); i++) {
            if (enteredString.charAt(i) == inputChar){
                charFrequencyInString++;  }
        }
		
        return charFrequencyInString;
    }

    private static void printEvenOddChar(String enteredString) {
        StringBuilder evenChars = new StringBuilder(); //четные символы в строке
        StringBuilder oddChars = new StringBuilder(); //нечетные символы в строке
		
        for (int i = 0; i < enteredString.length(); i++) {
            if (i % 2 == 0){
                evenChars.append(enteredString.charAt(i));
            }
            else
                oddChars.append(enteredString.charAt(i));
        }
        System.out.println("Еven Characters:" + evenChars); //четные
        System.out.println("Odd Characters:" + oddChars); //нечетные
    }

    private static void printWordsInReverseOrder(String enteredString, String[] massiveWords) {
        System.out.println("Words in Reverse Order: ");
        for (int i = massiveWords.length - 1; i >= 0; i--) {
            System.out.print(massiveWords[i] + ' ');
        }
        System.out.println();
    }

}
