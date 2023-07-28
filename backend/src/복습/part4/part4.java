package 복습.part4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class part4 {

	public static void main(String[] args) throws IOException{
		String _path = "C:\\Users\\504\\git\\ez1\\backend\\src\\복습\\part4\\재고관리.txt";
		//20분 +- 1분
		
		ArrayList<String> proList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(_path));
		while(true)
		{
				
			String _str = br.readLine();
			if(_str == null){break;}
				proList.add(_str);				
			}
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("-1: 제품등록 0:결제");
			for(int i=0;i<proList.size();i++)
			{
				System.out.printf(" %d: %s [%s]",i+1,proList.get(i).split(",")[0],proList.get(i).split(",")[1]);
			}
			System.out.println();
			int ch = sc.nextInt();
			sc.nextLine();
			if(ch ==-1)
			{
				br = new BufferedReader(new FileReader(_path));
				String _str ="";
				System.out.println("제품명");
				_str += sc.nextLine()+",";
				System.out.println("가격");
				_str += sc.nextLine()+",";
				System.out.println("초기재고");
				_str += sc.nextLine()+",0";
				BufferedWriter bw = new BufferedWriter(new FileWriter(_path,true));
				bw.newLine();
				bw.write(_str);
				bw.close();
				proList = new ArrayList<String>();
				while(true)
				{
				String __str = br.readLine();
				if(__str == null){break;}
				proList.add(__str);
				
				}
			}
			else if(ch > 0)
			{
				String _str = proList.get(ch-1);
	
				int mx = Integer.parseInt(_str.split(",")[2]);
				int now = Integer.parseInt(_str.split(",")[3]);
				if(mx >= now +1)
				{
					
					String _sav =  _str.substring(0,_str.length()-1);
					proList.set(ch-1,_sav+(now+1));
					System.out.println(_str.split(",")[0]+"담았습니다");
				}else{System.out.println("재고가 부족합니다");}

			}
			if(ch == 0)
			{
				
				int res = 0;
				for(int i=0;i < proList.size();i++)
				{
					int _sav = Integer.parseInt(proList.get(i).split(",")[3]);
					if(_sav > 0)
					{
						res += _sav*Integer.parseInt(proList.get(i).split(",")[1]);
						System.out.printf("\t%s\t%s\t%d\n",proList.get(i).split(",")[0],_sav,_sav*Integer.parseInt(proList.get(i).split(",")[1]));
					}
				}
				System.out.println("총 가격 : "+res);
				System.out.println("투입할금액 입력");
				int money = sc.nextInt();
				if(money >= res)
				{
					System.out.println("결제되었습니다 잔돈 : "+(money-res));
					BufferedWriter bw = new BufferedWriter(new FileWriter(_path));
					for(int i=0;i<proList.size();i++)
					{
						int a = Integer.parseInt(proList.get(i).split(",")[2]);
						int b = Integer.parseInt(proList.get(i).split(",")[3]);
						String __str = proList.get(i).split(",")[0]+","+proList.get(i).split(",")[1]+","+(a-b)+",0";
						bw.write(__str);
						bw.newLine();
						
					}
					bw.close();
				}
				else{
					System.out.println("결제가 실패하였습니다 금액 부족");
					proList = new ArrayList<String>();
					br = new BufferedReader(new FileReader(_path));
					while(true)
					{
						
						String __str = br.readLine();
						if(__str == null){break;}
						proList.add(__str);
				
					}
					System.out.println("?");
				}
			}
			
		}
		
		
		

			
		
	}
	

}
