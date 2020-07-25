package com.capg;

public class CommandLine {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t1="";
		for(int i=0;i<args.length;i++) {
			for(int j=1;j<(args.length-i);j++) {
				if(args[j-1].length()>args[j].length()) {
					t1=args[j-1];
					args[j-1]=args[j];
					args[j]=t1;
				}
			}
		}
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}

	}

}
	
	
	
	
	

