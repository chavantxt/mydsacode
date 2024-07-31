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

    public static int KthClosetNumber(){
        int arr[]={2,56,43,0,8,3,55,7,9};
        int k=3,x=7;

    
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            map.put(Math.abs(x-arr[i]), arr[i]);
            System.out.println(arr[i]);
        }


        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->
            a.getValue().equals(b.getValue())?
            Integer.compare(b.getKey(),a.getKey()):
            Integer.compare(b.getValue(), a.getValue())
            );

            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                pq.add(entry);
                if(pq.size()>k){
                    System.out.println(pq.poll());
                }
            }

      /*       
            while(map.size()>0){
                System.out.println(pq.poll());
            }
*/
        return 0;
    }
    public static void main(String args[]){
       //System.out.println(KthSmallestNumber());
       // System.out.println(KthLargestNumber());
       System.out.println(KthClosetNumber());
       
    }
}
