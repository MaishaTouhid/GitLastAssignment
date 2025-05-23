import java.util.*;

class ListManager {

  // Constants for menu choices
    private static final int ADD_ITEM = 1;
    private static final int REMOVE_ITEM = 2;
    private static final int SHOW_ITEMS = 3;
    private static final int EXIT = 4;

    static Scanner scanner = new Scanner(System.in);
    static List<String> itemList = new ArrayList<>();

public static void main(String[] args) {
      try{
        while (true) {
            int choice = getUserChoice();

            switch (choice) {
                case ADD_ITEM -> addItem();
                case REMOVE_ITEM -> removeItem();
                case SHOW_ITEMS -> showItems();
                case EXIT -> {
                    System.out.println("Goodbye...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.\n");
            }
        }
    } finally{
      scanner.close();
    }
}

   private static int getUserChoice(){
    while(true){
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      System.out.print("Enter your choice: ");
      if(scanner.hasNextInt()){
      int choice = scanner.nextInt();
      scanner.nextLine();
      return choice;
      }else{
        System.out.print("Invalid input. Please enter a number between 1 and 4.\n");
                scanner.nextLine(); 
      }
    }
  }

        private static void addItem(){
            System.out.print("Item Name: ");
            String item = scanner.nextLine();
            itemList.add(item);
            System.out.print("item added.\n");

        }
        
        private static void removeItem(){
          if(itemList.isEmpty()){
            System.out.println("the list is empty.\n");
            scanner.nextLine();
            return;
          }

          while(true){
            System.out.print("Enter Index to remove : ");
            if(scanner.hasNextInt()){
            int index = scanner.nextInt();
            scanner.nextLine();

            if(index >= 0 && index < itemList.size()){
                itemList.remove(index);
                System.out.println("Item removed. \n");
                break;
          }else{
            System.out.println("invalid in dex.\n");
          }
        }else{
          System.out.println("Invalid input.\n");
          scanner.nextLine();
        }
      }

    }
       private static void showItems(){
        if (itemList.isEmpty()) {
            System.out.println("The list is empty.\n");
        } else {
          System.out.println("Current List: ");
          int index = 0;
            for(String item : itemList){
                 System.out.println(index + ": " + item);
                 index++;
          }
        System.out.println();

      }
    }
}
     
    