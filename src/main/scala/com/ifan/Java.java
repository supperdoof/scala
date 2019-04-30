package com.ifan;

import java.util.*;
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



        System.out.println("=============================");
        int[] ints = {4,1,2,1,2};
        int A = 0;

        //异或运算的一个性质：任何一个数字异或它自己都等于 0。
        for (int j=0; j<ints.length; j++)
        {
            A ^= ints[j];
        }

        System.out.println(A);

        //HashMap 添加元素和计数器
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();


        for (int l=0; l<ints.length; l++)
        {
            try{

                if (map.get(ints[l]) == null)
                {
                    int count = 1;
                    map.put(ints[l],count);

                }else {
                    int count = map.get(ints[l]);
                    count++;
                    map.put(ints[l],count);
                }

            }catch (Exception e){
                System.out.println("Error");
            }

        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if (entry.getValue() == 1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }

        //最长公共前缀
        String[] str2 = {"flower","flow"};
        Set<Character> set = new HashSet<Character>();
        int count = 0;
        StringBuilder stringBuilder1 = new StringBuilder();

        while (true)
        {
            for (String s1 : str2)
            {
                if (count < s1.length())
                {
                    set.add(s1.charAt(count));
                } else {
                    System.out.println(stringBuilder1.toString());
                    break;
                }
            }

            if (set.size() == 1)
            {
                stringBuilder1.append(set.iterator().next());
                set.clear();
            } else {
                System.out.println(stringBuilder1.toString());
                break;
            }
            count++;
        }

        //队列
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(10);
        queue.add(20);
        queue.remove();

        for (int i3=0; i3 < queue.size(); i3++ )
        {
            System.out.println(((LinkedList<Integer>)queue).get(i3));
        }

        //LinkedList基于链表实现
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        for (int i4=0; i4<linkedList.size(); i4++){
            System.out.println(linkedList.get(i4));
        }











    }
}
