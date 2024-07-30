import java.util.*;

public class Heap {

    public static int KthSmallestNumber(){
        int arr[]={2,55,44,0,8};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]); 
            if(pq.size()>k)
            {
                    pq.poll();
            }
              
        }
        return pq.peek();
    }

    public static int KthLargestNumber(){

        int arr[]={2,3,44,0,8,4};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
               
            if(pq.size()>k)
            {
                if(pq.peek()<arr[i])
                    pq.poll();
            }
            else
               pq.add(arr[i]); 
        }

        return pq.peek();
    } 
    public static void main(String args[]){
       System.out.println(KthSmallestNumber());
       // System.out.println(KthLargestNumber());
       System.out.println("Hello Wold!");
    }
}
