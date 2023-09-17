package ua.hillel.dolhykh.homeworks.homework5;

//import java.util.Random;
//import java.util.Scanner;
//
//
//
//public class Main {
//    private static void findSymbolOccurance(String habr, char searchChar) {
//        int length = habr.length();
//        int a = 0;
//        for (int i = 0; i < length; i++) {
//            if (habr.charAt(i) == searchChar) {
//                a++;
//            }
//        }
//        System.out.println("Ось стільки букв " + searchChar + ": " + a);
//    }
//
//    private static void findWordPosition(String a, String b, String one, String two) {
//        int value = a.indexOf(one, 0);
//        System.out.println(value);
//        int values = b.indexOf(two, 0);
//        System.out.println(values);
//    }
//
//    private static void stringReverse() {
//        String inputString = "java";
//        String reversedString = new StringBuffer(inputString).reverse().toString();
//        System.out.println("reversedString = " + reversedString);
//    }
//
//    private static void isPalindrome(String a) {
//        int length = a.length();
//        for (int i = 0; i < (length / 2); i++) {
//            if (a.charAt(i) != a.charAt(length - i - 1)) {
//                System.out.println(a + " : " + false);
//                break;
//            }
//            System.out.println(a + " : " + true);
//            break;
//
//        }
//    }
//
//
//    public static void main(String[] args) {
//        findSymbolOccurance("fghfghfghfghfghfgh", 'h');
//        System.out.println("---------------------------------------------------------");
//        findWordPosition("Apollo", "Madrid", "pollo", "cdrid");
//        System.out.println("---------------------------------------------------------");
//        stringReverse();
//        System.out.println("---------------------------------------------------------");
//        isPalindrome("EREe");
//        System.out.println("---------------------------------------------------------");
//
//        Scanner scan = new Scanner(System.in);
//        Random random = new Random();
//        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
//                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
//                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
//                "pineapple", "pumpkin", "potato"};
//        int word = random.nextInt(words.length);
//        String wor = words[word];
//        String scane = scan.nextLine();
//
//        System.out.println("wor  " + wor);
//
//        int o = 0;
//        int c = 2;
//        int q = 3;
//        int w = 5;
//        int e = 7;
//        int r = 9;
//        StringBuilder str = new StringBuilder("###############");
//
//        if (wor.equals(scane)) {
//            System.out.println("sdgbsfgbsfgbsfvxbrwesgwerhjsfd");
//        }
//        for (int i = 2; ; ) {
//            String a = String.valueOf(str.replace(0, i, ""));
//            if (c == wor.length()) {
//                i = 0;
//            }
//            String b = wor.substring(o, c);
//            System.out.println(b + a);
//            if (c < wor.length()) {
//                c++;
//                if (c < wor.length()) {
//                    c++;
//                }
//                if (c == wor.length() && wor.length() == q) {
//                    i = 1;
//                }
//                if (c == wor.length() && wor.length() == w) {
//                    i = 1;
//                }
//                if (c == wor.length() && wor.length() == e) {
//                    i = 1;
//                }
//                if (c == wor.length() && wor.length() == r) {
//                    i = 1;
//                }
//
//
//            }
//            String g = scan.nextLine();
//            if (wor.equals(g)) {
//                System.out.println("Супер ти вгадав слово: " + wor +"!!!");
//                break;
//            }
//
//        }
//
//
//    }
//
//}