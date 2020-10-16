public class VariableLengthArgument {

    int add_num(int ... num)
    {
        int sum = 0 ;
        for(int x:num)
            sum+=x;
        return  sum;
    }
}
