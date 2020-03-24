import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Scanner;

public class main_menu {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Player. Welcome to Right or Right, a text adventure based on popular games like zork.");
        System.out.println("First of all: Do you want to start a new game or load a previous one?");
        System.out.println("1) Load a previous game");
        System.out.println("2) Start a new game");
        System.out.print(">> ");
        Scanner in = new Scanner(System.in);
        while(true) {
            String s = in.nextLine();
            if (s.equals("1")) {
                load_game();
                break;
            } else if (s.equals("2")) {
                start_game();
                break;
            } else {
                System.out.println("Invalid number. Enter correct one!");
                System.out.print(">> ");
            }
        }
    }

    public static void start_game() throws IOException {
        System.out.print("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String currentname = s;
        File namedir = new File("saves/" + s + ".txt");
        if (namedir.exists()){
            System.out.println("Savegame with this name already exists!");
            System.out.println("Do you want to load the game or overwrite it?");
            System.out.println("1) Load game");
            System.out.println("2) Overwrite game (start a new one)");
            System.out.print(">> ");
            while(true) {
                s = in.nextLine();
                if (s.equals("1")) {
                    load_game();
                    break;
                } else if (s.equals("2")) {
                    System.out.println("Are you sure you want to delete the game? yes/NO");
                    System.out.println("Remember: Deleting the file is permanent. Which is quite a long time");
                    System.out.print(">> ");
                    s = in.nextLine();
                    if (s.equals("yes")){
                        namedir.delete();
                        System.out.println("New Savegame created. The game will save automatically");
                        Player.player.setName(currentname);
                        save_game();
                        levels.level1();
                        break;
                    }else{
                        System.out.println("Do you want to load the game or overwrite it?");
                        System.out.println("1) Load game");
                        System.out.println("2) Overwrite game (start a new one)");
                        System.out.print(">> ");
                    }
                } else {
                    System.out.println("Invalid number. Enter correct one!");
                    System.out.print(">> ");
                }
            }
        }else {
            System.out.println("Hello " + currentname + ". Welcome to the game");
            System.out.println("New Savegame created. The game will save automatically");
            Player.player.setName(currentname);
            save_game();
            levels.level1();
        }
    }

    public static void load_game() throws IOException {
        System.out.print("Please enter your name: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        File file = new File("saves/" + s + ".txt");
        if (!file.exists()){
            System.out.println("Player doesn't exist");
            System.out.println("Do you want to start a new game or try log in with an other Player?");
            System.out.println("1) Start a new game");
            System.out.println("2) Try an other Playername");
            System.out.println(">> ");
            while(true){
                s = in.nextLine();
                if (s.equals("1")){
                    start_game();
                }else if(s.equals("2")){
                    load_game();
                }else{
                    System.out.println("Invalid number. Enter correct one!");
                    System.out.print(">> ");
                }
            }
        }else{
            BufferedReader inFile = Files.newBufferedReader(Paths.get(String.valueOf(file)), StandardCharsets.UTF_8);

        }
    }

    public static void save_game() throws IOException {
        File file = new File("saves/" + Player.player.getName() + ".txt");
        file.delete();
        file.createNewFile();
        BufferedWriter out = Files.newBufferedWriter(Paths.get(String.valueOf(file)), StandardCharsets.UTF_8);
        out.write("Du hure schreib was°!°1²12");
        out.write(Player.player.getName() + System.lineSeparator());
        out.write(Player.player.getHealth() + System.lineSeparator());
        out.write(Player.player.getMaxhealth() + System.lineSeparator());
        out.write(Player.player.getEffects() + System.lineSeparator());
        out.write((int) Player.player.getCoins());
    }
}
