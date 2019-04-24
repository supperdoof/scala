package com.ifan;

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

    }
}
