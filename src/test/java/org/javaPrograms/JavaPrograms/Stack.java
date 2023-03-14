package org.javaPrograms.JavaPrograms;
public class Stack
{
    static int[] values = new int[5];

    public static void main(String[] args)
    {
    	
    	///Stack s= new Stack();
    	
        push(5);
       push(7);
//        pop();
//        push(2);
//        push(7);
//        peek();
//        search(1);

    }

    private static int pop()
    {
        //System.out.println();
    	
		return 0;
    }

    private static void push(int value)
    {
    	
    	values[0]=value;
    	values[1]=10;
    	  System.out.println(values);
//    	for(int i=0; i<)
//    	if(values[0]<value) {
//        values[0]=value;
//        values[1]=values[0];
//    	}
        
    }

    private static int peek()
    {
        System.out.println();
		return 0;
    }

    private static void search(int position)
    {
        System.out.println();
    }
}
