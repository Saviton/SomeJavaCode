package ClientsDB;


import User.*;

import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ClientsDB {

    /**
     * путь к файлу с данными админов
     */
    private String PathToAdmins = "AdminsDB.txt";
    /**
     * путь к файлу с данными пользователей
     */
    private String PathToUsers = "UsersDB.txt";
    /**
     * лист хранит данные о всех админах
     */
    private List<Admin> admins = new ArrayList<>();
    /**
     * лист хранит данные о всех пользователях
     */
    private List<User> users = new ArrayList<>();

    public static String md5Custom(String st) {
        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            // тут можно обработать ошибку
            // возникает она если в передаваемый алгоритм в getInstance(,,,) не существует
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while (md5Hex.length() < 32) {
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }

    public ClientsDB() {
        loading();
    }

    private void addClient() {
        System.out.println(" Для создания клиента введите:\n" +
                "1 - для создания admin-a\n" +
                "2 - для создания user-a");

        int chose;
        Scanner in = new Scanner(System.in);
        chose = parseInt(in.nextLine());

        System.out.println("Введите имя пользователя:");
        String login = in.nextLine();

        System.out.println("Введите пароль:");
        String pas = in.nextLine();
        pas = md5Custom(pas);

        System.out.println("Введите email:");
        String email = in.nextLine();

        if (chose == 1) {
            Admin admin = new Admin(login, pas, email);
            for (Admin client : admins) {
                if (client.equals(admin))
                    break;
            }
            admins.add(admin);
            save();
        } else if (chose == 2) {
            User user = new User(login, pas, email);
            for (User client : users) {
                if (client.equals(user))
                    break;
            }
            users.add(user);
            save();
        }

    }

    //TODO после шифрования пароля, эту функцию нужно изменить
    private void save() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PathToAdmins))) {
            for (Admin admin : admins) {
                bw.write(admin.toString());
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PathToUsers))) {
            for (User user : users) {
                bw.write(user.toString());
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void registration() {
        System.out.println(" *** Окно регитрации: ***");
        addClient();
    }

    //TODO после шифрования пароля, эту функцию нужно изменить
    private void loading() {
        /** загрузка админов */
        try (BufferedReader br = new BufferedReader(new FileReader(PathToAdmins))) {
            //Считывание первого разделителя.
            br.readLine();
            String s = "";
            while (s != null) {
                Admin admin = new Admin(br.readLine(), br.readLine(), br.readLine());
                admins.add(admin);
                //считывание разделителя между книгами, и последний System.lineSeparator(), в конце файла
                s = br.readLine();

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        /** загрузка пользователей*/
        try (BufferedReader br = new BufferedReader(new FileReader(PathToUsers))) {
            //Считывание первого разделителя.
            br.readLine();
            String s = "";
            while (s != null) {
                User user = new User(br.readLine(), br.readLine(), br.readLine());
                users.add(user);
                //считывание разделителя между книгами, и последний System.lineSeparator(), в конце файла
                s = br.readLine();

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public Client signIn() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String login = in.nextLine();
        System.out.println("Введите пароль: ");
        String pas = in.nextLine();
        pas = md5Custom(pas);
        for (Admin admin : admins) {
            if (admin.getNickname().equalsIgnoreCase(login) && admin.getPassword().equalsIgnoreCase(pas))
                return admin;
        }

        for (User user : users) {
            if (user.getNickname().equalsIgnoreCase(login) && user.getPassword().equalsIgnoreCase(pas))
                return user;
        }

        //в случае если совпадений не найдено
        return null;
    }
}
