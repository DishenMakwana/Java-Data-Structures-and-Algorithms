import java.util.*;
class Solution 
{
    public static int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq=new LinkedList<>(); 
        int n=a.length;
        if(n <= 1)
            return a;
        int ans[]=new int[n-k+1];     
        int i=0; 
        for(; i<k ; i++) 
        {
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) 
            {
                dq.removeLast();
            }
            dq.addLast(i);
        } 
        System.out.println(dq);
        for(;i<n;i++) 
        { 
            ans[i-k]=a[dq.peekFirst()];
            while(!dq.isEmpty() && dq.peekFirst() <= i-k) 
            { 
                dq.removeFirst();
            } 
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i]) 
            {
                dq.removeLast(); 
            }
            dq.addLast(i);
        }
        System.out.println(dq);
        ans[i-k]=a[dq.peekFirst()];
        return ans;
    } 
    public static void main(String args[]) 
    {
      int a[]={1,3,-1,3,5,3,6,7}; 
      int ans[]=maxSlidingWindow(a,3); 
      for(int i=0;i<ans.length;i++) 
      {
        System.out.print(ans[i] + " ");
      }
    }
}