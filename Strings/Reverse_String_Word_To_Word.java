public class Reverse_String_Word_To_Word {
    public static void main(String[] args) {
        char str[] = { 'm', 'y', ' ', 'i', 's', ' ', 'n', 'a', 'm', 'e', ' ', 'g', 'a', 'u', 'r', 'a', 'v' };
        char revStr[] = reverseString(str);

        for (char c : revStr) {
            System.out.print(c);
        }
    }

    static char[] reverseString(char[] str) {
        int start = 0;
        int end = str.length - 1;
        while (start <= end) {
            int tempEnd = findSpace(str, start);
            reverse(str, start, tempEnd - 1);
            if (tempEnd + 1 < end) {
                start = tempEnd + 1;
            } else {
                return str;
            }
        }
        return str;
    }

    static int findSpace(char[] str, int start) {
        int end = str.length;
        while (start < end) {
            if (str[start] == ' ') {
                return start;
            }
            start++;
        }
        return end;
    }

    static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
