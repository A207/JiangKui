package exercise;

public class Shuzu 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    int[] arr=new int[]{1,3,4,5,5,5,0,0,6,7,7,11,1,3,3,6,0,5};
    int[] brr=new int[arr.length];
    int index=0;
    for(int i=0;i<arr.length;i++)
     {
    	  boolean c=true;
    	for(int j=0;j<index;j++)
    	{
    		
    	  if(arr[i]==brr[j])
    	  {
    			c=false;
    		    break;
    	  }
    	}
    	 if(c==true)
      	  {
      		brr[index]=arr[i];
      	    index++;
      	  }
     }
    	int[] crr=new int[index];
    	for(int i=0;i<crr.length;i++)
    	{
    		crr[i]=brr[i];
    		System.out.print(crr[i]+"\t");
    	}
    		
	}

}
