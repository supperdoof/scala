package com.ifan;

import java.util.Stack;

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

        int x = 1534236469;

        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
        {
            System.out.println(0);
        }else
        {
            String str = String.valueOf(Math.abs(x));

            Stack<Character> stack = new Stack();

            for(int j=0; j<str.length(); j++)
            {
                stack.push(str.charAt(j));
            }

            if(stack.empty())
            {
                System.out.println(0);
            }else {
                while (stack.peek().equals('0'))
                {
                    stack.pop();
                }

                StringBuilder stringBuilder1 = new StringBuilder();

                while (!stack.empty()) {
                    stringBuilder1.append(stack.pop());
                }
                try {
                    System.out.println(x / Math.abs(x) * Integer.parseInt(stringBuilder1.toString()));
                }catch (Exception e){
                    System.out.println(0);
                }
            }

        }









    }





}
