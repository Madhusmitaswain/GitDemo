package com.myapp.git.GitDemo;


public class App 
{
	public void addData(String data) {
		System.out.println("data ="+data);
		if(data.equals(Constant.DATA_TYPE))
		{
			System.out.println("welcome");
		}
	}
	public void addedMethod() { 
	System.out.println("welcome again new method added !!!! tHanks");
	}
	public void addedMethod2() { 
		System.out.println("welcome again new method  one more time added !!!! tHanks");
		}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
