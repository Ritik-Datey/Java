package com.srd;

public class ConvertVowelsIntoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="genius student";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			if(ch[i]=='a' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='e')
			{
				int con=ch[i]-32;
				ch[i]=(char) con;
			}
			
			int con2=ch[i]+1;
			ch[i]=(char) con2;
			}
		
		}
		
		String s1 = new String(ch);
		
		System.out.println(s1);


	}

}
