package directoryCreate;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class balmetar {
    public static void main(String[] args) {
        String ID ,name;
        try{
            Formatter formet = new Formatter("C:/Users/User/Desktop/bal/First/persion/student.txt");
            Scanner in = new Scanner(System.in);

            System.out.println("How many student : ");
            int num = in.nextInt();

            for(int i=0 ; i<num ;i++)
            {
                System.out.print("Enter student Id amd mame: ");
               ID = in.next();
               name = in.next();
               formet.format("%s %s\r\n",ID,name);
            }
                    formet.close();
        }catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
