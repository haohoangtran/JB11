/**
 * Created by tranh on 06-Jul-16.
 */
public class test {
    public static void main(String[] args) {
        String str="";
        for (int i=0;i<1001;i++) {

            str=str+i;
        }
        char[] newArr=str.toCharArray();
        int[] arrDem;
        arrDem=new int[10];
        for (int i=0;i<newArr.length;i++) {
            if (newArr[i]=='0')
                arrDem[0]++;
            if (newArr[i]=='1')
                arrDem[1]++;
            if (newArr[i]=='2')
                arrDem[2]++;
            if (newArr[i]=='3')
                arrDem[3]++;
            if (newArr[i]=='4')
                arrDem[4]++;
            if (newArr[i]=='5')
                arrDem[5]++;
            if (newArr[i]=='6')
                arrDem[6]++;
            if (newArr[i]=='7')
                arrDem[7]++;
            if (newArr[i]=='8')
                arrDem[8]++;
            if (newArr[i]=='9')
                arrDem[9]++;
        }
        for (int i=0;i<10;i++)
            System.out.println("Số "+i+" xuất hiện "+arrDem[i]+" lần!");
    }
}
