package directoryCreate;
import java.io.File;
public class file {
    public static void main(String[] args) {
        File dir = new File("Persion");
        dir.mkdir();//directory will be created
        String path = dir.getAbsolutePath();

        File file1 = new File(path + "/student.txt");
        File file2 = new File(path + "/Teacher.txt");
        System.out.println(path);

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println(path);

        } catch (Exception e) {
            System.out.println(e);
        }

        file1.delete();
        if (file1.exists()) {
            System.out.println("File is exists");
        }else {
            System.out.println("file is npt exists");
        }
    }
}
