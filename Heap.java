import java.util.*;

public class Heap {

    public static int KthSmallestNumber(){
        int arr[]={2,55,44,0,8,3,55,7,9};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
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

        int arr[]={2,56,43,0,8,3,55,7,9};
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
    public static void main(String args[]){
       //System.out.println(KthSmallestNumber());
        System.out.println(KthLargestNumber());
       //System.out.println("Hello Wold!");
       
    }
}
