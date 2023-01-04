package wang.lvshang.blog;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Code {

    public static void main(String[] args) throws IOException {

        File f= new File("d:/avatar.png");

        //??????LOL.exe????FileNotFoundException?????????????????
        new FileInputStream(f);

    }

}

