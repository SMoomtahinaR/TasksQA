import java.util.Random;
public class RandomUtil {
    public static void main(String[] args) {
        getString(5, true);
    }
    public static void getString(int n, boolean flag)
    {
            if (flag == true) {
                final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz~!@#$%^&*()_+";
                String randomString = "";
                int length = 6;
                Random rand = new Random();
                char[] text = new char[length];
                for (int i = 0; i < length; i++) {
                    text[i] = characters.charAt(rand.nextInt(characters.length()));
                }
                for (int i = 0; i < text.length; i++) {
                    randomString += text[i];
                }
                System.out.println(randomString);
            } 
            else if (flag == false) {
                final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
                String randomString = "";
                int length = n;
                Random rand = new Random();
                char[] text = new char[length];
                for (int i = 0; i < length; i++) {
                    text[i] = characters.charAt(rand.nextInt(characters.length()));
                }
                for (int i = 0; i < text.length; i++) {
                    randomString += text[i];
                }
                System.out.println(randomString);
            }
        }
    }
