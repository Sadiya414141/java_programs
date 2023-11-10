import java.util.Arrays;
public class StringArrayDemo{
    public static void main(String[] args){
        String[]student=new String[5];
        student[0] = "Sadiya";                       
        student[1] = "Naaz";
        student[2] = "Sifa";
        student[3] = "neha";
        student[4] = "mariya";
        int i = 0;
        while (i < student.length) {
            System.out.print(student[i] + " ");
            i++;
        }
        System.out.println();
    };
};