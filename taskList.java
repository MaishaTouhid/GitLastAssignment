import java.util.*;
class ListManager {
    static Scanner scanner = new Scanner(System.in);
    static List<String> itemlist = new ArrayList<>();

public static void main(String[] args){
  while(true){
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      System.out.println("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

        if(choice == 1){
            System.out.print("Item Name: ");
            String item = scanner.nextLine();
            itemlist.add(item);
            System.out.println("item added.\n");

        }else if(choice == 2){
            System.out.print("Enter Index to remove : ");
            int index = scanner.nextInt();
            scanner.nextLine();
            if(index >= 0 && index < itemlist.size()){
                itemlist.remove(index);
                System.out.println("Item removed. \n");
      }

        }else if(choice == 3){
          System.out.println("Current List: ");
            for(int j = 0; j < itemlist.size(); j++){
                 System.out.println(j + ": " + itemlist.get(j));
    }
    System.out.println();

        }else if(choice == 4){
          System.out.println("Goodbye.....");
            break;
          }
        }
      }
    }
