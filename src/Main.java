import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 строки:");
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String third = scanner.nextLine();

        String[] lines = new String[]{first,second,third};

        System.out.println("Задание №1: ");
        String max = "";
        String min = first;
        for (int i = 0; i < lines.length; i++) {
            if(max.length()<lines[i].length()){
                max= lines[i];
            }
            if(min.length()> lines[i].length()){
                min = lines[i];
            }
        }
        System.out.println("Самая длинная строка: " +max+"; ее длина: "+max.length());
        System.out.println("Самая короткая строка: " +min+"; ее длина: "+min.length());

        System.out.println("Задание №2: ");
        System.out.println("Упорядоченные строки в порядке возрастания: ");
        for (int i = 0; i < lines.length; i++) {
            while(lines[i]!=max && lines[i]!=min) {
                System.out.println(min+"\n"+lines[i]+"\n"+max);
                break;
            }
        }

        System.out.println("Задание №3: ");
        int average = (first.length()+second.length()+third.length())/3;
        System.out.println("Cредняя длина: "+average+"; Строки чья длина меньше средней:  ");
        for (int i = 0; i < lines.length; i++) {
            if(lines[i].length()<average){
                System.out.println(lines[i] + "; ее длина: "+lines[i].length());
            }
        }

        System.out.println("Задание №4: ");
        System.out.println("Строки состоящие только из различных символов: ");

        for (int i = 0; i < lines.length; i++) {
            boolean unique = false;
            for (int j = 0; j < lines[i].length(); j++) {
                char ch = lines[i].charAt(j);
                if(lines[i].indexOf(ch)==lines[i].lastIndexOf(ch)){
                     unique = true;
                     break;
                }
            }
            if (unique) {
                System.out.println(lines[i]);
                break;
            }
        }


        System.out.println("Задание №5: ");
        System.out.println("Задублированая строка: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length(); j++) {
                char ch = lines[i].charAt(j);
                stringBuilder.append(ch).append(ch);
            }
        }
        System.out.println(stringBuilder.toString());

        System.out.println("Задание *: ");
        String line = "дед которому было 101 жил себе не тужил";
        System.out.println(line);
        System.out.println("Введите номер слова чтобы проверить является ли он палиндромом: ");
        int number = scanner.nextInt();
        String[] word = line.split("\\s");
        boolean palindrom = false;
            if (word.length >= number || number<1) {
                for (int i = 0; i < word[number].length()/2; i++) {
                    if (word[number].charAt(i)==word[number].charAt(word[number].length()-1-i)){
                        palindrom = true;
                    }
                }
            } else {
                System.out.println("Число превышает количество слов в предложении");
                return;

        }
        if(palindrom){
            System.out.println("Это палиндромом");
        } else{
            System.out.println("Слово не является палиндромом");
        }
    }
}