package com.ifan;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java {
    public static void main(String[] args) {
        int i = Scala.add(1,2);

        System.out.println("Scala Result:" + i);
        //Scala.main(args);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10).append(20)
            .append(30)
            .append(40);

        System.out.println(stringBuilder);

        int[] array = new int[2];

        array[0] = 10;
        array[1] = 11;


        for (int x : array)
        {
            System.out.println(x);
        }

        System.out.println("213\n323");


        int[] array1 = {1,2,3,4,5};
        System.out.println(array1.length);

        String s = "acd";

        for(int m=0; m<s.length(); m++)
        {
            s.charAt(m);
        }

        String str = "2314(*)";

        String[] str1 = str.split("\\(");
        for (String ss : str1)
        {
            System.out.println(ss);
        }

        System.out.println("*");

        Pattern PATTERN = Pattern.compile("ds\\s*=\\s*'*\\d+'*");
        String str11 = "INSERT OVERWRITE TABLE aliwx_ods.s_attr_thirdtouserid PARTITION (ds = '20141209') SELECT ds FROM aliwx_ods.s_attr_thirdtouserid WHERE ds = '20141209'";
        Matcher matcher = PATTERN.matcher(str11.toLowerCase());


        List<String> list = new ArrayList<String>();
        while (matcher.find()) {
            list.add(matcher.group());
        }

        for (int j=0; j<list.size(); j++)
        {
            System.out.println(list.get(j));
        }

        System.out.println(" \" \' \n \t \\");
        Pattern pattern = Pattern.compile("\'+\"+");
        Matcher matcher1 = pattern.matcher("\n\t");

        System.out.println(matcher1.find());
        System.out.println(".");




    }
}
