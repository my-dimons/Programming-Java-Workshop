import java.util.Scanner;  // Import the Scanner class
// OCT 24, 2024
class hashtag_challenge {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int height;
    do{
        System.out.print("Height: ");
        height = input.nextInt();
    }while(height < 0 && height > 8);

    for (int i = 1; i <= height; i++) {
        for (int j = height - i; j > 0; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("#");
        }
        System.out.println();
    }
  }
}