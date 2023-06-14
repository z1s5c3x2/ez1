import java.util.ArrayList;;

public class 0612
{
    public static void Quiz1()
    {
        
        System.out.println("-----------문제1------------");
        // boolean
        boolean boolmin = false;
        boolean boolmax = true;
        System.out.printf("boolean : %b ~ %b\n",boolmin,boolmax);
        //char
        char charmin = (char)0;
        char charmax = (char)65535;
        System.out.printf("char : %c ~ %c\n",charmin,charmax);

        //byte
        byte bytemin = (byte)-128;
        byte bytemax = (byte)127;
        System.out.printf("byte : %d ~ %d\n",bytemin,bytemax);

        ///short
        short shortmin = -32768;
        short shortmax = 32767;
        System.out.printf("short : %d ~ %d\n",shortmin,shortmax);

        ///int
        int intmin = -2147483648;
        int intmax = 2147483647;
        System.out.printf("int : %d ~ %d\n",intmin,intmax);

        ///long
        long longmin = -9223372036854775808l;
        long longtmax = 9223372036854775807l;
        System.out.printf("long : %d ~ %d\n",longmin,longtmax);
        
        //float
        float floatmin = -3.4028235E38f;
        float floatmax = 3.4028235E38f;
        System.out.printf("float : %e ~ %e\n",floatmin,floatmax);
        
        //double
        double doublemin = -1.7976931348623157E308d;
        double doublemax = 1.7976931348623157E308;
        System.out.printf("double : min : %e ~ %e\n",doublemin,doublemax);
    }

    public static void Quiz2(long _long1,long _long2)
    {
        
        System.out.println("-----------문제2(long형)------------");
        if(9223372036854775807l -_long1 < _long2)
        {
            //String _str1 = String.valueOf(_long1);
            //String _str2 = String.valueOf(_long2);
            String _str1 = "465867964129876412368974326789234167892341967465867964129876412368974326789234167892341967823419687324196783412432675123876452134672446586796412987641236897432678923416789234196782341968732419678341243267512387645213467248234196873241967834124326751238764521346724";
            String _str2 = "435867964129876412368974326789234167892341967823419687324196783412432675123876446586796412987641236897432678923416789234196782341968732419678341243267512387645213467244658679641298764123689743267892341678923419678234196873241967834124326751238764521346724521346724";
            ArrayList<Integer> listInt = new ArrayList<Integer>();
            
            int _str1len = _str1.length()-1;
            int _str2len = _str2.length()-1;

            int lenmax = (_str1len >  _str2len ? _str1len : _str2len);

            int _sav = 0;
            int _num1 = 0;
            int _num2 = 0;

            for(int x = lenmax ; x>=0 ;x--)
            {
                _num1 = 0;
                _num2 = 0;
                if(x <=_str1len)
                {
                    _num1 = Character.getNumericValue(_str1.charAt(x));

                }
                if(x <=_str2len)
                {
                    _num2 = Character.getNumericValue(_str2.charAt(x));

                }
                listInt.add((_num1+_num2+_sav)%10);
                _sav = (int)((_num1+_num2+_sav)/10);
                
            } 
            if(_sav > 0)
            {
                listInt.add(_sav);
            }       
            for(int x = listInt.size()-1; x>=0;x--)
            {
                System.out.print(listInt.get(x));
            }

            System.out.println("\n-----------문제2(double형)------------");
            int deciamlCount = 30;
            System.out.println("소수점 자리수: " + deciamlCount);

            for (int x = listInt.size() - 1; x >= 0; x--) 
            {
                if(listInt.size() - 1-x == deciamlCount)
                {
                    System.out.print('.');
                }
                System.out.print(listInt.get(x));
            }

        }
        else
        {
            System.out.printf("%d\n",_long1+_long2);
        }

        
    }

    public static void main(String[] args)
    {
        Quiz1();// 1. 자바 모든 자료형들의 데이터 저장 범위내 최소값과 최대값을 저장하는 변수와 출력하기
        Quiz2(9223372036854775807l,9223372036854775807l);//2. long , double 데이터저장범위내 초과를 저장할 경우의 대책 및 방법

        

    }
}