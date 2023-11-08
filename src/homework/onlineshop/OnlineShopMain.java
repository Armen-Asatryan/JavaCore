package homework.onlineshop;

import homework.onlineshop.model.User;
import homework.onlineshop.storage.UserStorage;

import java.util.Scanner;

public class OnlineShopMain {
    public static class User implements Command {
        private static Scanner scanner = new Scanner(System.in);
        private static UserStorage userStorage = new UserStorage();

        public static void main(String[] args) {
            boolean isRun = true;
            while (isRun){
                Command.printLoginCommands();
                String command = scanner.nextLine();
                switch (command){
                    case EXIT :
                        isRun=false;
                        break;
                    case LOGIN:
                        login();
                        break;
                    case REGISTER:
                        register();
                        break;
                    default:
                        System.out.println("Wrong command!!");
                }
            }


            while (isRun) {
                Command.printAllCommands();
                String command = scanner.nextLine();
                switch (command){


                }






            }
        }

        private static void register() {
        }

        private static void login() {
            
        }

    }

}
