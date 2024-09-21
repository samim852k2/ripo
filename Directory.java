package directoryCreate;

import java.io.File;

public class Directory {
    public static void main(String[] args) {
        File dir = new File("persion");
        dir.mkdir();//Directory/Folder will be creat
        String DirLocation = dir.getAbsolutePath();

        System.out.println(DirLocation);
        System.out.println(dir.getName());
    }
}
