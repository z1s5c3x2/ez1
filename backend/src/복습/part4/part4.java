package 복습.part4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class part4 {

	public static void main(String[] args) throws IOException{
		String _path = "C:\\Users\\504\\git\\ez1\\backend\\src\\복습\\part4\\재고관리.txt";
		String[] ProList = new String[100];
		int[] _blist = new int[100];
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.print("-1: 제품등록 0:결제 ");
			BufferedReader br = new BufferedReader(new FileReader(_path));
			int cnt = 0;
			while(true)
			{
				String _str = br.readLine();
				if(_str == null)
				{
					break;
				}
				else{
					
					String __str = _str.split(",")[1];
					if(Integer.parseInt(_str.split(",")[2]) == 0)
					{
						__str = "재고없음";
					}
					System.out.printf("%d: %s[%s] ",cnt+1,_str.split(",")[0],__str);
					ProList[cnt] = _str;
					cnt ++;

				}
			}

			
			System.out.print("\n>>>> 선택 : ");
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch == -1)
			{
				cnt +=1;
				ProList[cnt] = "";
				System.out.println("제품명:");
				ProList[cnt] += sc.nextLine()+",";
				System.out.println("가격: ");
				ProList[cnt] += sc.nextLine()+",";
				System.out.println("초기재고: ");
				ProList[cnt] += sc.nextLine()+",0";
				System.out.println("안내) 제품이 등록되었습니다");
				BufferedWriter bw = new BufferedWriter(new FileWriter(_path,true));
				bw.newLine();
				bw.write(ProList[cnt]);
				bw.close();
			}
			if(ch >0)
			{
				String _str = ProList[ch-1];
				int mx = Integer.parseInt( _str.split(",")[2]);
				
				if(_blist[ch-1]+1 <= mx)
				{
					System.out.printf("%s 담았습니다\n",_str.split(",")[0]);
					_blist[ch-1] ++;
					
				}else{System.out.println("재고가 부족합니다");}
			}
			else if(ch==0)
			{
				int res = 0;
				for(int i=0;i<ProList.length;i++)
				{
					if(ProList[i] == null){break;}
					if( _blist[i] > 0)
					{
						res += Integer.parseInt(ProList[i].split(",")[1])*_blist[i];
						System.out.printf("\t%s\t%d\t%d\n",ProList[i].split(",")[0],_blist[i],Integer.parseInt(ProList[i].split(",")[1])*_blist[i]);
					}
				}
				System.out.println("총 가격 : "+res);
				int money = sc.nextInt();
				if(money>=res)
				{
					System.out.println("결제되었습니다 거스름돈 ->"+(money-res));
					BufferedWriter bw = new BufferedWriter(new FileWriter(_path));
					for(int i=0;i<ProList.length;i++)
					{
						if(ProList[i] ==null){break;}
						bw.write(ProList[i].split(",")[0]+","+ProList[i].split(",")[1]+","+(Integer.parseInt(ProList[i].split(",")[2])-_blist[i])+",0" );
						bw.newLine();
						_blist[i] = 0;
					}
					bw.close();
				}else{System.out.println("잔액이 부족합니다");
				_blist = new int[100];
			}
			}

			
		}
	}

}
