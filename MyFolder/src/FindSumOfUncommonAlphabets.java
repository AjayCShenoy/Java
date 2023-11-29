import java.util.ArrayList;

public class FindSumOfUncommonAlphabets {
    ArrayList<Character> uncommon=new ArrayList<>();
    for(char c1 : input1)
    {
        //check if c is present in input2 array
        boolean flag=false;
        for(char c2 : input2)
        {
            if(c1==c2)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
            uncommon.add(c1);

    }


    for(char c1 : input2)
    {
        //check if c is present in input1 array
        boolean flag=false;
        for(char c2 : input1)
        {
            if(c1==c2)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
            uncommon.add(c1);

    }

    // System.out.println(uncommon);
    int sum=0;
    for(Character c : uncommon)
    {
        int ascii=c;
        // System.out.println(ascii);
        sum+=ascii;
    }

    while(sum>9)
    {
        String str=sum+"";
        int total=0;
        for(char c : str.toCharArray())
        {
            int digit=c-48;
            total+=digit;
        }
        sum=total;
    }
    return sum;

}
}
