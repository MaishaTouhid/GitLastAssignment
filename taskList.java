import java.util.*;
class ListManager {
    static Scanner scanner = new Scanner(System.in);
    static List<String> itemlist = new ArrayList<>();

public static void main(String[] args){
  while(true){
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      int choice = scanner.nextInt();

        if(choice ==1){
            System.out.print("Item Name: ");
            scanner.nextLine();
            itemlist.add(scanner.nextLine());

        }else if(choice ==2){
            System.out.print("I: ");
            int index = scanner.nextInt();
            if(index >=0&&index<itemlist.size()){
                itemlist.remove(index);
      }

        }else if(choice==3){
            for(int j=0;j<itemlist.size();j++){
                 System.out.println(j+": "+itemlist.get(j));
    }

        }else if(choice==4){
            break;
          }
        }
      }
    }
