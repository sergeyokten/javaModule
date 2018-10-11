package demo31;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        File file = new File("D:\\jcx\\javaModule\\test.txt");
//        System.out.println(file.getCanonicalPath());


//        boolean exists = file.exists();
//        if (!exists) {
//            file.createNewFile();
//        }
//        System.out.println(exists);

//        File folder = new File("foo");
//        if (!folder.exists()) folder.mkdir();


//        Properties properties = System.getProperties();
//        for (Object o : properties.keySet()) {
//        }
        String serjZWork = System.getProperty("user.home");
        System.out.println(serjZWork);
        File userFolder = new File(serjZWork);
//        System.out.println(userFolder.length());

//        String[] list = userFolder.list();
//        for (String fileOrFolder : list) {
//            System.out.println(fileOrFolder);
//        }

        File[] files = userFolder.listFiles();
        for (File fileOrFolder : files) {
            String type = null;
            if (fileOrFolder.isFile()) {
                type = "file";
                if (fileOrFolder.getName().equals("test.txt")) {
                    System.out.println("I FOUND IT!!!!!!!!!!!!!!!!!!!!!!!!");
                    fileOrFolder.delete();
                }

            } else {
                type = "folder";
            }

            System.out.println(fileOrFolder.getName() + " " + type);

//            fileOrFolder


        }


    }
}
