import java.util.*;

class ListManager {

  // Constants for menu choices
    private static final int ADD_ITEM = 1;
    private static final int REMOVE_ITEM = 2;
    private static final int SHOW_ITEMS = 3;
    private static final int EXIT = 4;

    static Scanner scanner = new Scanner(System.in);
    static List<String> itemlist = new ArrayList<>();

public static void main(String[] args){
  while(true){
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      System.out.println("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

        if(choice == ADD_ITEM){
            System.out.print("Item Name: ");
            String item = scanner.nextLine();
            itemlist.add(item);
            System.out.println("item added.\n");

        }else if(choice == REMOVE_ITEM){
            System.out.print("Enter Index to remove : ");
            int index = scanner.nextInt();
            scanner.nextLine();
            if(index >= 0 && index < itemlist.size()){
                itemlist.remove(index);
                System.out.println("Item removed. \n");
      }

        }else if(choice == SHOW_ITEMS){
          System.out.println("Current List: ");
            for(int j = 0; j < itemlist.size(); j++){
                 System.out.println(j + ": " + itemlist.get(j));
    }
    System.out.println();

        }else if(choice == EXIT){
          System.out.println("Goodbye.....");
            break;
          }
        }
      }
    }
