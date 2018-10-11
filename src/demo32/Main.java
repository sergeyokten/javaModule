package demo32;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("foobar.txt");
        if (!file.exists()) file.createNewFile();

//        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
//        String message = " oktenweb";
//        byte[] messageBytes = message.getBytes();
//        fileOutputStream.write(messageBytes);
//        fileOutputStream.flush();
//        //.......
//        fileOutputStream.close();

//        FileInputStream fileInputStream = new FileInputStream(file);
//        byte[] answer = new byte[fileInputStream.available()];
//        fileInputStream.read(answer);
//        fileInputStream.close();
//        String output = new String(answer);
//        System.out.println(output);

//        FileWriter fileWriter = new FileWriter(file, true);
//        fileWriter.write("hello oktenweb");
//        fileWriter.flush();
//        fileWriter.close();

//        FileReader fileReader = new FileReader(file);
//        int collector;
//
//        while ((collector = fileReader.read()) != -1) {
//            System.out.println((char) collector);
//        }

//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println("oktenweb");
//        printWriter.println("hello");
//        printWriter.flush();
//        printWriter.close();

//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String line = "";
//
//        while ((line = bufferedReader.readLine())!= null){
//            System.out.println(line);
//        }

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.writeObject(new User(1, "kokos"));
//        objectOutputStream.flush();
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        User user = (User) objectInputStream.readObject();
        System.out.println(user);


    }
}
